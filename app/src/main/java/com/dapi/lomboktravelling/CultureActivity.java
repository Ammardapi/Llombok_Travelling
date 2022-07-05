package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);

        ImageView sade = findViewById(R.id.iv_sade);
        sade.setImageResource(R.drawable.sade);
        ImageView tenun = findViewById(R.id.iv_tenun);
        tenun.setImageResource(R.drawable.tenun);
        ImageView nyale = findViewById(R.id.iv_nyale);
        nyale.setImageResource(R.drawable.nyale);
        ImageView topat = findViewById(R.id.iv_topat);
        topat.setImageResource(R.drawable.topat);
        ImageView nyongkolan = findViewById(R.id.iv_nyongkolan);
        nyongkolan.setImageResource(R.drawable.nyongkolan);
    }
}