package com.example.docs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre, txtapellido, txtedad, txtcorreo;
    Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre =(EditText) findViewById(R.id.txtnombre);
        txtapellido =(EditText) findViewById(R.id.txtapellido);
        txtedad =(EditText) findViewById(R.id.txtedad);
        txtcorreo =(EditText) findViewById(R.id.txtcorreo);

        btnenviar = (Button) findViewById(R.id.btnenviar);
        //Enviar los datos al otro mainActivity2
        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

                intent.putExtra("Nombre:", txtnombre.getText().toString());
                intent.putExtra("Apellido:", txtapellido.getText().toString());
                intent.putExtra("Edad:", txtedad.getText().toString());
                intent.putExtra("Correo:", txtcorreo.getText().toString());
                //enviarlo
                startActivity(intent);

            }
        });
    }
}