package com.example.danbr.nuevolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public Spinner spinColores,spinImagen,spinFrase,spinSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinColores = (Spinner) findViewById(R.id.spinner);
        String[] colores = {"Blanco","Amarillo","Azul","Gris","Naranja","Negro","Purpura","Rojo","Verde","Random"};
        spinColores.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colores));

        spinImagen = (Spinner) findViewById(R.id.spinner2);
        String[] imagenes = {"Vacio","carraso","carrasogif","conejo","conejogif","gatos","gatosgif","modelo","modelogif","moto","motogif","perro","perrogif","pikachu","pikachugif","Random"};
        spinImagen.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, imagenes));

        spinFrase = (Spinner) findViewById(R.id.spinner3);
        String[] frases = {"ninguna","Amor","Belleza","Esperanza","Cohelo","Inteligencia","Respeto","Sorpresa","Optimismo","Random"};
        spinFrase.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, frases));

        spinSonido = (Spinner) findViewById(R.id.spinner4);
        String[] sonidos = {"Silencio","Explosion","Grillo","Laser","Mensaje","Pikachu","Redobles","Trompeta","Random"};
        spinSonido.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sonidos));

    }
}
