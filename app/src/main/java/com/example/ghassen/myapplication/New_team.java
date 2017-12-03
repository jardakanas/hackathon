package com.example.ghassen.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class New_team extends AppCompatActivity {
    EditText eq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_team);
        TableRow TR;

        TableLayout rapport = (TableLayout) findViewById(R.id.t_part);

        // --------------------------------------------------------------------------------------------------
        TR = new TableRow(this);

        //-----------------------------------------------
        TextView t_nom = new TextView(this);
        t_nom.setText("Nom ");
        t_nom.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_nom.setTextSize(20);
        t_nom.setPadding(20, 20, 0, 0);
        t_nom.setTextColor(Color.BLUE);
        TR.addView(t_nom);
        //-----------------------------------------------
        TextView t_deb = new TextView(this);
        t_deb.setText("Prénom");
        t_deb.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_deb.setPadding(0, 20, 0, 15);
        t_deb.setTextSize(20);
        t_deb.setTextColor(Color.BLUE);
        TR.addView(t_deb);
        //------------------------------------------------
        TextView t_fin = new TextView(this);
        t_fin.setText("spécialité");
        t_fin.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_fin.setPadding(0, 20, 0, 15);
        t_fin.setTextSize(20);
        t_fin.setTextColor(Color.BLUE);
        TR.addView(t_fin);
        //-------------------------------------------------
        TextView t_autre = new TextView(this);
        t_autre.setText("Action");
        t_autre.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_autre.setPadding(0, 20, 0, 15);
        t_autre.setTextSize(20);
        t_autre.setTextColor(Color.BLUE);
        TR.addView(t_autre);
        //-------------------------------------------------

        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(this);
        //-----------------------------------------------
        TextView t_nom1 = new TextView(this);
        t_nom1.setText("Mallouli ");
        t_nom1.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_nom1.setTextSize(15);
        t_nom1.setPadding(20, 20, 0, 0);
        TR.addView(t_nom1);
        //-----------------------------------------------
        TextView t_deb1 = new TextView(this);
        t_deb1.setText("Ghassen");
        t_deb1.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_deb1.setPadding(0, 20, 0, 15);
        t_deb1.setTextSize(15);
        TR.addView(t_deb1);
        //------------------------------------------------
        TextView t_fin1 = new TextView(this);
        t_fin1.setText("Développeur");
        t_fin1.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_fin1.setPadding(0, 20, 0, 15);
        t_fin1.setTextSize(15);
        TR.addView(t_fin1);
        //-------------------------------------------------
        TextView t_autre1 = new TextView(this);
        t_autre1.setText("Ajouter");
        t_autre1.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_autre1.setPadding(0, 20, 0, 15);
        t_autre1.setTextSize(15);
        TR.addView(t_autre1);
        t_autre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_team.this, "Invitation envoyée ", Toast.LENGTH_SHORT).show();
            }
        });
        //-------------------------------------------------
        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(this);
        //-----------------------------------------------
        TextView t_nom2 = new TextView(this);
        t_nom2.setText("Ben salah ");
        t_nom2.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_nom2.setTextSize(15);
        t_nom2.setPadding(20, 20, 0, 0);
        TR.addView(t_nom2);
        //-----------------------------------------------
        TextView t_deb2 = new TextView(this);
        t_deb2.setText("Ali");
        t_deb2.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_deb2.setPadding(0, 20, 0, 15);
        t_deb2.setTextSize(15);
        TR.addView(t_deb2);
        //------------------------------------------------
        TextView t_fin2 = new TextView(this);
        t_fin2.setText("Développeur");
        t_fin2.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_fin2.setPadding(0, 20, 0, 15);
        t_fin2.setTextSize(15);
        TR.addView(t_fin2);
        //-------------------------------------------------
        TextView t_autre2 = new TextView(this);
        t_autre2.setText("Ajouter");
        t_autre2.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_autre2.setPadding(0, 20, 0, 15);
        t_autre2.setTextSize(15);
        TR.addView(t_autre2);
        t_autre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_team.this, "Invitation envoyée ", Toast.LENGTH_SHORT).show();
            }
        });
        //-------------------------------------------------
        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(this);
        //-----------------------------------------------
        TextView t_nom3 = new TextView(this);
        t_nom3.setText("Jardak ");
        t_nom3.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_nom3.setTextSize(15);
        t_nom3.setPadding(20, 20, 0, 0);
        TR.addView(t_nom3);
        //-----------------------------------------------
        TextView t_deb3 = new TextView(this);
        t_deb3.setText("Anass");
        t_deb3.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_deb3.setPadding(0, 20, 0, 15);
        t_deb3.setTextSize(15);
        TR.addView(t_deb3);
        //------------------------------------------------
        TextView t_fin3 = new TextView(this);
        t_fin3.setText("Médecin");
        t_fin3.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_fin3.setPadding(0, 20, 0, 15);
        t_fin3.setTextSize(15);
        TR.addView(t_fin3);
        //-------------------------------------------------
        TextView t_autre3 = new TextView(this);
        t_autre3.setText("Ajouter");
        t_autre3.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_autre3.setPadding(0, 20, 0, 15);
        t_autre3.setTextSize(15);
        TR.addView(t_autre3);
        t_autre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_team.this, "Invitation envoyée ", Toast.LENGTH_SHORT).show();
            }
        });
        //-------------------------------------------------
        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
// --------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------
        TR = new TableRow(this);
        //-----------------------------------------------
        TextView t_nom4 = new TextView(this);
        t_nom4.setText("Hdiji ");
        t_nom4.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_nom4.setTextSize(15);
        t_nom4.setPadding(20, 20, 0, 0);
        TR.addView(t_nom4);
        //-----------------------------------------------
        TextView t_deb4 = new TextView(this);
        t_deb4.setText("Yosra");
        t_deb4.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_deb4.setPadding(0, 20, 0, 15);
        t_deb4.setTextSize(15);
        TR.addView(t_deb4);
        //------------------------------------------------
        TextView t_fin4 = new TextView(this);
        t_fin4.setText("Développeur");
        t_fin4.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_fin4.setPadding(0, 20, 0, 15);
        t_fin4.setTextSize(15);
        TR.addView(t_fin4);
        //-------------------------------------------------
        TextView t_autre4 = new TextView(this);
        t_autre4.setText("Ajouter");
        t_autre4.setWidth((int)((this.getWallpaperDesiredMinimumWidth())/8));
        t_autre4.setPadding(0, 20, 0, 15);
        t_autre4.setTextSize(15);
        TR.addView(t_autre4);
        t_autre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_team.this, "Invitation envoyée ", Toast.LENGTH_SHORT).show();
            }
        });
        //-------------------------------------------------
        rapport.addView(TR, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        eq = (EditText)findViewById(R.id.t_nom);
        Button b_add = (Button) findViewById(R.id.add_team);
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq.getText().toString().equals(""))
                    Toast.makeText(New_team.this,"Saisir le nom de l'équipe",Toast.LENGTH_SHORT).show();
                else{
                    Intent intent = new Intent(New_team.this,MainActivity.class);
                    intent.putExtra("log","ghassen");
                    intent.putExtra("pass","ghassen");
                    startActivity(intent);
                }
            }
        });

    }
}
