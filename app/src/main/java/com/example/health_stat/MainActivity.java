package com.example.health_stat;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView list = (RecyclerView) findViewById(R.id.list_item);
        list.setLayoutManager((new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)));
        //renderPie();
        list.setAdapter(new CardAdapter(new String[] {"Aaaaaaaaa", "Bssssssssss", "Cssssssssssss", "Dddddddddddd"}));
    }

    public void renderPie() {
        PieChart pieChart = findViewById(R.id.piechart_card);
        pieChart.setUsePercentValues(true);

        pieChart.setHoleRadius(75f);
        pieChart.setTransparentCircleRadius(20f);

        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400));
        value.add(new PieEntry(600));

        Description desc = new Description();
        desc.setText("");
        pieChart.setDescription(desc);
        pieChart.getLegend().setEnabled(false);
        PieDataSet pieDataSet = new PieDataSet(value, "test");


        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);

        final int[] RAJ_COLORS = {
                Color.rgb(210, 235, 245), Color.rgb(2, 136, 209)
        };
        pieDataSet.setColors(RAJ_COLORS);
        pieDataSet.setSliceSpace(5f);
        pieChart.animateXY(1000, 1000);
    }
}
