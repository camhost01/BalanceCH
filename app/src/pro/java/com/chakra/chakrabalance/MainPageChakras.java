package com.chakra.chakrabalance;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidx.appcompat.app.AppCompatActivity;

public class MainPageChakras extends AppCompatActivity implements View.OnClickListener {
    private Button bt_allchakras,bt_custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreen_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
        @Override
        public void onInitializationComplete(InitializationStatus initializationStatus) {
        }
    });

        bt_allchakras = (Button)findViewById(R.id.bt_allchakras);
        bt_custom = (Button)findViewById(R.id.bt_custom_ck);

        bt_allchakras.setOnClickListener(this);
        bt_custom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_allchakras:
                openScreen("1");
                break;
            case R.id.bt_custom_ck:
                openScreen("2");
                break;
        }

    }

    private void openScreen(String s) {
        switch (s){
            case "1":
                Intent allchakras = new Intent(this, Page2Chackas.class);
                startActivity(allchakras);
                break;
            case "2":
                Intent customCK = new Intent(this, Page3CustomCK.class);
                startActivity(customCK);
                break;
        }
    }

}
