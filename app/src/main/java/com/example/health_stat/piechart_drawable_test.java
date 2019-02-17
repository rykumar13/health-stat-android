package com.example.health_stat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class piechart_drawable_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piechart_drawable_test);
        PieChart pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        pieChart.setHoleRadius(70f);
        pieChart.setTransparentCircleRadius(40f);

        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400, "Achieved"));
        value.add(new PieEntry(600, "Remaining"));

        PieDataSet pieDataSet = new PieDataSet(value, "Water");

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
    }
}
