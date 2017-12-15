package com.example.ik_2dm3.g3_team;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    private ImageView img;
    private AnimationDrawable ad;

    private static int tiempoparasiguente = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tvtexto);
        iv = (ImageView) findViewById(R.id.ivimagen);
        img = findViewById(R.id.loadingView);
        img.setBackgroundResource(R.drawable.loading);
        ad =  ( AnimationDrawable) img.getBackground();


        Animation mianim = AnimationUtils.loadAnimation(this,R.anim.mytranssition);
        tv.startAnimation(mianim);
        iv.startAnimation(mianim);
        img.startAnimation(mianim);
        ad.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(homeIntent);

                finish();
            }
        },tiempoparasiguente );


    }
}
