package com.example.danielaviud.pantallasplash;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;

public class AyudaActivity extends AppCompatActivity {

    ViewPager viewPager;
    int images[] = {R.drawable.ayuda1, R.drawable.ayuda2, R.drawable.ayuda3, R.drawable.ayuda4, R.drawable.ayuda5};
    MyCustomPagerAdapter myCustomPagerAdapter;

    /*private ImageSwitcher imageSwitcher;
    private int[] galeria = { R.drawable.ayuda1, R.drawable.ayuda2, R.drawable.ayuda3, R.drawable.ayuda4, R.drawable.ayuda5 };
    private int posicion;
    private static final int DURACION = 9000;
    private Timer timer = null;
   */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        myCustomPagerAdapter = new MyCustomPagerAdapter(AyudaActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);

        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(), 2000, 6000);




       /* imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory()
        {
            public View makeView()
            {
                ImageView imageView = new ImageView(AyudaActivity.this);
                // he utilizado el tipo de escalado CENTER_CROP, que ajusta la imagen al slider sin que se pierdan las proporciones de la imagen.
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

                return imageView;
            }
        });


        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    public void run()
                    {
                        imageSwitcher.setImageResource(galeria[posicion]);
                        posicion++;
                        if (posicion == galeria.length)
                            posicion = 0;
                    }
                });
            }
        }, 0, DURACION);

*/

    }



    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            AyudaActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem()==0){
                        //viewPager.setCurrentItem(1);
                        viewPager.setCurrentItem(1, true);
                    }else if(viewPager.getCurrentItem()==1){
                        //viewPager.setCurrentItem(2);
                        viewPager.setCurrentItem(2, true);
                    }else if(viewPager.getCurrentItem()==2){
                        //viewPager.setCurrentItem(0);
                        viewPager.setCurrentItem(3, true);
                    }else if(viewPager.getCurrentItem()==3){
                        //viewPager.setCurrentItem(0);
                        viewPager.setCurrentItem(4, true);
                    }
                    else if(viewPager.getCurrentItem()==4){
                        //viewPager.setCurrentItem(0);
                        viewPager.setCurrentItem(0, true);
                    }
                }
            });
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
