package com.example.projekberita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Berita4 extends AppCompatActivity {


private ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita_fashion1);

        button = findViewById(R.id.beritaback1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Berita4.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }

}