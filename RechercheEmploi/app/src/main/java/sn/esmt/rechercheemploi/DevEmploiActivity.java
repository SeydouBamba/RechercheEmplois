package sn.esmt.rechercheemploi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import sn.esmt.rechercheemploi.httpconfig.UsersResponse;

public class DevEmploiActivity extends ListActivity {
    TextView selection;
    String[] items={ "Stagiaire Développeur Mobile & Web - H/F", "Responsable Stockage et Backup Sénior",
            "Backend Senior Developer", "DevOps Junior", "Ingenieur en Virtualisation CITRIX",
            "Responsable Développement logiciel", "IT System & Network Administrator",
            "Senior Developer Productivity Engineer", "Ingenieur Etudes et Developpement Web Front-End", "Développeur Back End Symfony",
            "Ingenieur Etudes et Developpement Web Back-end", };
    private Button retourBt;
    private Button candidaterBt;
    private UsersResponse usersResponse; // declaration d'un objet de type UsersResponse

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_emploi);
        retourBt = (Button) findViewById(R.id.retourButton);
        candidaterBt = (Button) findViewById(R.id.candidaterButton);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,items)
        );
        selection=(TextView)findViewById(R.id.selection);

        candidaterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DevEmploiActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        retourBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();;
            }
        });
    }
    public void onListItemClick(ListView parent, View v, int position, long id) {
        selection.setText(items[position]);

        Intent intent = new Intent(DevEmploiActivity.this,DescriptionActivity.class);
        startActivity(intent);
    }
}