package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button saludo;
    TextView saludoText;
    EditText nombre;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saludo = findViewById(R.id.botonSaludo);
        saludoText  = findViewById(R.id.textView);
        nombre = findViewById(R.id.nombre);
        saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saludoText.setText("Hola "+nombre.getText());
            }
        });
    }
}