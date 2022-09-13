package com.evavictoria.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button adicaoButton;
    Button subtracaoButton;
    Button multiplicacaoButton;
    Button divisaoButton;
    Double result;
    Double numeroUm;
    Double numeroDois;
//    int numeroTres;
//    int numeroQuatro;
//    int numeroCinco;
//    int numeroSeis;
//    int numeroSete;
//    int numeroOito;
//    int numeroNove;
//    int numeroZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarOuvintes();
    }

    private void criarOuvintes(){
        adicaoButton = findViewById(R.id.buttonAdicao);
        subtracaoButton = findViewById(R.id.buttonSubtracao);
        multiplicacaoButton = findViewById(R.id.buttonMultiplicacao);
        divisaoButton = findViewById(R.id.buttonDivisao);
        Button resultado = findViewById(R.id.buttonResultado);
        adicaoButton.setOnClickListener(v -> adicionar());
        subtracaoButton.setOnClickListener(v -> subtrair());
        multiplicacaoButton.setOnClickListener(v -> multiplicar());
        divisaoButton.setOnClickListener(v -> dividir());
        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtV = (TextView) findViewById(R.id.textViewResultado);
                txtV.setText(result.toString());
            }
        });
    }

    public void recuperarNumeroUm(){
        Button buttonUm = (Button)findViewById(R.id.buttonUm);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 1.0;
            }
        });
        Button buttonDois = (Button)findViewById(R.id.buttonDois);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 2.0;
            }
        });
        Button buttonTres = (Button)findViewById(R.id.buttonTres);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 3.0;
            }
        });
        Button buttonQuatro = (Button)findViewById(R.id.buttonQuatro);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 4.0;
            }
        });
        Button buttonCinco = (Button)findViewById(R.id.buttonCinco);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 5.0;
            }
        });
        Button buttonSeis = (Button)findViewById(R.id.buttonSeis);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 6.0;
            }
        });
        Button buttonSete = (Button)findViewById(R.id.buttonSete);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 7.0;
            }
        });
        Button buttonOito = (Button)findViewById(R.id.buttonOito);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 8.0;
            }
        });
        Button buttonNove = (Button)findViewById(R.id.buttonNove);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 9.0;
            }
        });
        Button buttonZero = (Button)findViewById(R.id.buttonZero);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroUm = 0.0;
            }
        });

    }
    public void recuperarNumeroDois(){
        Button buttonUm = (Button)findViewById(R.id.buttonUm);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 1.0;
            }
        });
        Button buttonDois = (Button)findViewById(R.id.buttonDois);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 2.0;
            }
        });
        Button buttonTres = (Button)findViewById(R.id.buttonTres);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 3.0;
            }
        });
        Button buttonQuatro = (Button)findViewById(R.id.buttonQuatro);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 4.0;
            }
        });
        Button buttonCinco = (Button)findViewById(R.id.buttonCinco);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 5.0;
            }
        });
        Button buttonSeis = (Button)findViewById(R.id.buttonSeis);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 6.0;
            }
        });
        Button buttonSete = (Button)findViewById(R.id.buttonSete);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 7.0;
            }
        });
        Button buttonOito = (Button)findViewById(R.id.buttonOito);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 8.0;
            }
        });
        Button buttonNove = (Button)findViewById(R.id.buttonNove);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 9.0;
            }
        });
        Button buttonZero = (Button)findViewById(R.id.buttonZero);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroDois = 0.0;
            }
        });

    }

    private Double adicionar() {
        recuperarNumeroUm();
        recuperarNumeroDois();
        result = numeroUm + numeroDois;
        return result;

    }
    private Double subtrair() {
        recuperarNumeroUm();
        recuperarNumeroDois();
        result = numeroUm - numeroDois;
        return result;

    }
    private Double multiplicar() {
        recuperarNumeroUm();
        recuperarNumeroDois();
        result = numeroUm * numeroDois;
        return result;

    }
    private String dividir() {
        recuperarNumeroUm();
        recuperarNumeroDois();
        if(numeroDois != 0) {
            result = numeroUm / numeroDois;
            return result.toString();
        }
        return "Não é possível dividir por zero";
    }
}