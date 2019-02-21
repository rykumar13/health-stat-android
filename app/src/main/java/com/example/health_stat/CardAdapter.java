package com.example.health_stat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {


    private String[] text;

    public CardAdapter(String[] text) {
        this.text = text;
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
        holder.txt_view.setText(text[position]);
        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(400));
        value.add(new PieEntry(600));
        PieDataSet pieDataSet = new PieDataSet(value, "test");
        PieData pieData = new PieData(pieDataSet);
        holder.pieChart.setData(pieData);
    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView txt_view;
        public PieChart pieChart;

        public CardViewHolder(View itemView) {
            super(itemView);
            pieChart = itemView.findViewById(R.id.piechart_card);
            txt_view = itemView.findViewById(R.id.txtTag);
        }


    }
}
