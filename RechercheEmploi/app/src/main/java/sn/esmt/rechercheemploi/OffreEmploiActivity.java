package sn.esmt.rechercheemploi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OffreEmploiActivity extends AppCompatActivity {
    private Button developpeur;
    private Button sante;
    private Button telecom;
    private Button india;
    private Button retour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offre_emploi);
        developpeur = (Button) findViewById(R.id.devButton);
        sante = (Button) findViewById(R.id.santeButton);
        telecom = (Button) findViewById(R.id.telecomButton);
        india = (Button) findViewById(R.id.indiaButton);
        retour = (Button) findViewById(R.id.retourButton);

        developpeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffreEmploiActivity.this, DevEmploiActivity.class);
                startActivity(intent);
            }
        });

        sante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffreEmploiActivity.this, SanteEmploiActivity.class);
                startActivity(intent);
            }
        });

        telecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffreEmploiActivity.this, TelecomEmploiActivity.class);
                startActivity(intent);
            }
        });

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffreEmploiActivity.this, IndiaEmploiActivity.class);
                startActivity(intent);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}