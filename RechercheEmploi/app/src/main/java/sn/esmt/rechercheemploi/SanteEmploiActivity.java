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

public class SanteEmploiActivity extends ListActivity {

    TextView selection;
    String[] items={ "Médecin", "Infirmier(ère)", "Pharmacien(ne)", "Chirurgien(ne)",
    "Technicien(ne) de laboratoire médical ", "Thérapeute",
    "Administrateur(trice) des soins de santé"};
    private Button retourBt;
    private Button candidaterBt;
    private UsersResponse usersResponse; // declaration d'un objet de type UsersResponse

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sante_emploi);
        retourBt = (Button) findViewById(R.id.retourButton);
        candidaterBt = (Button) findViewById(R.id.candidaterButton);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,items)
        );
        selection=(TextView)findViewById(R.id.selection);

        candidaterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SanteEmploiActivity.this,RegisterActivity.class);
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

        Intent intent = new Intent(SanteEmploiActivity.this,DescriptionActivity.class);
        startActivity(intent);
    }
}