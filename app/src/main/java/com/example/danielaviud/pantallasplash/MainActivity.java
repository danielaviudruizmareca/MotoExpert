package com.example.danielaviud.pantallasplash;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView diag,moto,info, ayuda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diag= (CardView) findViewById(R.id.car_diagnostico);
        moto= (CardView) findViewById(R.id.card_moto);
        info= (CardView) findViewById(R.id.card_informacion);
        ayuda= (CardView) findViewById(R.id.car_ayuda);



        diag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(getApplication(), DiagnosticarActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }


            }
        });


        moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(getApplication(), MotoActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }


            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(getApplication(), InfoActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }


            }
        });
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(getApplication(), AyudaActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplication(),e.getMessage(),Toast.LENGTH_LONG).show();
                }


            }
        });






    }

    public void alertasalir(){

        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setMessage("¿Desea Salir de la Aplicación?");
        alerta.setTitle(("Salir"));
        alerta.setIcon(R.drawable.ic_alerta);
        alerta.setCancelable(false);
        alerta.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //Toast.makeText(getBaseContext(),"Creado por Daniel Aviud",Toast.LENGTH_LONG).show();

                finish();
            }
        });

        alerta.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                return;

            }
        });
        alerta.show();

    }

    public void fi(View view){

        alertasalir();

    }




     //codigo para capturar el boton de ir atras del dispositivo
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode==event.KEYCODE_BACK && event.getRepeatCount()==0){

            alertasalir();

        }
        return super.onKeyDown(keyCode, event);

    }


}
