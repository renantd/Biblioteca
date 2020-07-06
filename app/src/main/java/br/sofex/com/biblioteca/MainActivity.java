package br.sofex.com.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements SlideToUnlock.OnSlideToUnlockEventListener {

    EditText Nome;
    EditText CPF;
    EditText Edit_sendValue;

    Spinner Spin_teste;
    ImageView Imageview1;
    AutoCompleteTextView actv;
    SlideToUnlock slideToUnlockView;

    RadioGroup radiogroup1;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;

    WebView webview;
    RelativeLayout Rl_part1;

    Button btn_check;
    Button Btn_sendIntent;
    Button Redirecionar;
    Button Btn_Spinner;
    /*Botao    botao  = new  Botao(MainActivity.this);
    Texto    texto  = new  Texto(MainActivity.this);
    Intente  intente  = new  Intente(MainActivity.this);
    Cores  cores  = new  Cores(MainActivity.this);
    RadioBotao  radiobotao  = new  RadioBotao(MainActivity.this);
    ComboBox  caixaselecao  = new  ComboBox(MainActivity.this);
    Imagem  image  = new  Imagem(MainActivity.this);
    WebViewLib  webviewlib  = new  WebViewLib(MainActivity.this);
    Arquivo_Imagem  Arq_img  = new  Arquivo_Imagem(MainActivity.this);
    AutoCompletar  auto_comp  = new  AutoCompletar(MainActivity.this);*/
    Cores  cores  = new  Cores(MainActivity.this);
    Lib lib = new Lib(MainActivity.this);
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nome   = findViewById(R.id.Edit_Nome);
        CPF    = findViewById(R.id.Edt_CPF);
        btn_check  = findViewById(R.id.btn_check);
        Edit_sendValue = findViewById(R.id.Edit_sendValue);
        Redirecionar = findViewById(R.id.Btn_Redirecionar);
        Btn_sendIntent  = findViewById(R.id.Btn_sendIntent);
        Spin_teste      = findViewById(R.id.Spin_teste);
        Btn_Spinner     = findViewById(R.id.Btn_Spinner);
        Imageview1      = findViewById(R.id.Imageview1);
        actv            = findViewById(R.id.actv);
        radiogroup1     = findViewById(R.id.radiogroup1);
        webview         = findViewById(R.id.web1);
        Rl_part1        = findViewById(R.id.Rl_part1);
        //Rl_part1.setVisibility(View.GONE);

        rb1       = findViewById(R.id.rb01);
        rb2       = findViewById(R.id.rb02);
        //rb3     = findViewById(R.id.rb03);
        //rb4     = findViewById(R.id.rb04);

        //slideToUnlockView = findViewById(R.id.slideToUnlock);
        //slideToUnlockView.setExternalListener(this);

        List<RadioButton> List_Rb = new ArrayList<>();
        List_Rb.add(rb1);
        List_Rb.add(rb2);
        rb1.setTextColor(Color.BLACK);
        List<String> List_Item = new ArrayList<>();
        List_Item.add("Apple");
        List_Item.add("Banana");
        List_Item.add("Cherry");
        List_Item.add("Date");
        List_Item.add("Grape");
        List_Item.add("Kiwi");
        List_Item.add("Mango");
        List_Item.add("Pear");
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.ps4);
        List<String> List1 = new ArrayList<>();
        List1.add("Teste 1");
        List1.add("Teste 2");
        List1.add("Teste 3");
        List1.add("Teste 4");

        lib.Lista_RadioButtonColor(List_Rb,cores.CorLaranja);
        lib.RadioButtonSexo_GetTexto(radiogroup1,rb1,rb2);
        lib.AutoCompletar(List_Item,actv,Color.parseColor(cores.black),"Digite Algo ...",25);
        Imageview1.setImageBitmap(lib.setBitmapSize(mBitmap,150,150));
        lib.ComboBox(List1,Spin_teste,1);
        lib.WebView_Texto(webview,"A propriedade CSS text-align descreve como conteúdo inline, como texto,apenas o seu conteúdo inline.","medium","blue","Justify");

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lib.EditTextValue_isvalid(CPF,MainActivity.this);
            }
        });
        btn_check.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
            if(!hasfocus){
                lib.EditTextValue_isvalid(Nome,MainActivity.this);
            }
            }
        }); Mascara_de_CPF(CPF);
        lib.BotaoRedirecionar(Redirecionar,MainActivity.this, Destino.class);
        Btn_sendIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          String str = lib.EditText_returnvalue(Edit_sendValue,MainActivity.this);
          lib.EnviarParaActivity("edt1",str,MainActivity.this,Destino.class);
          lib.BotaoRedirecionar(Btn_sendIntent,MainActivity.this,Destino.class);
            }
        });

    }

    public void Mascara_de_CPF(EditText edt){
        edt.setInputType(InputType.TYPE_CLASS_NUMBER);
        edt.addTextChangedListener(Mascaras.mask(edt, Mascaras.FORMAT_CPF));
    }

    private void showToast(String text) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onSlideToUnlockCanceled() {
        showToast("Canceled");
    }

    @Override
    public void onSlideToUnlockDone() {
        showToast("Unlocked");
    }
}
