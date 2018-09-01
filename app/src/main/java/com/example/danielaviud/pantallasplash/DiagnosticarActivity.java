package com.example.danielaviud.pantallasplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class DiagnosticarActivity extends AppCompatActivity {

    CardView diagmotor;
    CardView diagcarburador;
    CardView diagelectrico;
    CardView diagtraccion;
    CardView diagsuspension;
    CardView diagfrenos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosticar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        diagmotor=(CardView)findViewById(R.id.diagmotor);
        diagcarburador=(CardView)findViewById(R.id.diagcarburador);
        diagelectrico=(CardView)findViewById(R.id.diagelectrico);
        diagtraccion=(CardView)findViewById(R.id.diagtraccion);
        diagsuspension=(CardView)findViewById(R.id.diagsuspension);
        diagfrenos=(CardView)findViewById(R.id.diagfrenos);



        diagmotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(getApplication(), DiagmotorActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        diagcarburador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), DiagcarburadorActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });

        diagelectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), DiagelectricoActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });


        diagtraccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), DiagtraccionActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });


        diagsuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), DiagsuspensionActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });

        diagfrenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getApplication(), DiagfrenosActivity.class);
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
