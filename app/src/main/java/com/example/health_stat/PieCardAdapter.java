package com.example.health_stat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class PieCardAdapter extends RecyclerView.Adapter<PieCardAdapter.CardViewHolder> {


    private PieDataSet[] PieDataSet;

    public PieCardAdapter(PieDataSet[] PieDataSet) {
        this.PieDataSet = PieDataSet;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.detail_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        PieData pieData = new PieData(PieDataSet[position]);
        holder.pieChart.setData(pieData);
        renderPie(holder.pieChart);
    }

    public void renderPie(PieChart pieChart) {
        pieChart.setHoleRadius(75f);
        pieChart.setTransparentCircleRadius(20f);
        Description desc = new Description();
        desc.setText("");
        pieChart.setDescription(desc);
        pieChart.getLegend().setEnabled(false);
        pieChart.animateXY(1000, 1000);
        pieChart.notifyDataSetChanged();
        pieChart.invalidate();
    }

    @Override
    public int getItemCount() {
        return PieDataSet.length;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public PieChart pieChart;

        public CardViewHolder(View itemView) {
            super(itemView);
            pieChart = itemView.findViewById(R.id.piechart_card);
        }


    }
}
