package sn.esmt.rechercheemploi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import sn.esmt.rechercheemploi.httpconfig.UsersResponse;

public class IndiaEmploiActivity extends ListActivity {

    TextView selection;
    String[] items={ "Data analyst", " Data scientist", "Architecte Big Data",
    "Chatbot master", "Ethicien / Ethicienne en intelligence artificielle (IA)",
    "Développeur de logiciel en IA", "Spécialiste en apprentissage automatique",
    "Chercheur en IA ", "Ingénieur biomédical en IA", "Chercheur en bio-informatique "};
    private Button retourBt;
    private Button candidaterBt;
    private UsersResponse usersResponse; // declaration d'un objet de type UsersResponse

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_emploi);
        retourBt = (Button) findViewById(R.id.retourButton);
        candidaterBt = (Button) findViewById(R.id.candidaterButton);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,items)
        );
        selection=(TextView)findViewById(R.id.selection);

        candidaterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndiaEmploiActivity.this,RegisterActivity.class);
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

        Intent intent = new Intent(IndiaEmploiActivity.this,DescriptionActivity.class);
        startActivity(intent);
    }
}