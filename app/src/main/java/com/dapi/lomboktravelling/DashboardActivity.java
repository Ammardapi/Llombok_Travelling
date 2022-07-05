package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView logout = (TextView) findViewById(R.id.tv_logout);

        ImageView pantai =findViewById(R.id.iv_beach);
        pantai.setImageResource(R.drawable.pantai);
        ImageView hill =findViewById(R.id.iv_hill);
        hill.setImageResource(R.drawable.hill);
        ImageView terjun =findViewById(R.id.iv_waterfall);
        terjun.setImageResource(R.drawable.terjun);
        ImageView culture =findViewById(R.id.iv_culture);
        culture.setImageResource(R.drawable.budaya);
        ImageView religi =findViewById(R.id.iv_religi);
        religi.setImageResource(R.drawable.religi);



        pantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, BeachActivity.class);
                startActivity(intent);
            }
        });
        hill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MountainActivity.class);
                startActivity(intent);
            }
        });
        terjun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, WaterfallActivity.class);
                startActivity(intent);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, CultureActivity.class);
                startActivity(intent);
            }
        });
        religi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ReligiActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}