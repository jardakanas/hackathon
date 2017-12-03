package com.example.ghassen.myapplication;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main, container, false);

        View v = inflater.inflate(R.layout.fragment_gallery,container,false);

        // Inflate the layout for this fragment
        LinearLayout l = (LinearLayout) v.findViewById(R.id.l1);
        TableRow TR;



        TableLayout rapport = (TableLayout) v.findViewById(R.id.t_1);


        // --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());

        //-----------------------------------------------
        TextView t_nom = new TextView(getContext());
        t_nom.setText("Nom ");
        t_nom.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_nom.setTextSize(20);
        t_nom.setTextColor(Color.BLUE);
        t_nom.setPadding(30, 20, 0, 0);
        TR.addView(t_nom);
        //-----------------------------------------------
        TextView t_deb = new TextView(getContext());
        t_deb.setText("Prénom");
        t_deb.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_deb.setPadding(30, 20, 0, 15);
        t_deb.setTextSize(20);
        t_deb.setTextColor(Color.BLUE);
        TR.addView(t_deb);
        //------------------------------------------------
        TextView t_fin = new TextView(getContext());
        t_fin.setText("spécialité");
        t_fin.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_fin.setPadding(30, 20, 0, 15);
        t_fin.setTextSize(20);
        t_fin.setTextColor(Color.BLUE);
        TR.addView(t_fin);


        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());
        //-----------------------------------------------
        TextView t_nom1 = new TextView(getContext());
        t_nom1.setText("Mallouli ");
        t_nom1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_nom1.setTextSize(15);
        t_nom1.setPadding(30, 20, 0, 0);
        TR.addView(t_nom1);
        //-----------------------------------------------
        TextView t_deb1 = new TextView(getContext());
        t_deb1.setText("Ghassen");
        t_deb1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_deb1.setPadding(30, 20, 0, 15);
        t_deb1.setTextSize(15);
        TR.addView(t_deb1);
        //------------------------------------------------
        TextView t_fin1 = new TextView(getContext());
        t_fin1.setText("Développeur");
        t_fin1.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_fin1.setPadding(30, 20, 0, 15);
        t_fin1.setTextSize(15);
        TR.addView(t_fin1);

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());
        //-----------------------------------------------
        TextView t_nom2 = new TextView(getContext());
        t_nom2.setText("Ben salah ");
        t_nom2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_nom2.setTextSize(15);
        t_nom2.setPadding(30, 20, 0, 0);
        TR.addView(t_nom2);
        //-----------------------------------------------
        TextView t_deb2 = new TextView(getContext());
        t_deb2.setText("Ali");
        t_deb2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_deb2.setPadding(30, 20, 0, 15);
        t_deb2.setTextSize(15);
        TR.addView(t_deb2);
        //------------------------------------------------
        TextView t_fin2 = new TextView(getContext());
        t_fin2.setText("Développeur");
        t_fin2.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_fin2.setPadding(30, 20, 0, 15);
        t_fin2.setTextSize(15);
        TR.addView(t_fin2);

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());
        //-----------------------------------------------
        TextView t_nom3 = new TextView(getContext());
        t_nom3.setText("Jardak ");
        t_nom3.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_nom3.setTextSize(15);
        t_nom3.setPadding(30, 20, 0, 0);
        TR.addView(t_nom3);
        //-----------------------------------------------
        TextView t_deb3 = new TextView(getContext());
        t_deb3.setText("Anass");
        t_deb3.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_deb3.setPadding(30, 20, 0, 15);
        t_deb3.setTextSize(15);
        TR.addView(t_deb3);
        //------------------------------------------------
        TextView t_fin3 = new TextView(getContext());
        t_fin3.setText("Médecin");
        t_fin3.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_fin3.setPadding(30, 20, 0, 15);
        t_fin3.setTextSize(15);
        TR.addView(t_fin3);
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(getContext());
        //-----------------------------------------------
        TextView t_nom4 = new TextView(getContext());
        t_nom4.setText("Hdiji ");
        t_nom4.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_nom4.setTextSize(15);
        t_nom4.setPadding(30, 20, 0, 0);
        TR.addView(t_nom4);
        //-----------------------------------------------
        TextView t_deb4 = new TextView(getContext());
        t_deb4.setText("Yosra");
        t_deb4.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/6));
        t_deb4.setPadding(30, 20, 0, 15);
        t_deb4.setTextSize(15);
        TR.addView(t_deb4);
        //------------------------------------------------
        TextView t_fin4 = new TextView(getContext());
        t_fin4.setText("Développeur");
        t_fin4.setWidth((int)((getContext().getWallpaperDesiredMinimumWidth())/86));
        t_fin4.setPadding(30, 20, 0, 15);
        t_fin4.setTextSize(15);
        TR.addView(t_fin4);
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));



        //return inflater.inflate(R.layout.fragment_gallery, container, false);

        return v;
    }

}
