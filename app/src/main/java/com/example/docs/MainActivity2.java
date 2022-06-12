package com.example.docs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre=(EditText) findViewById(R.id.nombre);
        apellido=(EditText) findViewById(R.id.apellido);
        edad=(EditText) findViewById(R.id.edad);
        correo=(EditText) findViewById(R.id.correo);

        nombre.setText(getIntent().getExtras().getString("Nombre:"));
        apellido.setText(getIntent().getExtras().getString("Apellido:"));
        edad.setText(getIntent().getExtras().getString("Edad:"));
        correo.setText(getIntent().getExtras().getString("Correo:"));
    }
}