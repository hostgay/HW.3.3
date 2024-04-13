package com.example.hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class filmViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFilmName;
    public filmViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFilmName = itemView.findViewById(R.id.tv_item_film);
    }
    public void onBind(String film){
        tvFilmName.setText(film);
    }
}
