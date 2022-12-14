package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class mainage extends AppCompatActivity {
    private EditText etnom,etdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainage);
        etnom = (EditText) findViewById(R.id.nomnom);
        etdatos=(EditText) findViewById(R.id.dada);
    }
    public void Guardar(View v){
        String nombre= etnom.getText().toString();
        String datos= etdatos.getText().toString();
        SharedPreferences preferences = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString(nombre,datos);
        Obj_editor.commit();
        Toast.makeText(this,"El Contacto ha sido guardado",Toast.LENGTH_SHORT).show();
    }
    public void Buscar(View v){
        String nombre= etnom.getText().toString();
        SharedPreferences preferences = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        String datos = preferences.getString(nombre,"");
        if (datos.length()==0){
            Toast.makeText(this, "No se encontro ningun registro", Toast.LENGTH_SHORT).show();
        }
        else{
            etdatos.setText(datos);
        }
    }
}