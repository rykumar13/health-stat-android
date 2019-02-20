package com.example.health_stat;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class bar_graph_drawable_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout2);
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

        LineChart lineChart = findViewById(R.id.linechart);

        List<Entry> l_data = new ArrayList<>();
        l_data.add(new Entry(1, 45));
        l_data.add(new Entry(2, 65));
        l_data.add(new Entry(3, 50));
        l_data.add(new Entry(4, 70));
        l_data.add(new Entry(5, 90));
        l_data.add(new Entry(6, 80));
        l_data.add(new Entry(7, 80));

        LineDataSet lineDataSet = new LineDataSet(l_data, "test");
        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawValues(false);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.fade_linechart_background);
        lineDataSet.setFillDrawable(drawable);

        lineChart.getXAxis().setDrawGridLines(false);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawLabels(false);

        lineChart.getLegend().setEnabled(false);
        lineChart.setDrawBorders(false);

        Description desc = new Description();
        desc.setText("");
        lineChart.setDescription(desc);

        XAxis xAxis = lineChart.getXAxis();

        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);

        YAxis yAxisLeft = lineChart.getAxisLeft();
        yAxisLeft.setDrawGridLines(false);
        yAxisLeft.setDrawAxisLine(false);

        YAxis yAxisRight = lineChart.getAxisRight();
        yAxisRight.setDrawGridLines(false);
        yAxisRight.setDrawAxisLine(false);


    }
}
