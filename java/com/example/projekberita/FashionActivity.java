package com.example.projekberita;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FashionActivity extends AppCompatActivity {
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    private Button logout,news,fashion,sport,entertainmen,political;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


//        img1 = findViewById(R.id.img1);
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this, Berita1.class);
//                startActivity(intent);
//            }
//        });
//
//        img2 = findViewById(R.id.img2);
//        img2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this, Berita2.class);
//                startActivity(intent);
//            }
//        });
//
//        img3 = findViewById(R.id.img3);
//        img3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this, Berita3.class);
//                startActivity(intent);
//            }
//        });
//
        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita4.class);
                startActivity(intent);
            }
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita5.class);
                startActivity(intent);
            }
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita6.class);
                startActivity(intent);
            }
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita7.class);
                startActivity(intent);
            }
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita8.class);
                startActivity(intent);
            }
        });

//        img9 = findViewById(R.id.img9);
//        img9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this,Berita9.class);
//                startActivity(intent);
//            }
//        });
//
//        img10 = findViewById(R.id.img10);
//        img10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this,Berita10.class);
//                startActivity(intent);
//            }
//        });

        img11 = findViewById(R.id.img11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,Berita11.class);
                startActivity(intent);
            }
        });

//        img12 = findViewById(R.id.img12);
//        img12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FashionActivity.this,Berita12.class);
//                startActivity(intent);
//            }
//        });

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,MainLogin.class);
                startActivity(intent);
            }
        });

        fashion = findViewById(R.id.fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,FashionActivity.class);
                startActivity(intent);
            }
        });

        sport = findViewById(R.id.sport);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this, SportActivity.class);
                startActivity(intent);
            }
        });

        entertainmen = findViewById(R.id.entertainment);
        entertainmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,EntertainmenActivity.class);
                startActivity(intent);
            }
        });

        political = findViewById(R.id.political);
        political.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,PoliticalActivity.class);
                startActivity(intent);
            }
        });

        news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FashionActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }


}