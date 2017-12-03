package com.example.ghassen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Caracteristique_evt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristique_evt);

        Button inter = (Button) findViewById(R.id.b_inter);
        inter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(Login.this,MainActivity.class);
                //startActivity(intent);
                Toast.makeText(Caracteristique_evt.this,"Merci pour votre intérret ",Toast.LENGTH_SHORT).show();
            }
        });

        Button creer = (Button)findViewById(R.id.b_creer);
        creer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Caracteristique_evt.this,New_team.class);
                startActivity(intent);

            }
        });

        TextView t_p = (TextView) findViewById(R.id.t_prog);
        t_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Caracteristique_evt.this,Planning.class);
                startActivity(intent);
            }
        });
    }
}
