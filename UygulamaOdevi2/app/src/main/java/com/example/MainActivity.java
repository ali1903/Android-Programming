package com.example.uygukkamaodevi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnYeniKullanici;
    Button btnGirisYap;
    Button btnKullaniciGirisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYeniKullanici=findViewById(R.id.button1);
        btnKullaniciGirisi=findViewById(R.id.button2);

        btnKullaniciGirisi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sayfaiki= new Intent(MainActivity.this,girisyap.class);
                    startActivity(sayfaiki);
                }
        });

        btnYeniKullanici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfauc = new Intent(MainActivity.this, yeni_kullanici.class);
                startActivity(sayfauc);
            }
        });

        }
    }