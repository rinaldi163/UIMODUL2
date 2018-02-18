package com.example.toshiba.rinaldi_1106130092_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class Detail extends AppCompatActivity {
    ImageView gambar;
    TextView nama, harga, komposisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Menu");

        gambar = findViewById(R.id.detail_gambar);
        nama = findViewById(R.id.detail_nama);
        harga = findViewById(R.id.detail_harga);
        komposisi = findViewById(R.id.detail_komposisi);

        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar"))));
        nama.setText(getIntent().getStringExtra("nama"));
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
    }
}



