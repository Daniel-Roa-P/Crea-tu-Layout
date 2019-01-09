package com.example.danbr.nuevolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SegundoActivity extends AppCompatActivity {

    public ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        imagen = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load(R.raw.gatosgif).into(imagen);
    }

    public void cambiar(View view){

        Intent cambio = new Intent(this,MainActivity.class);
        startActivity(cambio);

    }

}
