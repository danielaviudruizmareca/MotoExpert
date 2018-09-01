package com.example.danielaviud.pantallasplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MotoActivity extends AppCompatActivity {


    CardView infomotocicleta;
    CardView infodiferencia;
    CardView infotipos;
    CardView infopartes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        infomotocicleta=(CardView)findViewById(R.id.infomoto);
        infodiferencia=(CardView)findViewById(R.id.infodiferencia);
        infotipos=(CardView)findViewById(R.id.infotipos);
        infopartes=(CardView)findViewById(R.id.infopartes);


        infomotocicleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), InfomotocicletaActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });


        infodiferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), InfodiferenciaActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        infotipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), InfotiposActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });


        infopartes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), InfopartesActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
