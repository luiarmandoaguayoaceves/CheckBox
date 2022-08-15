package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creacion de variables locales
    private EditText et1, et2;
    private TextView tv1;
    private CheckBox cb1, cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Almacenar los valores desde la vista a la porte logica por id
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
    }

    //Metodo de promedio
    public void Calcular(View view) {
        //Se toma el valor y se almacena en las variables valor
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //se cambian de texto a tipo numerico
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (cb1.isChecked() == true && cb2.isChecked() == false){
            int suma = num1+num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (cb2.isChecked() == true && cb1.isChecked() == false){
            int resta = num1-num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if (cb1.isChecked() == true && cb2.isChecked() == true){
            int resta = num1-num2;
            int suma = num1+num2;
            String resultado_suma = String.valueOf(suma);
            String resultado_resta = String.valueOf(resta);
            tv1.setText("La suma es "+resultado_suma+"/ La resta es "+resultado_resta);
        }
    }
}