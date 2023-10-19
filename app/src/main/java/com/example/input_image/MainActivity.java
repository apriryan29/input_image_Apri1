package com.example.input_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean cek = true;
    public void Tekan(View view){
        Log.i("Info", "Gambar diTekan!");
        ImageView poke1 = findViewById(R.id.imageView);
        ImageView poke2 = findViewById(R.id.imageView2);

        if (cek){
            poke1.animate().alpha(0).setDuration(2000);
            poke2.animate().alpha(1).setDuration(2000);
            cek=false;
        }
        else {
            poke1.animate().alpha(1).setDuration(2000);
            poke2.animate().alpha(0).setDuration(2000);
            cek=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}