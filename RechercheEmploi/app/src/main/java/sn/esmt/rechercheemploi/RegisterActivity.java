package sn.esmt.rechercheemploi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sn.esmt.rechercheemploi.adresseip.Url;
import sn.esmt.rechercheemploi.httpconfig.Api;
import sn.esmt.rechercheemploi.httpconfig.UsersResponse;

public class RegisterActivity extends AppCompatActivity {
    private Button registryBt;
    private Button retourBt;
    private EditText nomTxt;
    private EditText prenomTxt;
    private EditText ageTxt;
    private EditText adresseTxt;
    private EditText emailTxt;
    private EditText specialiteTxt;
    private EditText telephoneTxt;
    private EditText niveauEtudeTxt;
    private EditText experienceProfessionnelleTxt;
    ProgressDialog dialog; // uiliser pour afficher un message
    private UsersResponse usersResponse;
    Url url = new Url(); // une intance de la classe url qui retourne l'adresse ip

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nomTxt = (EditText) findViewById(R.id.editnomTxt);
        prenomTxt = (EditText) findViewById(R.id.editprenomTxt);
        ageTxt = (EditText) findViewById(R.id.editageTxt);
        adresseTxt = (EditText) findViewById(R.id.editadresseTxt);
        emailTxt = (EditText) findViewById(R.id.editemailTxt);
        specialiteTxt = (EditText) findViewById(R.id.editspecialiteTxt);
        telephoneTxt = (EditText) findViewById(R.id.edittelephoneTxt);
        niveauEtudeTxt = (EditText) findViewById(R.id.editniveauEtudeTxt);
        experienceProfessionnelleTxt = (EditText) findViewById(R.id.editexperienceProfessionnelleTxt);
        registryBt = (Button) findViewById(R.id.registryButton);
        retourBt = (Button) findViewById(R.id.retourButton);
        retourBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        registryBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si le boutton register est cliquer,
                usersResponse = new UsersResponse();
                String nom = nomTxt.getText().toString();
                String prenom = prenomTxt.getText().toString();
                int age = Integer.parseInt(ageTxt.getText().toString());
                String adresse = adresseTxt.getText().toString();
                String email = emailTxt.getText().toString();
                int telephone = Integer.parseInt(telephoneTxt.getText().toString());
                String specialite = specialiteTxt.getText().toString();
                String niveauEtude = niveauEtudeTxt.getText().toString();
                String experienceProfessionnelle = experienceProfessionnelleTxt.getText().toString();

                usersResponse.setNom(nom);
                usersResponse.setPrenom(prenom);
                usersResponse.setAge(age);
                usersResponse.setAdresse(adresse);
                usersResponse.setEmail(email);
                usersResponse.setTelephone(telephone);
                usersResponse.setSpecialite(specialite);
                usersResponse.setNiveauEtude(niveauEtude);
                usersResponse.setExperienceProfessionnelle(experienceProfessionnelle);

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(url.getUrl())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                Api api = retrofit.create(Api.class);

                Call<UsersResponse> call = api.save(usersResponse);
                call.enqueue(new Callback<UsersResponse>() {
                    @Override
                    public void onResponse(Call<UsersResponse> call, Response<UsersResponse> response) {
                        if (response.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "Votre demande a bien éte prise en compte", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(RegisterActivity.this, "Echec de l'envoi", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<UsersResponse> call, Throwable t) {
                        Toast.makeText(RegisterActivity.this, "Votre CV existe déjà dans la base", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }



}