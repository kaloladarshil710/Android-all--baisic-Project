package com.example.intentpassing_bundlepassing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext = new Intent(MainActivity.this, SecondActivity.class);
                iNext.putExtra("title", "Home");
                iNext.putExtra("Name", "Darshil");
                iNext.putExtra("Roll No", "2232323323232"); // Changed to String

                startActivity(iNext);
            }
        });
    }
}
