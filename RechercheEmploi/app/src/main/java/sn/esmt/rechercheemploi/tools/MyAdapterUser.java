package sn.esmt.rechercheemploi.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sn.esmt.rechercheemploi.R;
import sn.esmt.rechercheemploi.httpconfig.UsersResponse;

public class MyAdapterUser extends BaseAdapter {

    private ArrayList<UsersResponse> users;
    private LayoutInflater myInflater;

    public MyAdapterUser(Context context, ArrayList<UsersResponse> users)
    {
        this.myInflater = LayoutInflater.from(context);
        this.users = users;
    }

    @Override
    public int getCount() {
        return this.users.size();
    }

    @Override
    public Object getItem(int arg0) {
        return this.users.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        //TextView textid;
        //TextView textemail;
        TextView textpwd;

        TextView textfirstname;
        TextView textlastname;
        TextView textbirthdate;
        TextView textgenre;

        TextView textid;
        TextView textnom;
        TextView textprenom;

        TextView textage;
        TextView textadresse;
        TextView textemail;
        TextView texttelephone;
        TextView textspecialite;
        TextView textniveauEtude;
        TextView textexperienceProfessionnelle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null)
        {
            //convertView = myInflater.inflate(R.layout.listitem_user, null);
            //holder = new ViewHolder();
            //holder.textid = (TextView) convertView.findViewById(R.id.txtid);
            //holder.textemail = (TextView) convertView.findViewById(R.id.txtemail);
            //holder.textpwd = (TextView) convertView.findViewById(R.id.txtpwd);
            //holder.textfirstname = (TextView) convertView.findViewById(R.id.txtfirstname);
            //holder.textlastname = (TextView) convertView.findViewById(R.id.txtlastname);
            //holder.textbirthdate = (TextView) convertView.findViewById(R.id.txtbirthdate);
            //holder.textgenre = (TextView) convertView.findViewById(R.id.txtgenre);

            convertView = myInflater.inflate(R.layout.listitem_user, null);
            holder = new ViewHolder();
            holder.textid = (TextView) convertView.findViewById(R.id.txtid);
            holder.textnom = (TextView) convertView.findViewById(R.id.txtnom);
            holder.textprenom = (TextView) convertView.findViewById(R.id.txtprenom);
            holder.textage = (TextView) convertView.findViewById(R.id.txtage);
            holder.textadresse = (TextView) convertView.findViewById(R.id.txtadresse);
            holder.textemail = (TextView) convertView.findViewById(R.id.txtemail);
            holder.texttelephone = (TextView) convertView.findViewById(R.id.txttelephone);
            holder.textspecialite = (TextView) convertView.findViewById(R.id.txtspecialite);
            holder.textniveauEtude = (TextView) convertView.findViewById(R.id.txtniveauEtude);
            holder.textexperienceProfessionnelle = (TextView) convertView.findViewById(R.id.txtexperienceProfessionnelle);
            convertView.setTag(holder);
            //convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //holder.textid.setText(users.get(position).getId()+"");
        //holder.textemail.setText(users.get(position).getEmail());
        //holder.textpwd.setText(users.get(position).getPassword());
        //holder.textfirstname.setText(users.get(position).getFirstName());
        //holder.textlastname.setText(users.get(position).getLastName());
        //holder.textbirthdate.setText(users.get(position).getBirthDate());
        //holder.textgenre.setText(users.get(position).getGenre());

        holder.textid.setText(users.get(position).getId()+"");
        holder.textnom.setText(users.get(position).getNom());
        holder.textprenom.setText(users.get(position).getPrenom());
        holder.textage.setText(users.get(position).getAge()+"");
        holder.textadresse.setText(users.get(position).getAdresse());
        holder.textemail.setText(users.get(position).getEmail());
        holder.texttelephone.setText(users.get(position).getTelephone()+"");
        holder.textspecialite.setText(users.get(position).getSpecialite());
        holder.textniveauEtude.setText(users.get(position).getNiveauEtude());
        holder.textexperienceProfessionnelle.setText(users.get(position).getExperienceProfessionnelle());

        return convertView;

    }

}

