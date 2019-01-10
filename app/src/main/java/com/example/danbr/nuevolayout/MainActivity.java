package com.example.danbr.nuevolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public Spinner spinColores, spinImagen, spinFrase, spinSonido;

    public String[] colores = {"Blanco","Amarillo","Azul","Gris","Naranja","Negro","Purpura","Rojo","Verde"};
    public String[] imagenes = {"vacio","carraso","carrasogif","conejo","conejogif","gatos","gatosgif","modelo","modelogif","moto","motogif","perro","perrogif","pikachu","pikachugif"};
    public String[] frases = {"ninguna","Amor","Belleza","Esperanza","Cohelo","Inteligencia","Respeto","Sorpresa","Optimismo"};
    public String[] sonidos = {"silencio","explosion","grillo","laser","mensaje","gritopikachu","redobles","trompeta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinColores = (Spinner) findViewById(R.id.spinner);
        spinColores.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colores));

        spinImagen = (Spinner) findViewById(R.id.spinner2);
        spinImagen.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, imagenes));

        spinFrase = (Spinner) findViewById(R.id.spinner3);
        spinFrase.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, frases));

        spinSonido = (Spinner) findViewById(R.id.spinner4);
        spinSonido.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sonidos));

    }

    public void cambiar(View view){

        Intent cambio = new Intent(this,SegundoActivity.class);

        cambio.putExtra("color",spinColores.getSelectedItem().toString());
        cambio.putExtra( "imagen",spinImagen.getSelectedItem().toString());
        cambio.putExtra("texto",spinFrase.getSelectedItem().toString());
        cambio.putExtra("sonido",spinSonido.getSelectedItem().toString());

        startActivity(cambio);

    }

    public void cambiarRandom(View view){

        Intent cambio = new Intent(this,SegundoActivity.class);

        int randCol= (int) (8*Math.random());
        int randImg= (int) (14*Math.random());
        int randFrase= (int) (8*Math.random());
        int randSon= (int) (7*Math.random());

        cambio.putExtra("color",colores[randCol]);
        cambio.putExtra( "imagen",imagenes[randImg]);
        cambio.putExtra("texto",frases[randFrase]);
        cambio.putExtra("sonido",sonidos[randSon]);

        startActivity(cambio);

    }

}
