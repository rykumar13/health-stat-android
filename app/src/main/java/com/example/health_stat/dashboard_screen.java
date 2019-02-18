package com.example.health_stat;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class dashboard_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);
        renderWaterChart();
        renderCaloriesChart();
        renderCardioChart();
        renderSleepChart();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, detail_screen.class);
        startActivity(intent);
    }

    public void renderWaterChart() {
        PieChart pieChart = findViewById(R.id.piechart_water);
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

    public void renderCaloriesChart() {
        PieChart pieChart = findViewById(R.id.piechart_calories);
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

    public void renderSleepChart() {
        PieChart pieChart = findViewById(R.id.piechart_sleep);
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

    public void renderCardioChart() {
        PieChart pieChart = findViewById(R.id.piechart_cardio);
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
