package com.example.animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btnTranslate,btnAlpha,btnRotate,btnScale;
    TextView txtAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim=findViewById(R.id.txtAnim);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);


        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                txtAnim.startAnimation(move);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txtAnim.startAnimation(rotate);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });


    }
}