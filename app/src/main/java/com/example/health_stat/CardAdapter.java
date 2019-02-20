package com.example.health_stat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView txt_view;
        public CardViewHolder(View itemView) {
            super(itemView);
            txt_view = (TextView) itemView.findViewById(R.id.txtTag);
        }


    }
}
