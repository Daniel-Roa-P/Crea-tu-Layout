package com.example.danbr.nuevolayout;

import android.content.Intent;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SegundoActivity extends AppCompatActivity {

    public ImageView imagen;
    public ConstraintLayout fondo;
    public TextView frase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        imagen = (ImageView) findViewById(R.id.imageView);
        fondo = (ConstraintLayout) findViewById(R.id.fondo);
        frase = (TextView)findViewById(R.id.textView2);

        Resources resources = getResources();

        int idcolor = resources.getIdentifier(getIntent().getStringExtra("color"), "color", getPackageName());
        int idImagen = getResources().getIdentifier("@raw:carraso" , null, null);
        int idtexto = resources.getIdentifier(getIntent().getStringExtra("texto"), "string",getPackageName());
        fondo.setBackgroundColor(getResources().getColor(idcolor));
        imagen.setImageResource(idImagen);
        frase.setText(getResources().getString(idtexto));
    }

    public void cambiar(View view){

        Intent cambio = new Intent(this,MainActivity.class);
        startActivity(cambio);

    }

}
