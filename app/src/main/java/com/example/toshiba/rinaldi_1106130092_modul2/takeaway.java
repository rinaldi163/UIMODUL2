package com.example.toshiba.rinaldi_1106130092_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        setTitle("Take Away");
    }

    public void lihatinmenu(View view) {
        startActivity(new Intent(takeaway.this, menu.class));
        finish();
    }
}
