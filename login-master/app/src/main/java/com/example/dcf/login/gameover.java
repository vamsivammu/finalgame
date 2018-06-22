package com.example.dcf.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gameover extends AppCompatActivity implements View.OnClickListener {

    ImageButton b ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);
        b = (ImageButton)findViewById(R.id.imageButton);

    }

public void playagain(){

        finish();
        startActivity(new Intent("game"));

}
    @Override
    public void onClick(View view) {
        if(view == b){
            playagain();

        }
    }
}


