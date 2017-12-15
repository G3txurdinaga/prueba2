package com.example.ik_2dm3.g3_team;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;




public class Main2Activity extends AppCompatActivity {

    private TextView tvTexto;
    private ImageView imgEscarabillera;
    private FloatingActionButton btntexto;
    private int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgEscarabillera=  findViewById(R.id.escarabilleraView);

        imgEscarabillera.setBackgroundResource(R.drawable.escarabillera);



        btntexto =  findViewById(R.id.btnTexto);
        tvTexto=  findViewById(R.id.tvBocadillos);
        contador=1;
        AnimationDrawable frameAnimation = (AnimationDrawable) imgEscarabillera.getBackground();
        frameAnimation.start();

        btntexto.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {



                contador++;

                switch (contador){
                    case 1:
                        tvTexto.setText(R.string.frase1);
                        break;
                    case 2:
                        tvTexto.setText(R.string.frase2);
                        break;
                    case 3:
                        tvTexto.setText(R.string.frase3);
                        break;
                    case 4:
                        tvTexto.setText(R.string.frase4);
                        break;
                    case 5:
                        Intent intent = new Intent(Main2Activity.this, MapActivity.class);
                        startActivity(intent);
                        finish();
                }
            }
        });


    }
}
