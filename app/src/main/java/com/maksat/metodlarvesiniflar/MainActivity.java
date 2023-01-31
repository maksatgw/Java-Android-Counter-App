package com.maksat.metodlarvesiniflar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("On create Called");

    }

    //Counter ++
    int sayi = 0;
    public void counter(View view){
        TextView textView = findViewById(R.id.textView);
        sayi++;
        String s = String.valueOf(sayi);
        textView.setText(s);
    }

    //Counter --
    public void counterDec(View view){
        TextView textView = findViewById(R.id.textView);
        sayi--;
        String s = String.valueOf(sayi);
        textView.setText(s);
    }
}