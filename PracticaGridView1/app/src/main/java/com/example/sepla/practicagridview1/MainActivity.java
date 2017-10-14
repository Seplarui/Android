package com.example.sepla.practicagridview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Insertamos los datos en el layout GridView
        //Primero definimos array generico que contenga nuestros datos de prueba

        String[] datos=new String[25];
        for(int i=0;i<25;i++)
            datos[i]="PLAZA "+i;
        //Declaramos un adaptador de tipo ArrayAdapter pasándole un layout genérico
        ArrayAdapter<String> adaptador=
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);

        //Asociamos el adaptador al control GridView mediante su método setAdapter.

        GridView grdOpciones= (GridView)findViewById(R.id.gridView1);
        grdOpciones.setAdapter(adaptador);
    }
}
