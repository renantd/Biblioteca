package br.sofex.com.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Destino extends AppCompatActivity {

    TextView tv1;
    Button bt1;
    Intente  intente  = new  Intente(Destino.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        tv1 = findViewById(R.id.tv1);
        bt1 = findViewById(R.id.bt1);

        Intent intent1 = getIntent();
        final String str = intente.ReceberDadosActivity(Destino.this,"edt1",intent1);
        tv1.setText(str);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            intente.EnviarParaActivity("edt1",str,Destino.this,MainActivity.class);
            }
        });

    }



}
