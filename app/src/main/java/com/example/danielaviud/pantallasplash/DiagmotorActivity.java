package com.example.danielaviud.pantallasplash;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class DiagmotorActivity extends AppCompatActivity {

    BaseConocimiento b=new BaseConocimiento();

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView pregunta;
    Button dignostico;

    ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagmotor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        pregunta = (TextView) findViewById(R.id.text_pregunta);
        dignostico =(Button) findViewById(R.id.boton_diag);


        dignostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(radioGroup.getCheckedRadioButtonId()>1){

                    int radioId = radioGroup.getCheckedRadioButtonId();
                    radioButton =(RadioButton) findViewById(radioId);



                    switch (pregunta.getText().toString()){

                        case "¿EL Motor pierde potencia?":

                            b.ObtenerPotencia(radioButton.getText().toString());
                            String resul=b.resultado;


                            if(radioButton.getText().equals("SI")){


                                alertapersonalizada(resul);


                            }
                            else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul);

                            }

                            break;


                        case "¿EL Motor se Sobrecalienta?":

                            b.ObtenerCalienta(radioButton.getText().toString());
                            String resul2=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul2);

                            }
                            else {

                                radioGroup.clearCheck();
                                pregunta.setText(resul2);
                                //radioButton.setChecked(false);

                            }

                            break;


                        case "¿El motor presenta fugas de aceite?":

                            b.Obtenerfugaaceite(radioButton.getText().toString());
                            String resul3=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul3);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul3);

                            }

                            break;


                        case "¿El motor se apaga con facilidad?":

                            b.Obtenerapagafacil(radioButton.getText().toString());
                            String resul4=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul4);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul4);

                            }

                            break;

                        case "¿El motor expulsa humo blanco por el escape?":

                            b.Obtenerhumoblanco(radioButton.getText().toString());
                            String resul5=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul5);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul5);

                            }

                            break;

                        case "¿El motor tiene la patada débil?":

                            b.Obtenerpatadadebil(radioButton.getText().toString());
                            String resul6=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul6);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul6);

                            }

                            break;


                        case "¿El motor no enciende?":

                            b.Obtenernoenciende(radioButton.getText().toString());
                            String resul7=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul7);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul7);

                            }

                            break;

                        case "¿EL Motor tiene Vibraciones anormal?":

                            b.Obtenervibraanormal(radioButton.getText().toString());
                            String resul8=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul8);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul8);

                            }

                            break;

                        case "¿Cascabeleo anormal dentro del motor?":

                            b.Obtenercascabelea(radioButton.getText().toString());
                            String resul9=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul9);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul9);

                            }

                            break;

                        case "¿Ruidos anormal en el momento de encendido con el botón de arranque?":

                            b.Obtenerruidoencendido(radioButton.getText().toString());
                            String resul10=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul10);

                            }
                            else {
                                radioGroup.clearCheck();

                                pregunta.setText(resul10);

                            }

                            break;

                        case "¿El motor detona periódicamente?":

                            b.Obtenerdetona(radioButton.getText().toString());
                            String resul11=b.resultado;

                            if(radioButton.getText().equals("SI")){
                                alertapersonalizada(resul11);

                            }
                            else {

                                alertapersonalizada("*PROBABLEMENTE SU TIPO DE PROBLEMA NO SEA DEL MOTOR ESCOJA OTRO DIFERENTE*");

                            }

                            break;




                    }

                }
                else{
                    Toast.makeText(getBaseContext(),"PORFAVOR SELECCIONE UNA OPCIÓN",Toast.LENGTH_LONG).show();
                }





            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }



    public void alertadiag(String resultado){

        AlertDialog.Builder alerta = new AlertDialog.Builder(DiagmotorActivity.this);
        alerta.setMessage(resultado);
        alerta.setTitle(("Diagnóstico"));
        alerta.setIcon(R.drawable.motor);
        alerta.setCancelable(false);
        alerta.setView(R.layout.toas_personalizado);
        alerta.setPositiveButton("Seguir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                return;
            }
        });

        alerta.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });
        alerta.show();

    }

    public void alertapersonalizada(String resultado) {

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View customToast = inflater.inflate(R.layout.toas_personalizado, null);
        TextView txt = (TextView) customToast.findViewById(R.id.txttoas);
        Button salir=(Button)customToast.findViewById(R.id.alertasalir);
        Button seguir=(Button)customToast.findViewById(R.id.alertaseguir);

        txt.setText(resultado);

        final Dialog dia=new Dialog(this);
        dia.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dia.setContentView(customToast);
        dia.setCancelable(false);
        dia.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup.clearCheck();
                dia.dismiss();
                Toast.makeText(getBaseContext(),"PARA CONTINUAR SELECCIONE LA OPCIÓN NO Y LUEGO ACEPTAR",Toast.LENGTH_LONG).show();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        dia.show();

    }

    public void pogresdialog(){
        pDialog = new ProgressDialog(DiagmotorActivity.this);
        pDialog.setMessage("Obteniendo datos..");
        pDialog.setCancelable(false);
        pDialog.show();
        pDialog.setSecondaryProgress(4000);
        if (pDialog.isShowing())
            pDialog.dismiss();





    }



}


