package com.example.customcardview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class    MainActivity extends AppCompatActivity {
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardView);

        cardView.setRadius(5.0f);
        cardView.setCardElevation(11.0f);
        cardView.setUseCompatPadding(true);
    }
}