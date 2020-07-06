package br.sofex.com.biblioteca;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewLib {

    Context mContext;

    WebViewLib(Context context)
    {this.mContext = context;}


    public void WebView_Texto (WebView wvContent_Detail, String body, String texto_tamanho, String cor_texto , String texto_alinhamento) {
        //String HTML1 = "<html><head><style type=\"text/css\">@font-face{font-family: MyFont;src: url(\"file:///android_asset/%s\")}body {font-family: MyFont;font-size: medium; text-align: match-parent; line-height: %spx;}</style></head><body dir='rtl'>";
        String HTML= "<html><head><head><body style = 'font-family: MyFont; font-size: "+texto_tamanho+"; text-align: "+texto_alinhamento+"; color:"+cor_texto+"; line-height: %spx;'></body></html>";

        String str = String.format(HTML, "IRANSansMobile_UltraLight.ttf", 25);


        String content = body.replace("text-align:", "");
        content = content.replace("font-family:", "");
        content = content.replace("line-height:", "");
        content = content.replace("dir=", "");
        content = content.replace("width=", "width=\"100%;\"");

        String myHtmlString = str + content ;
        wvContent_Detail.loadDataWithBaseURL(null, myHtmlString, "text/html", "UTF-8", null);

        WebSettings webSettings = wvContent_Detail.getSettings();
        webSettings.setDefaultFontSize(20);
    }

}
