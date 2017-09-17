package br.com.williamlacerda.fatoscomcategorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FatosActivity extends AppCompatActivity {

    String[] brasil, tecnologia, pokemon, animais, categoriaSelecionada;
    String categoria;
    Button voltarButton, novoFatoButton;
    TextView fatoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatos);
        Intent intent = getIntent();
        categoria = intent.getStringExtra("categoria");
        fatoTextView = (TextView) findViewById(R.id.fatoTexto);
        novoFatoButton = (Button) findViewById(R.id.novoFatoButton);
        voltarButton = (Button) findViewById(R.id.backButton);
        brasil = this.getResources().getStringArray(R.array.brasil_array);
        tecnologia = getResources().getStringArray(R.array.tecnologia_array);
        pokemon = getResources().getStringArray(R.array.pokemon_array);
        animais = getResources().getStringArray(R.array.animais_array);

        switch (categoria){
            case "brasil":
                categoriaSelecionada = brasil;
                break;
            case "tecnologia":
                categoriaSelecionada = tecnologia;
                break;
            case "pokemon":
                categoriaSelecionada = pokemon;
                break;
            case "animais":
                categoriaSelecionada = animais;
                break;
        }
        fatoTextView.setText(getFact());


        novoFatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fatoTextView.setText(getFact());
            }
        });
        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public String getFact(){
        String fact = "";
        //Randomly select a fact

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(categoriaSelecionada.length);
        fact = categoriaSelecionada[randomNumber];

        return fact;

    }
}
