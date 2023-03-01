package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {
    TextView nombre2, apellido2, edad2, correo2;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        nombre2 = findViewById(R.id.txtNombre2);
        apellido2 = findViewById(R.id.txtApellidos2);
        correo2 = findViewById(R.id.txtCorreo2);
        edad2 = findViewById(R.id.txtEdad2);
        goBack = findViewById(R.id.btnAtras);
        show();

        goBack.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        Intent panel = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(panel);
    }

    protected void show(){
        nombre2.setText(getIntent().getExtras().getString("nombre"));
        apellido2.setText(getIntent().getExtras().getString("apellido"));
        correo2.setText(getIntent().getExtras().getString("correo"));
        edad2.setText(getIntent().getExtras().getString("edad"));
    }
}