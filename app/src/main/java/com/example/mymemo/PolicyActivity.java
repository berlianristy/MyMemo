package com.example.mymemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        ImageButton panah = (ImageButton) findViewById(R.id.imgbtn_panah);

        panah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ipanah = new Intent(PolicyActivity.this, SettingActivity.class);
                startActivity(ipanah);
            }
        });
    }
}
