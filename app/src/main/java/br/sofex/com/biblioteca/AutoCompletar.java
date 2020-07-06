package br.sofex.com.biblioteca;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.List;

public class AutoCompletar {

    Context mContext;
    AutoCompletar(Context context)
    {this.mContext = context;}

    public AutoCompleteTextView AutoCompletar(List<String> Lista_de_Itens, AutoCompleteTextView actv, Integer cor,String Texto_Mascara,Integer font_size){
        //Creating the instance of ArrayAdapter containing list of fruit names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this.mContext, android.R.layout.select_dialog_item, Lista_de_Itens);
        //Getting the instance of AutoCompleteTextView
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);//TODO: seta cor do texto
        actv.setText(null);//TODO: limpar o campo
        actv.setHint(Texto_Mascara);//TODO: Seta o texto da mascara
        actv.setHintTextColor(cor);//TODO: Seta a cor do texto de mascara
        actv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);//TODO: Seta o alinhamento do texto
        actv.setTextSize(font_size);//TODO: Seta o tamanho do texto
        actv.setTextColor(cor); //TODO: Seta a cor do texto
        return actv;
    }


}
