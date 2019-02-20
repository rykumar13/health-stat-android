package com.example.health_stat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView list = (RecyclerView) findViewById(R.id.list_item);
        list.setLayoutManager((new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)));
        list.setAdapter(new CardAdapter(new String[] {"Aaaaaaaaa", "Bssssssssss", "Cssssssssssss", "Dddddddddddd"}));
    }
}
