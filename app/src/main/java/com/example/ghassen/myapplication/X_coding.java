package com.example.ghassen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class X_coding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_coding);


        Button inter = (Button) findViewById(R.id.b_inter1);
        inter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(Login.this,MainActivity.class);
                //startActivity(intent);
                Toast.makeText(X_coding.this,"évenement déjà passée",Toast.LENGTH_SHORT).show();
            }
        });

        Button creer = (Button)findViewById(R.id.b_creer1);
        creer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(X_coding.this,"évenement déjà passée",Toast.LENGTH_SHORT).show();
            }
        });

        TextView t_p = (TextView) findViewById(R.id.t_prog1);
        t_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(X_coding.this,Planning.class);
                startActivity(intent);
            }
        });
    }
}
