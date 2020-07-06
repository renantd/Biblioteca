package br.sofex.com.biblioteca;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class RadioBotao {

    Context mContext;
    Cores  cores;
    LayoutInflater inflater;
    ViewGroup container;
    RadioBotao(Context context)
    {this.mContext = context; cores = new Cores(context);}

    public RadioButton RadioButtonColor(RadioButton rb1, Integer cor_valor){
        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                  new int[]{-android.R.attr.state_enabled}, //disabled
                  new int[]{android.R.attr.state_enabled} //enabled
                },
                new int[] {
                 cores.CorBlack, //disabled
                  cor_valor //enabled
                }
        );
        rb1.setButtonTintList(colorStateList);
        return rb1;
    }
    public void Lista_RadioButtonColor(List<RadioButton> rb1, Integer cor_valor){

        for(RadioButton rab1 : rb1){
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                       new int[]{-android.R.attr.state_enabled}, //disabled
                       new int[]{android.R.attr.state_enabled} //enabled
                    },
                    new int[] {
                       cores.CorBlack, //disabled
                       cor_valor //enabled
                    }
            );
            rab1.setButtonTintList(colorStateList);
        }
    }
    public void RadioButtonSexo_GetTexto(final RadioGroup rg1, final RadioButton masculino, final RadioButton feminino){

        masculino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = rg1.getCheckedRadioButtonId();


                Toast.makeText(mContext, masculino.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        feminino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = rg1.getCheckedRadioButtonId();


                Toast.makeText(mContext,feminino.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
