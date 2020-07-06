package br.sofex.com.biblioteca;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridView_SDK {

    private Context mContext;

    public GridView_SDK(Context ctx) {this.mContext = ctx;}

    public GridView  setGridViewImagem(int[] Lista_de_Imagem, GridView gridview,Context context){
        gridview.setAdapter(new AdptadorGridView(context , Lista_de_Imagem));
        return gridview;
    }
    public void getGridViewImagemID(final int[] Lista_de_Imagem, GridView gridview, final Context context){
        gridview.setAdapter(new AdptadorGridView(context, Lista_de_Imagem));
        gridview.setOnItemClickListener(new GridView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, "Imagem: "+(position)+1, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //TODO: Criar esta Classe antes , se não houver
     /*no main
     int[] lista = new int[]{R.drawable.nintendo_64,R.drawable.nintendo_switch,R.drawable.playstation4,R.drawable.ps3,
            R.drawable.ps2,R.drawable.ps1,R.drawable.xbox360,R.drawable.xbox_one_x,R.drawable.xbox_series_x}; */

    /*import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.BaseAdapter;
    import android.widget.ImageView;
    import android.widget.ListAdapter;

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
    }*/

}
