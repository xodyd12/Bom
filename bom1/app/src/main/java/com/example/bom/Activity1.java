package com.example.bom;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Activity1 extends AppCompatActivity {

    int cnt = 0;
    int images[] = {R.drawable.bom1_1, R.drawable.bom1_2, R.drawable.bom1_3, R.drawable.bom1_4, R.drawable.bom1_5,
            R.drawable.bom1_6, R.drawable.bom1_7, R.drawable.bom1_8, R.drawable.bom1_9, R.drawable.bom1_10,
            R.drawable.bom1_11, R.drawable.bom1_12, R.drawable.bom1_13, R.drawable.bom1_14, R.drawable.bom1_15,};
    Button back;
    Button next;
    ImageView image1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //액티비티의 앱바(App Bar)로 지정
        ActionBar actionBar = getSupportActionBar(); //앱바 제어를 위해 툴바 액세스
        actionBar.setDisplayHomeAsUpEnabled(true); // 앱바에 뒤로가기 버튼 만들기

        back = (Button) findViewById(R.id.back);
        next = (Button) findViewById(R.id.next);
        image1 = (ImageView) findViewById(R.id.bom1_1);


        back.setOnClickListener(click);
        next.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("logMsg", "index" + "cnt");
            switch (v.getId()) {
                case R.id.back:
                    if (cnt > 0) {
                        image1.setImageResource(images[--cnt]);

                    }

                    break;

                case R.id.next:
                    if (cnt < images.length - 1) {
                        image1.setImageResource(images[++cnt]);

                    }

            }
        }
    };

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case android.R.id.home: //툴바 뒤로가기버튼 눌렸을 때 동작
                finish ();
                return true;
            default:
                return super.onOptionsItemSelected (item);
        }
    }}


