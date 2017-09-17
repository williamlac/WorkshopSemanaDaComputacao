package br.com.williamlacerda.fatoscomcategorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button brasilButton, animaisButton, tecnologiaButton, pokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brasilButton = (Button) findViewById(R.id.brasilButton);
        animaisButton= (Button) findViewById(R.id.animaisButton);
        tecnologiaButton= (Button) findViewById(R.id.tecnologiaButton);
        pokeButton= (Button) findViewById(R.id.pokemonButton);
        brasilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoriaSelecionada("brasil");
            }
        });
        animaisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoriaSelecionada("animais");
            }
        });
        tecnologiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoriaSelecionada("tecnologia");
            }
        });
        pokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoriaSelecionada("pokemon");
            }
        });
    }
    private void categoriaSelecionada(String categoria){
        Intent intent = new Intent(this, FatosActivity.class);
        intent.putExtra("categoria", categoria);
        startActivity(intent);
    }
}
