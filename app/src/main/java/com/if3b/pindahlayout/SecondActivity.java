package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Selamat datang");

        tvNama = findViewById(R.id.tv_nama);

        Intent terima = getIntent();
        String ynama = terima.getStringExtra("xnama");
        tvNama.setText(ynama);
    }
}