package com.example.nemixs.appetitto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListadoRecetasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_recetas);

        /*  Ocultar ToolBar con nombre de la App */
        getSupportActionBar().hide();
    }
}
