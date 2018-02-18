package com.example.toshiba.rinaldi_1106130092_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pilihmenu extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihmenu);
        rg = findViewById(R.id.radiogroup);
    }

    public void masukindata(View view) {
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilihan = rb.getText().toString();
        switch (pilihan){
            case "Dine In":
                startActivity(new Intent(pilihmenu.this, dinnerin.class));
                Toast.makeText(pilihmenu.this, "Memilih Dinner In", Toast.LENGTH_SHORT).show();
                break;
            case "Take Away":
                startActivity(new Intent(pilihmenu.this, takeaway.class));
                Toast.makeText(pilihmenu.this, "Memilih Take Away", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
