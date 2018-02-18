package com.example.toshiba.rinaldi_1106130092_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    RecyclerView rv;
    menuadapter adapter;
    List<pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.list_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listmenu.add(new pilihanmenu(R.drawable.nasigorengayam, "nasi goreng ayam", 15000, "nasi, ayam, bumbu rahasia"));
        listmenu.add(new pilihanmenu(R.drawable.nasigorengkambing, "nasi goreng kambing", 13500, "nasi, kambing, bumbu rahasia"));
        listmenu.add(new pilihanmenu(R.drawable.nasigorengkorea, "nasi goreng korea", 20000, "nasi, bumbu rahasia"));
        listmenu.add(new pilihanmenu(R.drawable.nasigorengseafood, "nasi goreng seafood", 17000, "nasi, seafood, bumbu rahasia"));
        listmenu.add(new pilihanmenu(R.drawable.nasiliwet, "nasi liwet", 50000, "nasi, telur, ketan, bumbu rahasia"));
        adapter = new menuadapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
