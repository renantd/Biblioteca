package br.sofex.com.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Intente {

    Context mContext;
    Intente(Context context)
    {this.mContext = context;}


    //TODO: Intent pegar Dados da outra activity
    public void EnviarParaActivity(String Nome_da_tag_envio ,String valor_da_tag_envio, final Context context, final Class Destino ){
        Intent intent = new Intent(context,Destino);
        intent.putExtra(Nome_da_tag_envio,valor_da_tag_envio);
        context.startActivity(intent);
    }
    public String ReceberDadosActivity(Context context, String Nome_da_tag_envio, Intent intent)
    {
        try {
            String i = intent.getExtras().getString(Nome_da_tag_envio);
            if(i != null){return i;}
            else{Toast.makeText(context, " Nenhum valor retornado !", Toast.LENGTH_SHORT).show();return null;}
        }
        catch (NullPointerException NP_ex)
        {Toast.makeText(context, " Error NP_ex :"+NP_ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error NP_ex : "+NP_ex); return null; }

        catch (Exception ex)
        {Toast.makeText(context, " Error ex :"+ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error ex : "+ex); return null; }

    }
    public String ReceberDadosActivity2(Context context, String Nome_da_tag_envio)
    {
        try {
            if(Nome_da_tag_envio != null){return Nome_da_tag_envio;}
            else{Toast.makeText(context, " Nenhum valor retornado !", Toast.LENGTH_SHORT).show();return null;}
        }
        catch (NullPointerException NP_ex)
        {Toast.makeText(context, " Error NP_ex :"+NP_ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error NP_ex : "+NP_ex); return null; }

        catch (Exception ex)
        {Toast.makeText(context, " Error ex :"+ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error ex : "+ex); return null; }

    }


    //TODO : Backup
    /*public void EnviarParaActivity1(String Nome_da_tag_envio ,String valor_da_tag_envio, final Context context, final Class Destino ){
        Intent intent = new Intent(context,Destino);
        intent.putExtra(Nome_da_tag_envio,valor_da_tag_envio);
        startActivity(intent);
    }
    public String ReceberDadosActivity1(Context context, String Nome_da_tag_envio )
    {
        try {

            String i = getIntent().getExtras().getString(Nome_da_tag_envio);
            if(i != null){return i;}
            else{Toast.makeText(context, " Nenhum valor retornado !", Toast.LENGTH_SHORT).show();return null;}

        }
        catch (NullPointerException NP_ex)
        {Toast.makeText(context, " Error NP_ex :"+NP_ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error NP_ex : "+NP_ex); return null; }

        catch (Exception ex)
        {Toast.makeText(context, " Error ex :"+ex, Toast.LENGTH_SHORT).show();
            Log.e("App1","Error ex : "+ex); return null; }

    }*/

}
