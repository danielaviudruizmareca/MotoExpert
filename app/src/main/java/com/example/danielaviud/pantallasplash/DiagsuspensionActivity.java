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

public class DiagsuspensionActivity extends AppCompatActivity {

    BaseConocimiento b=new BaseConocimiento();

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView pregunta;
    Button dignostico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagsuspension);
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

                if(radioGroup.getCheckedRadioButtonId()>1) {

                    int radioId = radioGroup.getCheckedRadioButtonId();
                    radioButton = (RadioButton) findViewById(radioId);


                    switch (pregunta.getText().toString()) {

                        case "¿Suspensión trasera demasiado rígida?":

                            b.Obtenersuspensiontracerarigida(radioButton.getText().toString());
                            String resul = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul);

                            }

                            break;

                        case "¿Suspensión trasera demasiado suave?":

                            b.Obtenersuspensiontracerasuave(radioButton.getText().toString());
                            String resul2 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul2);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul2);

                            }

                            break;

                        case "¿El amortiguador trasero tiene fugas de aceite?":

                            b.Obtenersuspensiontraceraaceite(radioButton.getText().toString());
                            String resul3 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul3);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul3);

                            }

                            break;

                        case "¿Suspensión delantera demasiado dura?":

                            b.Obtenersuspensiondelanteradura(radioButton.getText().toString());
                            String resul4 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul4);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul4);

                            }

                            break;

                        case "¿Suspensión delantera demasiado suave?":

                            b.Obtenersuspensiondelanterasuave(radioButton.getText().toString());
                            String resul5 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul5);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul5);

                            }

                            break;

                        case "¿La suspensión delantera presenta fugas de aceite?":

                            b.Obtenersuspensiondelanterafugaaceite(radioButton.getText().toString());
                            String resul6 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul6);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul6);

                            }

                            break;

                        case "¿Golpe anormal en la suspensión delantera?":

                            b.Obtenersuspensiondelanteragolpe(radioButton.getText().toString());
                            String resul7 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul7);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul7);

                            }

                            break;

                        case "¿Jaloneo hacia un lado en la suspensión trasera?":

                            b.Obtenersuspensionjaloneatracera(radioButton.getText().toString());
                            String resul8 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul8);

                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul8);

                            }

                            break;

                        case "¿Manubrios no responden o no son lisos?":

                            b.Obtenersuspensionrespondemanubrios(radioButton.getText().toString());
                            String resul9 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul9);

                            } else {
                                alertapersonalizada("*PROBABLEMENTE SU TIPO DE PROBLEMA NO SEA DE SUSPENSIÓN ESCOJA OTRO DIFERENTE*");

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
