package sn.esmt.rechercheemploi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sn.esmt.rechercheemploi.adresseip.Url;
import sn.esmt.rechercheemploi.httpconfig.Api;
import sn.esmt.rechercheemploi.httpconfig.UsersApiResponse;

public class VisualisationActivity extends AppCompatActivity {
    private EditText emailTxt;
    private Button loginBt;
    private Button retourBt;
    Url url = new Url();// une intance de la classe url qui retourne l'adresse ip

    @Override
    //création de l'activité
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() de la classe parente
        // AppCompatActivity et définissent le contenu de
        // l'activité en utilisant le fichier de présentation activity_main.xml.
        super.onCreate(savedInstanceState);
        //La méthode setContentView() permet de définir le layout XML
        // l'interface utilisateur de l'application sera créée en utilisant
        // les éléments définis dans le fichier de layout activity_main.xml.
        setContentView(R.layout.visualisation_main);
        //Definition des Widgets
        //Recuperation des elements correspondants dans le fichier
        //de présentation activity_main.xml.
        emailTxt = (EditText) findViewById(R.id.editTextEmail);
        loginBt = (Button) findViewById(R.id.loginButton);
        retourBt = (Button) findViewById(R.id.retourButton);

        //Ceci définit un événement de clic sur le bouton de connexion.
        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Récupération des valeurs saisies pour l'email
                String email = emailTxt.getText().toString();

                //Création de l'objet Retrofit pour accéder à l'API
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(url.getUrl()) //URL de base de l'API
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                //Crée une instance de l'interface Api,
                //qui définit les méthodes pour les appels HTTP.
                Api api = retrofit.create(Api.class);

                //creation d'un objet Call pour l'appel à la méthode login() de l'interface Api.
                //Call<UsersApiResponse> call = api.login(email, password);
                Call<UsersApiResponse> call = api.login(email);

                call.enqueue(new Callback<UsersApiResponse>() {
                    @Override
                    public void onResponse(Call<UsersApiResponse> call, Response<UsersApiResponse> response) {
                        if (response.isSuccessful()) {
                            Log.d("Response :", response.body().toString());
                            String message = response.body().getMessage();
                            String email = response.body().getEmail();
                            if (message.equals("OK")) {
                                Intent intent = new Intent(VisualisationActivity.this, WelcomeActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(VisualisationActivity.this, "Email ou Mot de Passe incorrect", Toast.LENGTH_LONG).show();
                            }

                        } else {
                            Log.d("error message exception", response.toString());

                        }
                    }

                    @Override
                    public void onFailure(Call<UsersApiResponse> call, Throwable t) {
                        Log.d("Error : ", t.getMessage());
                        //D/Error :: CLEARTEXT communication to 192.168.90.167 not permitted by network security policy
                        Toast.makeText(VisualisationActivity.this, "Impossible d'acceder au serveur !", Toast.LENGTH_LONG).show();
                    }

                });
            }
        });

        retourBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}