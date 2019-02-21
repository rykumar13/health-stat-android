package com.example.health_stat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView list = findViewById(R.id.list_item);
        list.animate();
        list.setLayoutManager((new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)));

        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400));
        value.add(new PieEntry(600));
        PieDataSet pieDataSet = new PieDataSet(value, "test");
        PieDataSet[] pieDataSetA = new PieDataSet[]{pieDataSet, pieDataSet, pieDataSet, pieDataSet};
        list.setAdapter(new PieCardAdapter(pieDataSetA));

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(list);
    }

}
