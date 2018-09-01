package com.example.danielaviud.pantallasplash;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DiagelectricoActivity extends AppCompatActivity {

    BaseConocimiento b=new BaseConocimiento();

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView pregunta;
    Button dignostico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagelectrico);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        pregunta = (TextView) findViewById(R.id.text_pregunta);
        dignostico = (Button) findViewById(R.id.boton_diag);


        dignostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioGroup.getCheckedRadioButtonId()>1) {

                    int radioId = radioGroup.getCheckedRadioButtonId();
                    radioButton = (RadioButton) findViewById(radioId);

                    switch (pregunta.getText().toString()) {


                        case "¿La batería se descarga muy rápido?":

                            b.Obtenerbajabateria(radioButton.getText().toString());
                            String resul = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul);

                            }

                            break;

                        case "¿La batería no carga?":

                            b.Obtenernocarga(radioButton.getText().toString());
                            String resul2 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul2);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul2);

                            }

                            break;

                        case "¿La luz del farol no enciende?":

                            b.Obtenerluzfarol(radioButton.getText().toString());
                            String resul3 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul3);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul3);

                            }

                            break;

                        case "¿El botón de arranque no es efectivo?":

                            b.Obtenerbotonefectivo(radioButton.getText().toString());
                            String resul4 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul4);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul4);

                            }

                            break;

                        case "¿El motor es costoso de encender o no enciende?":

                            b.Obtenermotorenciende(radioButton.getText().toString());
                            String resul5 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul5);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul5);

                            }

                            break;

                        case "¿Los guiñadores no encienden?":

                            b.Obtenerguiñiadorno(radioButton.getText().toString());
                            String resul6 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul6);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul6);

                            }

                            break;

                        case "¿La bocina no es efectiva?":

                            b.Obtenerbocinano(radioButton.getText().toString());
                            String resul7 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul7);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul7);

                            }

                            break;

                        case "¿Luz de stop (trasera) no enciende?":

                            b.Obtenerluzstop(radioButton.getText().toString());
                            String resul8 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul8);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul8);

                            }

                            break;

                        case "¿Pérdida total de energía?":

                            b.Obtenerperdidaenergia(radioButton.getText().toString());
                            String resul9 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul9);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul9);

                            }

                            break;

                        case "¿El Fusible se quema con frecuencia?":

                            b.Obtenerfusiblequema(radioButton.getText().toString());
                            String resul10 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul10);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul10);

                            }

                            break;

                        case "¿El motor de arranque no gira al presionar el botón?":

                            b.Obtenermotoraranque(radioButton.getText().toString());
                            String resul11 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul11);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul11);

                            }

                            break;

                        case "¿Las luces delanteras principales se reducen apreciablemente o están débiles?":

                            b.Obtenerlucesdelanteras(radioButton.getText().toString());
                            String resul12 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul12);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul12);

                            }

                            break;

                        case "¿La luz del farol se quema frecuentemente?":

                            b.Obtenerfarolquemafrecuente(radioButton.getText().toString());
                            String resul13 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul13);


                            } else {
                                alertapersonalizada("*PROBABLEMENTE SU TIPO DE PROBLEMA NO SEA ELÉCTRICO ESCOJA OTRO DIFERENTE*");

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

}
