package sn.esmt.rechercheemploi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button visualiserBt;
    private  Button offreBt;
    private Button candidaterBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visualiserBt = (Button) findViewById(R.id.visualiserButton);
        offreBt = (Button) findViewById(R.id.offreButton);

        visualiserBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VisualisationActivity.class);
                startActivity(intent);
            }
        });

        offreBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OffreEmploiActivity.class);
                startActivity(intent);
            }
        });

    }


}