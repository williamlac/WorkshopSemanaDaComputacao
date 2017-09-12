package com.example.devmachine.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText valorUm, valorDois;
    public Button plusButton, minusButton, timesButton, divideButton;
    public TextView resultText;
    public String v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorUm = (EditText) findViewById(R.id.valorUm);
        valorDois = (EditText) findViewById(R.id.valorDois);
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        timesButton = (Button) findViewById(R.id.timesButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        resultText = (TextView) findViewById(R.id.resultText); // Intencionalmente deixar de fora, pra mostrar que ele não reclama e mostrar como achar erro

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = valorUm.getText().toString();
                v2 = valorDois.getText().toString();
                if(v1.matches("") || v2.matches("")){
                    Toast.makeText(MainActivity.this, "Você não botou valor!", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultText.setText(String.valueOf(Integer.parseInt(v1) + Integer.parseInt(v2)));// Falar do String.valueOf é pq result text espera uma string
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = valorUm.getText().toString();
                v2 = valorDois.getText().toString();
                if(v1.matches("") || v2.matches("")){
                    Toast.makeText(MainActivity.this, "Você não botou valor!", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultText.setText(String.valueOf(Integer.parseInt(v1) - Integer.parseInt(v2)));
                }
            }
        });
        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = valorUm.getText().toString();
                v2 = valorDois.getText().toString();
                if(v1.matches("") || v2.matches("")){
                    Toast.makeText(MainActivity.this, "Você não botou valor!", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultText.setText(String.valueOf(Integer.parseInt(v1) * Integer.parseInt(v2)));
                }
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = valorUm.getText().toString();
                v2 = valorDois.getText().toString();
                if(v1.matches("") || v2.matches("")){
                    Toast.makeText(MainActivity.this, "Você não botou valor!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String res = String.valueOf((Float.parseFloat(v1) / Float.parseFloat(v2)));
                    resultText.setText(res);
                }
            }
        });
    }
}
