package com.example.mymemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //Inisial tombol
       ImageButton about = (ImageButton) findViewById(R.id.imgbtn_About);
       ImageButton policy = (ImageButton) findViewById(R.id.imgbtn_Policy);
       ImageButton faq = (ImageButton) findViewById(R.id.imgbtn_FAQ);

       about.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent iAbout = new Intent(SettingActivity.this, AboutMymemoActivity.class);
               startActivity(iAbout);
           }
       });

        policy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent iPolicy = new Intent(SettingActivity.this, PolicyActivity.class);
               startActivity(iPolicy);
           }
       });
        faq.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent iFaq = new Intent(SettingActivity.this, FaqActivity.class);
               startActivity(iFaq);
           }
       });
    }

}