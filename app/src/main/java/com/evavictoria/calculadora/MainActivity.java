package com.evavictoria.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import com.evavictoria.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Double primeiroValor;
    Double segundoValor;
    String resultado;

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.buttonUm.setOnClickListener(v -> {
            atualizaVisor("1", true);
        });
        binding.buttonDois.setOnClickListener(v -> {
            atualizaVisor("2", true);
                });
        binding.buttonTres.setOnClickListener(v-> {
                    atualizaVisor("3", true);
                });
        binding.buttonQuatro.setOnClickListener(v-> {
            atualizaVisor("4", true);
                });
        binding.buttonCinco.setOnClickListener(v -> {
            atualizaVisor("5", true);
                });
        binding.buttonSeis.setOnClickListener(v -> {
            atualizaVisor("6", true);
                });
        binding.buttonSete.setOnClickListener(v -> {
                    atualizaVisor("7", true);
                });
        binding.buttonOito.setOnClickListener(v -> {
            atualizaVisor("8", true);
                });
        binding.buttonNove.setOnClickListener(v -> {
            atualizaVisor("9", true);
                });
        binding.buttonZero.setOnClickListener(v -> {
            atualizaVisor("0", true);
        });




        binding.buttonAdicao.setOnClickListener(v -> {
            atualizaVisor("+", false);
        });
        binding.buttonSubtracao.setOnClickListener(v -> {
            atualizaVisor("-", false);
        });
        binding.buttonMultiplicacao.setOnClickListener(v -> {
            atualizaVisor("*", false);
        });
        binding.buttonDivisao.setOnClickListener(v -> {
            atualizaVisor("/", false);
        });

    }

    public void atualizaVisor(String string, Boolean limpaDados){
        if(!resultado.isEmpty()){
            binding.textViewResultado.setText("");
        }
        if(limpaDados){
            resultado = "";
        }else{
            binding.textViewResultado.append(resultado.toString());
            binding.textViewResultado.append(string);
            resultado = "";
        }
    }
}