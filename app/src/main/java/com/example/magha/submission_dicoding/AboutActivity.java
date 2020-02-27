package com.example.magha.submission_dicoding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    ImageView ivAbout;
    TextView tvNama, tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ivAbout = (ImageView) findViewById(R.id.iv_about);
        tvNama = (TextView) findViewById(R.id.tv_name);
        tvEmail = (TextView) findViewById(R.id.tv_email);

        tvNama.setText("Muhammad Aghassi Zulfikar");
        tvEmail.setText("maghassiz@gmail.com");
    }
}