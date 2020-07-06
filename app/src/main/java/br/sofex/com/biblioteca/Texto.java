package br.sofex.com.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Texto {


    Context mContext;

    Texto(Context context)
    {this.mContext = context;}

    //TODO: EditText Evento
    public String EditText_returnvalue(android.widget.EditText edt, Context context){
        if (EditTextValue_isvalid(edt,context) == true)
        {return  edt.getText().toString();}
        else{
            Toast.makeText(context, " Campo em branco .\n Favor digitar algum valor ! ", Toast.LENGTH_SHORT).show();  return  null;}
    }
    public Boolean EditTextValue_isvalid(android.widget.EditText edt, Context context){
        if (EditText_isNotNull(edt) == true)
        {Toast.makeText(context, " Ok "+edt.getText().toString(), Toast.LENGTH_SHORT).show(); return  true;}
        else{Toast.makeText(context, " Campo em branco .\n Favor digitar algum valor ! ", Toast.LENGTH_SHORT).show();  return  false;}
    }
    public boolean EditText_isNotNull(android.widget.EditText edt){
        if (!edt.getText().toString().isEmpty()) {return true;}
        else{return false;}
    }

}
