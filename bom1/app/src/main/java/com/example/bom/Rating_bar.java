package com.example.bom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Rating_bar extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating_bar);
        imageView = (ImageView)findViewById(R.id.rk1);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rating_bar.this, MainActivity.class);
                Toast.makeText(Rating_bar.this,"소중한 의견 감사합니다!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


    }
}