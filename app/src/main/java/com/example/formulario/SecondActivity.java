package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView rstNome, rstIdade, rstSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rstNome = findViewById(R.id.rstNome);
        rstIdade = findViewById(R.id.rstIdade);
        rstSexo = findViewById(R.id.rstSexo);

        rstNome.setText(MainActivity.name);
        rstIdade.setText("Idade: " +MainActivity.age+" anos");
        rstSexo.setText("Sexo: "+MainActivity.sex);
    }
}