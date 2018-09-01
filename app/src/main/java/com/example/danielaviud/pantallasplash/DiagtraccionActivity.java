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

public class DiagtraccionActivity extends AppCompatActivity {

    BaseConocimiento b=new BaseConocimiento();

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView pregunta;
    Button dignostico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagtraccion);
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


                        case "¿La cadena pierde su tensión constantemente?":

                            b.Obtenercadenatension(radioButton.getText().toString());
                            String resul = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul);

                            }

                            break;

                        case "¿Oxidación de la cadena?":

                            b.Obteneroxidacion(radioButton.getText().toString());
                            String resul2 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul2);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul2);

                            }

                            break;

                        case "¿La cadena se sale de su lugar constantemente?":

                            b.Obtenercadenasale(radioButton.getText().toString());
                            String resul3 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul3);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul3);

                            }

                            break;

                        case "¿Ruidos anormales en el motor?":

                            b.Obtenerruidoanormal(radioButton.getText().toString());
                            String resul4 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul4);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul4);

                            }

                            break;

                        case "¿Sonido al dar la caja de cambios?":

                            b.Obtenersonidocaja(radioButton.getText().toString());
                            String resul5 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul5);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul5);

                            }

                            break;

                        case "¿Ruidos o movimientos anormales de las ruedas?":

                            b.Obtenerrodamientorueda(radioButton.getText().toString());
                            String resul6 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul6);


                            } else {
                                radioGroup.clearCheck();
                                pregunta.setText(resul6);

                            }

                            break;

                        case "¿Al dar caja de cambios no da marcha la motocicleta?":

                            b.Obtenermarchacambio(radioButton.getText().toString());
                            String resul7 = b.resultado;

                            if (radioButton.getText().equals("SI")) {

                                alertapersonalizada(resul7);


                            } else {
                                alertapersonalizada("*PROBABLEMENTE SU TIPO DE PROBLEMA NO SEA DE TRACCIÓN ESCOJA OTRO DIFERENTE*");

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
