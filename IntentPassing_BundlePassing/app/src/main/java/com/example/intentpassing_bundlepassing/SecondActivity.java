package com.example.intentpassing_bundlepassing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textname = findViewById(R.id.textname);
        Button btnBack = findViewById(R.id.btnBack);

        Intent formAct = getIntent();
        String title = formAct.getStringExtra("title");
        String name = formAct.getStringExtra("Name");
        String rollno = formAct.getStringExtra("Roll No"); // Changed to String
//
        textname.setText(String.format("Title: %s\nRoll No: %s\nName: %s\n",title,name,rollno));
//

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }
}
