package com.chakra.chakrabalance;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Page2Chackas extends AppCompatActivity implements View.OnClickListener {

    private ImageButton bt_chakra1_play,bt_chakra2_play,bt_chakra3_play,bt_chakra4_play,
                        bt_chakra5_play, bt_chakra6_play, bt_chakra7_play;
    public MediaPlayer mp;
    private ConstraintLayout cly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allchakras_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bt_chakra1_play = (ImageButton) findViewById(R.id.bt_ck1_play);
        bt_chakra2_play = (ImageButton) findViewById(R.id.bt_ck2_play);
        bt_chakra3_play = (ImageButton) findViewById(R.id.bt_ck3_play);
        bt_chakra4_play = (ImageButton) findViewById(R.id.bt_ck4_play);
        bt_chakra5_play = (ImageButton) findViewById(R.id.bt_ck5_play);
        bt_chakra6_play = (ImageButton) findViewById(R.id.bt_ck6_play);
        bt_chakra7_play = (ImageButton) findViewById(R.id.bt_ck7_play);

        cly = (ConstraintLayout) findViewById(R.id.CLY);

        bt_chakra1_play.setOnClickListener(this);
        bt_chakra2_play.setOnClickListener(this);
        bt_chakra3_play.setOnClickListener(this);
        bt_chakra4_play.setOnClickListener(this);
        bt_chakra5_play.setOnClickListener(this);
        bt_chakra6_play.setOnClickListener(this);
        bt_chakra7_play.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.bt_ck1_play:
                reproducirchakra1();
                break;

                case R.id.bt_ck2_play:
                reproducirchakra2();
                break;

            case R.id.bt_ck3_play:
                reproducirchakra3();
                break;

            case R.id.bt_ck4_play:
                reproducirchakra4();
                break;

            case R.id.bt_ck5_play:
                reproducirchakra5();
                break;
            case R.id.bt_ck6_play:
                reproducirchakra6();
                break;
            case R.id.bt_ck7_play:
                reproducirchakra7();
                break;
        }

    }

    private void reproducirchakra7() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra7);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFFAA00FF);
    }

    private void reproducirchakra6() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra6);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFF0B2261);
    }

    private void reproducirchakra5() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra5);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFF06D2F1);
    }

    private void reproducirchakra4() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra4);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFF64F30A);
    }

    private void reproducirchakra3() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra3);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFFFFD600);
    }

    private void reproducirchakra2() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra2);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFFFFAB00);

    }

    private void reproducirchakra1() {
        killSounds();
        mp = MediaPlayer.create(this, R.raw.chakra1);
        mp.setLooping(true);
        mp.start();
        cly.setBackgroundColor(0xFFD50000);


    }
    @Override
    public void onBackPressed(){
        killSounds();
        this.finish();
    }
    public void killSounds(){
        try{
            mp.stop();
            mp.release();
        }
        catch(Exception e) {
            //Eat it and do nothing because it's just going to be an NPE when mPlayer is null, which doesn't matter because we're handling it
        }
    }
}