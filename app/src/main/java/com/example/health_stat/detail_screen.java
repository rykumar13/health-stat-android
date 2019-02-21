package com.example.health_stat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.view.Window;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class detail_screen extends AppCompatActivity {

    final int[] RAJ_COLORS = {
            Color.rgb(210, 235, 245), Color.rgb(2, 136, 209)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        RecyclerView list = findViewById(R.id.list_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        list.setLayoutManager(linearLayoutManager);

        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400));
        value.add(new PieEntry(600));
        PieDataSet pieDataSet = new PieDataSet(value, "test");
        pieDataSet.setColors(RAJ_COLORS);
        pieDataSet.setSliceSpace(5f);
        PieDataSet[] pieDataSetA = new PieDataSet[]{pieDataSet, pieDataSet, pieDataSet, pieDataSet};
        list.setAdapter(new PieCardAdapter(pieDataSetA));

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(list);

        //Main Pie Chart
//        PieChart pieChart = findViewById(R.id.piechart);
//        pieChart.setUsePercentValues(true);
//
//        pieChart.setHoleRadius(75f);
//        pieChart.setTransparentCircleRadius(20f);
//
//        List<PieEntry> value = new ArrayList<>();
//        value.add(new PieEntry(400));
//        value.add(new PieEntry(600));
//
//        Description desc = new Description();
//        desc.setText("");
//        pieChart.setDescription(desc);
//        pieChart.getLegend().setEnabled(false);
//        PieDataSet pieDataSet = new PieDataSet(value, "test");
//
//
//        PieData pieData = new PieData(pieDataSet);
//        pieChart.setData(pieData);
//
//        final int[] RAJ_COLORS = {
//                Color.rgb(210, 235, 245), Color.rgb(2, 136, 209)
//        };
//        pieDataSet.setColors(RAJ_COLORS);
//        pieDataSet.setSliceSpace(5f);
//        pieChart.animateXY(1000, 1000);


        //Bottom Line Chart
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

        Description desc_lineChart = new Description();
        desc_lineChart.setText("");
        lineChart.setDescription(desc_lineChart);

        XAxis xAxis = lineChart.getXAxis();

        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);

        YAxis yAxisLeft = lineChart.getAxisLeft();
        yAxisLeft.setDrawGridLines(false);
        yAxisLeft.setDrawAxisLine(false);
        yAxisLeft.setAxisMinimum(0);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);

        YAxis yAxisRight = lineChart.getAxisRight();
        yAxisRight.setDrawGridLines(false);
        yAxisRight.setDrawAxisLine(false);
        lineChart.animateXY(1000, 1000);
    }

    public void sendBack(View view) {
        Intent intent = new Intent(this, dashboard_screen.class);
        startActivity(intent);
    }


}
