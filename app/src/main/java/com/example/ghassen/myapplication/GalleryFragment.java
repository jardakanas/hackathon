package com.example.ghassen.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment{


    public GalleryFragment() {

    }

    //ListView l1 = (ListView)l1
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gallery,container,false);

        // Inflate the layout for this fragment
        LinearLayout l = (LinearLayout) v.findViewById(R.id.l1);
        TableRow TR;



        TableLayout rapport = (TableLayout) v.findViewById(R.id.t_1);



        // -------------------------------------------------------------------------------------------------
/*
            TR = new TableRow(getContext());
            TextView titre = new TextView(getContext());
            titre.setText("Liste des hackathons ");
            titre.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
            titre.setTextSize(24);
            titre.setPadding(20, 20, 40, 0);
            TR.addView(titre);
            rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
*/
        TR = new TableRow(getContext());
        //-----------------------------------------------
        TextView t_nom = new TextView(getContext());
        t_nom.setText("Libellé ");
        t_nom.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_nom.setTextSize(20);
        t_nom.setTextColor(Color.BLUE);
        t_nom.setPadding(20, 20, 0, 0);
        TR.addView(t_nom);
        //-----------------------------------------------
        TextView t_deb = new TextView(getContext());
        t_deb.setText("Début");
        t_deb.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_deb.setPadding(0, 20, 0, 15);
        t_deb.setTextSize(20);
        t_deb.setTextColor(Color.BLUE);
        TR.addView(t_deb);
        //------------------------------------------------
        TextView t_fin = new TextView(getContext());
        t_fin.setText("Fin");
        t_fin.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_fin.setPadding(0, 20, 0, 15);
        t_fin.setTextSize(20);
        t_fin.setTextColor(Color.BLUE);
        TR.addView(t_fin);
        //-------------------------------------------------
        TextView t_autre = new TextView(getContext());
        t_autre.setText("Action");
        t_autre.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_autre.setPadding(0, 20, 0, 15);
        t_autre.setTextSize(20);
        t_autre.setTextColor(Color.BLUE);
        TR.addView(t_autre);
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());

        //-----------------------------------------------
        TextView t_nom1 = new TextView(getContext());
        t_nom1.setText("DevFest ");
        t_nom1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_nom1.setTextSize(20);
        t_nom1.setPadding(20, 20, 0, 0);
        TR.addView(t_nom1);
        //-----------------------------------------------
        TextView t_deb1 = new TextView(getContext());
        t_deb1.setText("02/12/17");
        t_deb1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_deb1.setPadding(0, 20, 0, 15);
        t_deb1.setTextSize(20);
        TR.addView(t_deb1);
        //------------------------------------------------
        TextView t_fin1 = new TextView(getContext());
        t_fin1.setText("03/12/17");
        t_fin1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_fin1.setPadding(0, 20, 0, 15);
        t_fin1.setTextSize(20);
        TR.addView(t_fin1);
        //-------------------------------------------------
        TextView t_autre1 = new TextView(getContext());
        t_autre1.setText("More +");
        t_autre1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_autre1.setPadding(0, 20, 0, 15);
        t_autre1.setTextSize(20);
        TR.addView(t_autre1);
        t_autre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Caracteristique_evt.class);
                intent.putExtra("evt","devfest");
                //intent.putExtra("pass",mp.getText().toString());
                startActivity(intent);
            }
        });
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());

        //-----------------------------------------------
        TextView t_nom2 = new TextView(getContext());
        t_nom2.setText("X-coding ");
        t_nom2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_nom2.setTextSize(20);
        t_nom2.setPadding(20, 20, 0, 0);
        TR.addView(t_nom2);
        //-----------------------------------------------
        TextView t_deb2 = new TextView(getContext());
        t_deb2.setText("18/11/17");
        t_deb2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_deb2.setPadding(0, 20, 0, 15);
        t_deb2.setTextSize(20);
        TR.addView(t_deb2);
        //------------------------------------------------
        TextView t_fin2 = new TextView(getContext());
        t_fin2.setText("19/11/17");
        t_fin2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_fin2.setPadding(0, 20, 0, 15);
        t_fin2.setTextSize(20);
        TR.addView(t_fin2);
        //-------------------------------------------------
        TextView t_autre2 = new TextView(getContext());
        t_autre2.setText("More +");
        t_autre2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/8));
        t_autre2.setPadding(0, 20, 0, 15);
        t_autre2.setTextSize(20);
        TR.addView(t_autre2);
        t_autre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),X_coding.class);
                intent.putExtra("evt","x-coding");
                //intent.putExtra("pass",mp.getText().toString());
                startActivity(intent);
            }
        });
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));



        //return inflater.inflate(R.layout.fragment_gallery, container, false);

        return v;
    }

}
