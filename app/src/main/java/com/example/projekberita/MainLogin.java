package com.example.projekberita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = (TextView) findViewById(R.id.register_activity);
        button = (Button) findViewById(R.id.login);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLogin.this, RegistActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

   public void openRegisterActivity(){
        Intent intent = new Intent(MainLogin.this, RegistActivity.class);
        startActivity(intent);
    }

    public void openNavbarActivity(){
        Intent intent = new Intent(MainLogin.this, MainActivity.class);
        startActivity(intent);

    }
}