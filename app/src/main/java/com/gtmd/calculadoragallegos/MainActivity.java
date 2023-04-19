package com.gtmd.calculadoragallegos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult, tvCalculo;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnsum, btnres, btndiv, btnmul, btnc, btnigual;

    private Integer aux, longitud = 0;
    private String valor = "";
    private String pintado ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assing_references();
        event_button();
    }

    private void assing_references(){
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnsum = (Button) findViewById(R.id.btnsuma);
        btnres = (Button) findViewById(R.id.btnresta);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmul = (Button) findViewById(R.id.btnmul);

        btnc = (Button) findViewById(R.id.btnc);
        btnigual = (Button) findViewById(R.id.btnigual);

        tvCalculo = (TextView) findViewById(R.id.tvCalculo);
        tvResult = (TextView) findViewById(R.id.tvResultado);

    }

    private void event_button(){
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               aux = 0;
               tvCalculo.setText("0");
               tvResult.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else{
                    pintado = pintado + btn0.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn1.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn2.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn3.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn4.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn5.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn6.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn7.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn8.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud = numerosDijitos(tvCalculo.getText().toString());
                if(longitud > 11){
                    Toast.makeText(MainActivity.this, "La longitud exede lo aceptado", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btn9.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = "+";
                if(valorOperator(tvCalculo.getText().toString())){
                    Toast.makeText(MainActivity.this, "Solo puede ingresar un operador", Toast.LENGTH_SHORT).show();
                }else{
                    pintado = pintado + btnsum.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor = "-";
                if(valorOperator(tvCalculo.getText().toString())){
                    Toast.makeText(MainActivity.this, "Solo puede ingresar un operador", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btnres.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor = "*";
                if(valorOperator(tvCalculo.getText().toString())){
                    Toast.makeText(MainActivity.this, "Solo puede ingresar un operador", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btnmul.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //valor2 = valor1;
                valor = "/";
                if(valorOperator(tvCalculo.getText().toString())){
                    Toast.makeText(MainActivity.this, "Solo puede ingresar un operador", Toast.LENGTH_SHORT).show();
                }else {
                    pintado = pintado + btndiv.getText().toString();
                }
                tvCalculo.setText(""+pintado);
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueOperator = tvCalculo.getText().toString();
                String[] valores;
                Integer numero1=0, numero2=0;
                if(valueOperator.contains("+")){
                    valores = valueOperator.split("\\+");
                    numero1 = Integer.parseInt(valores[0]);
                    numero2 = Integer.parseInt(valores[1]);
                    Toast.makeText(MainActivity.this, ""+(numero1+numero2), Toast.LENGTH_SHORT).show();
                } else if (valueOperator.contains("-")) {
                    valores = valueOperator.split("-");
                    numero1 = Integer.parseInt(valores[0]);
                    numero2 = Integer.parseInt(valores[1]);
                } else if (valueOperator.contains("*")) {
                    valores = valueOperator.split("\\*");
                    numero1 = Integer.parseInt(valores[0]);
                    numero2 = Integer.parseInt(valores[1]);
                } else if (valueOperator.contains("/")) {
                    valores = valueOperator.split("/");
                    numero1 = Integer.parseInt(valores[0]);
                    numero2 = Integer.parseInt(valores[1]);
                }

                switch (valor){
                    case "+":
                        numero2 = 0;
                        aux = (numero1 + numero2);
                        tvResult.setText(""+aux);
                        break;
                    case "-":
                        numero2 = 0;
                        aux = (numero1 - numero2);
                        tvResult.setText(""+aux);
                        break;
                    case "*":
                        numero2 = 0;
                        aux = (numero1 * numero2);
                        tvResult.setText(""+aux);
                        break;
                    case "/":
                        numero2 = 0;
                        aux = (numero1 / numero2);
                        tvResult.setText(""+aux);

                        break;
                }
            }
        });
    }

    public Boolean valorOperator(String v){
        if(v.contains("+") || v.contains("-") || v.contains("*") || v.contains("/")){
            return true;
        }
        return false;
    }

    public int numerosDijitos(String v){
        return v.length();
    }
}