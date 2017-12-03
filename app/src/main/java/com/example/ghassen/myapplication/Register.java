package com.example.ghassen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {


    Button b;
    EditText t_nom ;
    EditText t_pren ;
    EditText t_pseudo;
    EditText t_pass ;
    EditText t_confirm;
    EditText t_spec;
    EditText t_naiss;
    EditText t_mail;
    EditText t_fnc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        b = (Button)findViewById(R.id.b1);
        t_nom = (EditText)findViewById(R.id.t_nom);
        t_pren = (EditText)findViewById(R.id.t_pren);
        t_pseudo = (EditText)findViewById(R.id.t_pseudo);
        t_pass = (EditText)findViewById(R.id.t_pass);
        t_confirm = (EditText)findViewById(R.id.t_confirm);
        t_spec = (EditText)findViewById(R.id.t_spec);
        t_naiss = (EditText)findViewById(R.id.t_naiss);
        t_mail = (EditText)findViewById(R.id.t_mail);
        t_fnc = (EditText)findViewById(R.id.t_fnc);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((t_nom.getText().toString().equals(""))||(t_pren.getText().toString().equals(""))||(t_pseudo.getText().toString().equals(""))||(t_pass.getText().toString().equals(""))||(t_confirm.getText().toString().equals(""))||(t_spec.getText().toString().equals(""))||(t_naiss.getText().toString().equals(""))||(t_mail.getText().toString().equals(""))||(t_fnc.getText().toString().equals(""))){
                    Toast.makeText(Register.this, "Vérifier que tous les champs sont remplis", Toast.LENGTH_SHORT).show();
                }else
                if (!((t_pass.getText().toString()).equals(t_confirm.getText().toString()))){
                    Toast.makeText(Register.this, "Les deux mots de passe sont incompatibles", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Register.this,MainActivity.class);
                    intent.putExtra("log",t_pseudo.getText().toString());
                    intent.putExtra("pass",t_pass.getText().toString());
                    startActivity(intent);
                }
                //Toast.makeText(Login.this, "LLogin : "+login.getText()+" MMP : "+mp.getText(), Toast.LENGTH_SHORT).show();



            }
        });
    }
}
