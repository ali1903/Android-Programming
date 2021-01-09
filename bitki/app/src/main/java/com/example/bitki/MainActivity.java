package com.example.bitki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSonraki, btnOnceki;
    ImageView img;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        btnOnceki.setOnClickListener(this);
        btnSonraki.setOnClickListener(this);


    }

    public void tanimla() {
        btnSonraki = findViewById(R.id.btnSonraki);
        btnOnceki = findViewById(R.id.btnOnceki);
        img = findViewById(R.id.imgView);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOnceki:
                Intent intent = new Intent(context,activity3.class);
                startActivity(intent);
                break;
            case R.id.btnSonraki:
                Intent i = new Intent(context,activity2.class);
                startActivity(i);
                break;
        }
    }
}