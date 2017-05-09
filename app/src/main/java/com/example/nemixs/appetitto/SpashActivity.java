package com.example.nemixs.appetitto;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

    /*  Ocultar ToolBar con nombre de la App */
        getSupportActionBar().hide();

    /*  Esperar 5 segundos en Layout inicial */
        esperarYCerrar(5000);
    }




    public void esperarYCerrar(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                Intent intent = new Intent (SpashActivity.this, MainActivity.class);
                startActivity(intent) ;
            }
        }, milisegundos);
    }
}
