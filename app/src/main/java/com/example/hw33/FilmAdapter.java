package com.example.hw33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<filmViewHolder>{
    private ArrayList<String> filmList;

    public FilmAdapter(ArrayList<String> filmList) {
        this.filmList = filmList;
    }

    @NonNull
    @Override
    public filmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new filmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film,parent,false));


    }

    @Override
    public void onBindViewHolder(@NonNull filmViewHolder holder, int position) {
        holder.onBind(filmList.get(position));

    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }
}
