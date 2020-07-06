package br.sofex.com.biblioteca;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class AdptadorGridView extends BaseAdapter {

    private Context ctx;
    private int[] lista;

    public AdptadorGridView(Context ctx, int[] lista) {
     this.ctx = ctx;
     this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int position) {
        return lista[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView iv = new ImageView(ctx);
        iv.setImageResource(lista[position]);
        iv.setAdjustViewBounds(true);
        return iv;
    }
}