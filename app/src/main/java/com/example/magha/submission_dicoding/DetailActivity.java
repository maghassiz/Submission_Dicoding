package com.example.magha.submission_dicoding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private String KEY_NAME = "nama";
    private String KEY_DETAIL = "detail";
    private String KEY_GAMBAR ="gambar";
    private int gambar;
    private String nama;
    private String detail;
    TextView tvName,tvDetail;
    ImageView ivDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = (TextView) findViewById(R.id.tv_item_name);
        tvDetail = (TextView) findViewById(R.id.tv_item_detail);
        ivDetail = (ImageView) findViewById(R.id.iv_detail);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        detail = extras.getString(KEY_DETAIL);
        gambar = extras.getInt(KEY_GAMBAR);
        tvName.setText(nama);
        tvDetail.setText(detail);
        ivDetail.setImageResource(gambar);
    }
}
