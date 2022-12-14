package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1.findViewById(R.id.etesitito1);
    }
    public void Ingresar (View view){
        String nombre=edt1.getText().toString();
        if(nombre.length()==0){
            Toast.makeText(this,"debe Ingresar un nombre",Toast.LENGTH_SHORT).show();
        }
        if(nombre.length()!=0){
            Toast.makeText(this,"GRACIAS Y BIENVENIDO",Toast.LENGTH_SHORT).show();
            Intent i = new Intent (this, mainmenu.class);
            i.putExtra("dato",edt1.getText().toString());
            startActivity(i);
        }

    }
}