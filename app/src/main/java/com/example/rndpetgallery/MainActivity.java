package com.example.rndpetgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.AllPermission;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tanimla();
    toast();


    }

    public void tanimla(){
        btn1= findViewById(R.id.ToastAc);
        btn2= findViewById(R.id.AlertAc);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAc();
            }
        });

    }
    public void toast(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "LongText", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void dialogAc(){
        LayoutInflater ınflater = getLayoutInflater();
        View view = ınflater.inflate(R.layout.alerlayout,null);

      final EditText text1 = view.findViewById(R.id.text1);
       final Button   btn2  = view.findViewById(R.id.AlertAc);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(view);
        AlertDialog dialog =alert.create();


    }



}

