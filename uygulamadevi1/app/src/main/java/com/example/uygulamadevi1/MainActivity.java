package com.example.uygulamadevi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerr;
    String ogrisimleri[]={"Ali Hizmetçi","Arif Gündüz","Enes Karpuz","Ali Güzel"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        adaptorOlustur();
        spinneraEkle();
    }
    public void tanimla()
    {
        spinnerr = findViewById(R.id.spinner);
    }
    public void adaptorOlustur()
    {
    arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ogrisimleri);
    }
    public void spinneraEkle()
    {
        spinnerr.setAdapter(arrayAdapter);
    }
}