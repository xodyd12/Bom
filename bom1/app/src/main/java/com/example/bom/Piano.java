package com.example.bom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Piano extends AppCompatActivity {

    SoundPool pool;
    int d1;
    int d2;
    int re;
    int re2;
    int mi;
    int fa;
    int fa2;
    int sol;
    int sol2;
    int ra;
    int ra2;
    int si;
    int d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window win=getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.piano);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //액티비티의 앱바(App Bar)로 지정
        ActionBar actionBar = getSupportActionBar(); //앱바 제어를 위해 툴바 액세스
        actionBar.setDisplayHomeAsUpEnabled(true); // 앱바에 뒤로가기 버튼 만들기

        pool=new SoundPool(4, AudioManager.STREAM_MUSIC,0);
        d1=pool.load(this,R.raw.d1,1);
        d2=pool.load(this,R.raw.d2,1);
        re=pool.load(this,R.raw.re,1);
        re2=pool.load(this,R.raw.re2,1);
        mi=pool.load(this,R.raw.mi,1);
        fa=pool.load(this,R.raw.fa,1);
        fa2=pool.load(this,R.raw.fa2,1);
        sol=pool.load(this,R.raw.sol,1);
        sol2=pool.load(this,R.raw.sol2,1);
        ra=pool.load(this,R.raw.ra,1);
        ra2=pool.load(this,R.raw.ra2,1);
        si=pool.load(this,R.raw.si,1);
        d3=pool.load(this,R.raw.do3,1);
    }
    public void mOnClick(View v){

        switch(v.getId())
        {
            case R.id.button1:
                pool.play(d1,1,1,0,0,1);
                break;
            case R.id.button2:
                pool.play(d2,1,1,0,0,1);
                break;
            case R.id.button3:
                pool.play(re,1,1,0,0,1);
                break;
            case R.id.button4:
                pool.play(re2,1,1,0,0,1);
                break;
            case R.id.button5:
                pool.play(mi,1,1,0,0,1);
                break;
            case R.id.button6:
                pool.play(fa,1,1,0,0,1);
                break;
            case R.id.button7:
                pool.play(fa2,1,1,0,0,1);
                break;
            case R.id.button8:
                pool.play(sol,1,1,0,0,1);
                break;
            case R.id.button9:
                pool.play(sol2,1,1,0,0,1);
                break;
            case R.id.button10:
                pool.play(ra,1,1,0,0,1);
                break;
            case R.id.button11:
                pool.play(ra2,1,1,0,0,1);
                break;
            case R.id.button12:
                pool.play(si,1,1,0,0,1);
                break;
            case R.id.button13:
                pool.play(d3,1,1,0,0,1);
                break;

        }
    }
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
    }
}