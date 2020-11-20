package com.example.uygulamadevi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerr;
    String ogrisimleri[]={"Ali Hizmetçi","Arif Gündüz","Enes Karpuz","Ali Güzel"};
    ArrayAdapter arrayAdapter;
    TextView textview;
    CheckBox chc1;
    CheckBox chc2;
    CheckBox chc3;
    CheckBox chc4;
    CheckBox chc5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        adaptorOlustur();
        spinneraEkle();
        textviewaSpinnerEkle();
    }
    public void tanimla()
    {
        spinnerr = findViewById(R.id.spinner);
        textview = findViewById(R.id.textview);
        chc1 = findViewById(R.id.checkc1);
        chc2 = findViewById(R.id.checkc2);
        chc3 = findViewById(R.id.checkc3);
        chc4 = findViewById(R.id.checkc4);
        chc5 = findViewById(R.id.checkc5);



    }
    public void adaptorOlustur()
    {
    arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ogrisimleri);
    }
    public void spinneraEkle()
    {
        spinnerr.setAdapter(arrayAdapter);
    }
    public void textviewaSpinnerEkle()
    {
        spinnerr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textview.setText(spinnerr.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        chc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chc1.isChecked())
                {
                    textview.setText(chc1.getText().toString());
                }
            }
        });
        chc2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chc2.isChecked())
                {
                    textview.setText(chc2.getText().toString());
                }
            }
        });
        chc3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chc3.isChecked())
                {
                    textview.setText(chc3.getText().toString());
                }
            }
        });
        chc4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chc4.isChecked())
                {
                    textview.setText(chc4.getText().toString());
                }
            }
        });
        chc5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chc5.isChecked())
                {
                    textview.setText(chc5.getText().toString());
                }
            }
        });
    }


}