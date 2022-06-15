package com.example.retrofittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView dataview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataview = findViewById(R.id.TEST);
        dataview.setText("김해경전철 정보");
        railroadView railroadView = new railroadView(this, 1 ,5);
        railroadView.loadData();

    }

}