package com.example.health_stat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class bar_graph_drawable_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_graph_drawable_test);
        BarChart barChart = findViewById(R.id.barchart);

        List<BarEntry> value = new ArrayList<>();
        value.add(new BarEntry(1, 100 ));
        value.add(new BarEntry(2, 150 ));
        value.add(new BarEntry(3, 200 ));
        value.add(new BarEntry(4, 250));

        BarDataSet barDataSet = new BarDataSet(value, "Test");

        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setBarShadowColor(1);
    }
}
