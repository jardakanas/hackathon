package com.example.ghassen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText login;
    EditText mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (EditText)findViewById(R.id.t_log);
        mp = (EditText)findViewById(R.id.t_pass);

        TextView reg = (TextView) findViewById(R.id.t_inscrire);
        Button con = (Button) findViewById(R.id.btn_cnx);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(Login.this,Register.class);
                startActivity(register);
            }
        });

        con.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Toast.makeText(Login.this, "LLogin : "+login.getText()+" MMP : "+mp.getText(), Toast.LENGTH_SHORT).show();

                if ((login.getText().toString().equals(""))||(mp.getText().toString().equals(""))){
                    Toast.makeText(Login.this, "Vérifier que tous les champs sont remplis", Toast.LENGTH_SHORT).show();
                }else
                    if (!(login.getText().toString().equals("ghassen"))||!(mp.getText().toString().equals("ghassen"))){
                        Toast.makeText(Login.this, "Vérifier le login et le mot de passe", Toast.LENGTH_SHORT).show();
                    }else {

                        Intent intent = new Intent(Login.this, MainActivity.class);
                        intent.putExtra("log", login.getText().toString());
                        intent.putExtra("pass", mp.getText().toString());
                        startActivity(intent);
                }

            }
        });

    }
}
