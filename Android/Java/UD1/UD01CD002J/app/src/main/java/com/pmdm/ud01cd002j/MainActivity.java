package com.pmdm.ud01cd002j;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOrden;
    EditText editInput,editOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos los elementos de la intefaz
        btnOrden=(Button)this.findViewById(R.id.btnOrden);
        editInput=(EditText)this.findViewById(R.id.editInput);
        editOutput=(EditText)this.findViewById(R.id.editOutput);

        //Asignamos el controlador de eventos
        btnOrden.setOnClickListener(this);

    }

    @Override
    //Controlador del evento Click
    public void onClick(View v) {
        //Obtenemos la lista de numeros
        String texto=editInput.getText().toString();
        //La convertimos en un array de enteros
        int[] lista=StringToNumbers(texto);
        //Ordenamos la lista
        Ordenar(lista);
        //La convertimos en texto de nuevo y la mostramos
        texto=NumbersToString(lista);
        editOutput.setText(texto);
    }

    //Función para convertir un texto en un array de enteros
    //Los numeros deben estar separados por comas
    private int[] StringToNumbers(String texto){
        //La funcion split separa elementos de un String a partir de un patrón
        String[] listaString=texto.split(",");
        //Creamos el array de enteros
        int[] listaInt=new int[listaString.length];

        //Convertimos elemento y lo almacenamos en el array
        for(int i=0;i<listaString.length;i++){
            listaInt[i]=Integer.parseInt(listaString[i]);
        }

        return  listaInt;

    }
    //Función para convertir un array de enteros en un String
    private String NumbersToString(int[] lista){
        StringBuilder sb=new StringBuilder();
        //Recorremos el array concatenando los valores
        for(int i=0;i<lista.length;i++){
            //La funcion appent añade un elemento al final del String
            sb.append(lista[i]);
            //Añadimos una coma salvo tras el último valor
            if(i<lista.length-1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
    //Funcion de ordenacion según el método de la burbuja
    private void Ordenar (int[] lista){
        //El primer bucle va del segundo elemento al ultimo
        for(int i=1; i<lista.length;i++){
            //El bucle interno va desde el primer elemento
            //hasta el ultimo que no haya sido ordenado
            for(int j=0; j<lista.length-i;j++){
                //Cuando corresponda los intercambiamos
                if(lista[j]>lista[j+1]){
                    int temp=lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=temp;
                }
            }
        }
    }
}
