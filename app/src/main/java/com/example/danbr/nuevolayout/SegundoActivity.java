package com.example.danbr.nuevolayout;

import android.content.Intent;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SegundoActivity extends AppCompatActivity {

    public ImageView imagen;
    public ConstraintLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        imagen = (ImageView) findViewById(R.id.imageView);
        fondo = (ConstraintLayout) findViewById(R.id.fondo);

        Resources resources = getResources();

        int resId = resources.getIdentifier("Azul", "color", getPackageName());

        Glide.with(this).load(R.raw.gatosgif).into(imagen);
        fondo.setBackgroundColor(getResources().getColor(resId));
    }

    public void cambiar(View view){

        Intent cambio = new Intent(this,MainActivity.class);
        startActivity(cambio);

    }

}
