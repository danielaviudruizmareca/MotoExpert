package com.example.danielaviud.pantallasplash;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneNumberUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.URLEncoder;

public class InfoActivity extends AppCompatActivity {

    ImageView butwap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        butwap=(ImageView)findViewById(R.id.butonwap);

        butwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wa();
            }
        });


    }



    private void wa(){
        String numero="59173960136";
        boolean estainstalado=estainstadowhatsapp("com.whatsapp");
        if(estainstalado){
            Intent i=new Intent("android.intent.action.MAIN");
            i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
            i.putExtra("jid",PhoneNumberUtils.stripSeparators(numero)+"@s.whatsapp.net");
            startActivity(i);
        }
        else {
            //Uri uri=Uri.parse("market://details?id=com.whatsapp");
            //Intent gotoMarket=new Intent(Intent.ACTION_VIEW,uri);
            Toast.makeText(this,"whatsapp no esta instalado",Toast.LENGTH_LONG).show();
            //startActivity(gotoMarket);
        }

    }

    private boolean estainstadowhatsapp(String uri){
        PackageManager pm=getPackageManager();
        boolean app_ista=false;
        try {
            pm.getPackageInfo(uri,PackageManager.GET_ACTIVITIES);
            app_ista=true;
        }
        catch (PackageManager.NameNotFoundException e){
            app_ista=false;
        }
        return app_ista;

    }



    public  void abrirwhatsapp(View view){

        try {
            Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
            startActivity(i);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


    public void correo(View view){
        Intent localIntent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "dani.1249@hotmail.com", null));
        localIntent.putExtra("android.intent.extra.SUBJECT", "MOTOEXPERT v1.6.20");
        startActivity(localIntent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
