package com.example.dcf.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = (ImageView)findViewById(R.id.imageView4);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.anim);
        img.startAnimation(anim);
        Thread t = new Thread(){

            @Override
            public void run() {
                try{

                    sleep(3000);

                }catch (InterruptedException e){
                        e.printStackTrace();
                }finally {

                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            }
        };

        t.start();


    }
}
