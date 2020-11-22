package com.example.uygukkamaodevi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yeni_kullanici extends AppCompatActivity {

    Button btnKaydol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeni_kullanici);

        btnKaydol =findViewById(R.id.button1);
        btnKaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfabir= new Intent(yeni_kullanici.this,girisyap.class);
                startActivity(sayfabir);
            }
        });

    }
}