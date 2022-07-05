package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MountainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        ImageView rinjani = findViewById(R.id.iv_rinjani);
        rinjani.setImageResource(R.drawable.rinjani);
        ImageView pergasingan = findViewById(R.id.iv_pergasingan);
        pergasingan.setImageResource(R.drawable.pergasingan);
        ImageView sempana = findViewById(R.id.iv_sempana);
        sempana.setImageResource(R.drawable.sempana);
        ImageView nanggi = findViewById(R.id.iv_nanggi);
        nanggi.setImageResource(R.drawable.nanggi);
        ImageView tunak = findViewById(R.id.iv_tunak);
        tunak.setImageResource(R.drawable.tunak);


        TextView tvjarakrinjani = (TextView) findViewById(R.id.tv_jrkrinjani);
        TextView tvjarakpergasingan = (TextView) findViewById(R.id.tv_jarakpergasingan);
        TextView tvjaraksempana = (TextView) findViewById(R.id.tv_jrksempana);
        TextView tvjaraknanggi = (TextView) findViewById(R.id.tv_jrknanggi);
        TextView tvjaraktunak = (TextView) findViewById(R.id.tv_jrktunak);


        tvjarakrinjani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/kota+mataram/rinjani/@-8.4940451,115.9987231,10z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcc2d800216cccf:0x3c03cdbf11d30a1e!2m2!1d116.4573488!2d-8.4112952?hl=id";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });
        tvjarakpergasingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/kota+mataram/Bukit+Pergasingan,+Sembalun+Lawang,+Sembalun,+Sembalun+Lawang,+Sembalun,+East+Lombok+Regency,+West+Nusa+Tenggara+83656/@-8.4763684,116.0483226,10z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcc321fd286476d:0x3a9263fd14e1cd13!2m2!1d116.5330492!2d-8.3454136?hl=id";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });
        tvjaraksempana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/kota+mataram/Sempana+Hill,+Sambelia,+Sembalun+Bumbung,+Kabupaten+Lombok+Timur,+Nusa+Tenggara+Barat/@-8.5607375,116.1997757,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcc2fdd173081cf:0x3d5d52758b1df262!2m2!1d116.582491!2d-8.383555?hl=id";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });
        tvjaraknanggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/kota+mataram/Nanggi+Hill,+Belanting,+Kabupaten+Lombok+Timur,+Nusa+Tenggara+Barat/@-8.5624445,116.195515,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcc2fd0bb1a7fb7:0x153187bdd3e8e41c!2m2!1d116.571918!2d-8.386969?hl=id";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });
        tvjaraktunak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/kota+mataram/TWA+GUNUNG+TUNAK+(+PT.DSL),+Mertak/@-8.7621675,116.1024949,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcd01a2c703372d:0x206a997ab680832d!2m2!1d116.3879294!2d-8.9473919?hl=id";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });

    }
}