package com.example.magha.submission_dicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTanaman;
    private ArrayList<Tanaman> list = new ArrayList<>();
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTanaman = findViewById(R.id.rv_item);
        rvTanaman.setHasFixedSize(true);

        list.addAll(TanamanData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvTanaman.setLayoutManager(new LinearLayoutManager(this));
        CardViewTanamanAdapter cardViewTanamanAdapter = new CardViewTanamanAdapter(list);
        rvTanaman.setAdapter(cardViewTanamanAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
