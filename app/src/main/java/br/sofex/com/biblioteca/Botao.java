package br.sofex.com.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Botao {

    Context mContext;

    Botao(Context context)
    {this.mContext = context;}


    //TODO: Botão Evento
    public void BotaoRedirecionar(Button btn, final Context context, final Class Destino ){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Destino);
                context.startActivity(intent);
            }
        });
    }
    public void BotaoRedirecionarIntent (Button btn, final String Nome_da_tag_envio , final String valor_da_tag_envio, final Context context, final Class Destino ){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Destino);
                intent.putExtra(Nome_da_tag_envio,valor_da_tag_envio);
                context.startActivity(intent);
            }
        });
    }

}
