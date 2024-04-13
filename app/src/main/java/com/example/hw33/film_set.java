package com.example.hw33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class film_set extends Fragment {
    private RecyclerView rvFilms;
    private ArrayList<String> filmList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_film_set, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFilms = requireActivity().findViewById(R.id.rv_films);
        loadData();
        FilmAdapter filmAdapter = new FilmAdapter(filmList);
        rvFilms.setAdapter(filmAdapter);
    }

    private void loadData(){
        filmList.add("Интерстеллар");
        filmList.add("Панда");
        filmList.add("Шрек");
        filmList.add("Джентельмены");
        filmList.add("Драйв");
        filmList.add("Барби");
        filmList.add("Оппенгеймер");
    }
}