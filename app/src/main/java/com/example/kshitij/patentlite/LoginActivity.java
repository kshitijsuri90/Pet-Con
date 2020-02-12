package com.example.kshitij.patentlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    private int score = 600;
    private int footprint = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button admin = findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirect();
            }
        });
    }

    public void redirect() {
        Intent intent = new Intent(this, NavigationActivity.class);
        intent.putExtra("score",score);
        intent.putExtra("footprint",footprint);
        startActivity(intent);
    }

}
