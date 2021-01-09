package com.example.rndpetgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        buton1Tikla();
        buton2Tikla();
        buton3Tikla();

    }

    public void tanimla() {
        img  = findViewById(R.id.imageView);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
    }
    public void buton1Tikla(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                degistir(1);
            }
        });
    }

    public void buton2Tikla(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int rnd = (int)(Math.random()*10+1);
                System.out.println(""+rnd);
            degistir(rnd);
            }
        });
    }

    public void buton3Tikla(){
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               degistir(10);
            }
        });
    }
    public void degistir(int sayi){
        if (sayi==0){
            img.setImageResource(R.drawable.pet1);
        }
        else if (sayi==1){
            img.setImageResource(R.drawable.pet2);
        }
        else if (sayi==2){
            img.setImageResource(R.drawable.pet3);
        }
        else if (sayi==3){
            img.setImageResource(R.drawable.pet4);
        }
        else if (sayi==4){
            img.setImageResource(R.drawable.pet5);
        }
        else if (sayi==5){
            img.setImageResource(R.drawable.pet6);
        }
        else if (sayi==6){
            img.setImageResource(R.drawable.pet7);
        }
        else if (sayi==7){
            img.setImageResource(R.drawable.pet8);
        }
        else if (sayi==8){
            img.setImageResource(R.drawable.pet9);
        }
        else if (sayi==9){
            img.setImageResource(R.drawable.pet10);
        }
        else if(sayi==10){
            img.setImageResource(R.drawable.pet11);
        }

    }

}