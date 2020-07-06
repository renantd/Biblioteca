package br.sofex.com.biblioteca;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Html;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class JustifiedTextView extends androidx.appcompat.widget.AppCompatTextView {
    private final String CORE_TEMPLATE = "<html><body style='text-align:justify;margin: 0px 0px 0px 0px;'>%s</body></html>";

    public JustifiedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setText(Html.fromHtml(String.format(CORE_TEMPLATE,getText())));
    }

    public JustifiedTextView(Context context) {
        super(context);
        setText(Html.fromHtml(String.format(CORE_TEMPLATE,getText())));
    }

    public JustifiedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(Html.fromHtml(String.format(CORE_TEMPLATE,getText())));
    }
}
