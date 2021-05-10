package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    public static String name, age, sex;
    public EditText nome, idade;
    public RadioButton masculino, feminino;
    private Intent secondScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        idade = findViewById(R.id.editIdade);
        masculino = findViewById(R.id.radioButtonMasculino);
        feminino = findViewById(R.id.radioButtonFeminino);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editNome = nome.getText().toString();
                String editIdade = idade.getText().toString();
                name = editNome;
                age = editIdade;
                sex = feminino.isChecked()? "Feminino":"Masculino";

                if (editNome.isEmpty() || editIdade.isEmpty()){
                    Snackbar.make(v, "Preencha o nome e a idade", Snackbar.LENGTH_SHORT).show();
                } else if (feminino.isChecked() || masculino.isChecked()) {
                    goToNextScreen();
                } else {
                    Snackbar.make(v, "Coloque o sexo", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void goToNextScreen(){
        secondScreen = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(secondScreen);
    }

}