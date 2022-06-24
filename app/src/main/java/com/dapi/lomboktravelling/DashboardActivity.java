package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView pantai =findViewById(R.id.iv_beach);
        pantai.setImageResource(R.drawable.pantai);
        ImageView hill =findViewById(R.id.iv_hill);
        hill.setImageResource(R.drawable.hill);
        ImageView terjun =findViewById(R.id.iv_waterfall);
        terjun.setImageResource(R.drawable.terjun);
        ImageView rest =findViewById(R.id.iv_rest);
        rest.setImageResource(R.drawable.rest);
        ImageView culture =findViewById(R.id.iv_culture);
        culture.setImageResource(R.drawable.budaya);
        ImageView religi =findViewById(R.id.iv_religi);
        religi.setImageResource(R.drawable.religi);
    }
}