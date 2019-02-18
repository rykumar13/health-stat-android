package com.example.health_stat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class detail_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        PieChart pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        pieChart.setHoleRadius(75f);
        pieChart.setTransparentCircleRadius(20f);

        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400));
        value.add(new PieEntry(600));

        Description desc = new Description();
        desc.setText("test");
        desc.setTextSize(20f);
        PieDataSet pieDataSet = new PieDataSet(value, "test");

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setSliceSpace(5f);
    }
}
