package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mainmenu extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        tv1.findViewById(R.id.tv2);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido Tomasino: "+dato);

    }
    public void almacenamiento (View v){
        Intent i = new Intent (this, mainmenu.class);
        startActivity(i);

    }
    public void agenda (View v){

    }
}