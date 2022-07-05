package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ReligiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religi);

        ImageView ic = findViewById(R.id.iv_ic);
        ic.setImageResource(R.drawable.ic);
        ImageView syeikh = findViewById(R.id.iv_syiekh);
        syeikh.setImageResource(R.drawable.syeikh);
        ImageView baloq = findViewById(R.id.iv_baloq);
        baloq.setImageResource(R.drawable.baloq);
        ImageView batulayar = findViewById(R.id.iv_batulayar);
        batulayar.setImageResource(R.drawable.batulayar);
        ImageView rembitan = findViewById(R.id.iv_rembitan);
        rembitan.setImageResource(R.drawable.rembitan);
    }
}