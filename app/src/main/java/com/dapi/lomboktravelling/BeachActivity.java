package com.dapi.lomboktravelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);

        ImageView senggigi = findViewById(R.id.iv_senggigi);
        senggigi.setImageResource(R.drawable.senggigi);
        ImageView kuta = findViewById(R.id.iv_kuta);
        kuta.setImageResource(R.drawable.kuta);
        ImageView trawangan = findViewById(R.id.iv_sempana);
        trawangan.setImageResource(R.drawable.trawangan);
        ImageView mawun = findViewById(R.id.iv_mawun);
        mawun.setImageResource(R.drawable.mawun);
        ImageView meno = findViewById(R.id.iv_nanggi);
        meno.setImageResource(R.drawable.meno);


        TextView tvjarakmawun = (TextView) findViewById(R.id.tv_jrkmawun);
        TextView tvjarakmeno = (TextView) findViewById(R.id.tv_jrkmeno);
        TextView tvjaraksenggigi = (TextView) findViewById(R.id.tv_jrksenggigi);
        TextView tvjaraktrawangan = (TextView) findViewById(R.id.tv_jrktrawangan);
        TextView tvjarakkuta = (TextView) findViewById(R.id.tv_jarakkuta);

        tvjarakmeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/Kota+Mataram,+Nusa+Tenggara+Bar./Kepulauan+Gili,+Gili+Indah,+Kec.+Pemenang,+Kabupaten+Lombok+Utara,+Nusa+Tenggara+Bar./@-8.4744374,115.9382396,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf591a7f5ec7:0x830b122bdd101dc5!2m2!1d116.1004894!2d-8.5970808!1m5!1m1!1s0x2d96c75cab17f33d:0x3fdcdcd0727d433e!2m2!1d116.0561632!2d-8.351844";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });

        tvjaraksenggigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/Kota+Mataram,+Nusa+Tenggara+Bar./Pantai+Senggigi,+Nusa+Tenggara+Bar./@-8.5381297,116.0387771,13z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x2dcdbf591a7f5ec7:0x830b122bdd101dc5!2m2!1d116.1004894!2d-8.5970808!1m5!1m1!1s0x2dcde9d6e28dfec9:0xcc02a56300f22ec9!2m2!1d116.0376085!2d-8.4787343!3e0";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });

        tvjaraktrawangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/mataram/gili+trawangan/@-8.4626185,115.9293747,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcde0ab4ff1579f:0xfcea7c174732d4b2!2m2!1d116.0384335!2d-8.3482917";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });
        tvjarakkuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.google.com/maps/dir/Kota+Mataram,+Nusa+Tenggara+Bar./Pantai+Kuta+Lombok,+Kuta,+Kec.+Pujut,+Kabupaten+Lombok+Tengah,+Nusa+Tenggara+Bar.+83573/@-8.7458906,116.0572106,11z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x2dcdbf591a7f5ec7:0x830b122bdd101dc5!2m2!1d116.1004894!2d-8.5970808!1m5!1m1!1s0x2dcda9d5c27174e5:0x7189bdd6dc8af5b!2m2!1d116.2831703!2d-8.8947518!3e0";
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });




        tvjarakmawun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String url="https://www.google.com/maps/dir/Mataram,+Kota+Mataram,+Nusa+Tenggara+Bar./Pantai+Mawun,+Nusa+Tenggara+Bar./@-8.7389528,116.0203421,10.75z/data=!4m14!4m13!1m5!1m1!1s0x2dcdbf5f22de1ef1:0x3030bfbcaf7d0d0!2m2!1d116.1004894!2d-8.5769951!1m5!1m1!1s0x2dcd08008a2d7707:0x2d200c65a5e5a3cd!2m2!1d116.2296696!2d-8.9001329!3e0";
               Intent maps= new Intent(Intent.ACTION_VIEW);
               maps.setData(Uri.parse(url));
               startActivity(maps);

            }
        });
    }
}