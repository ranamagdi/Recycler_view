package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Movie_List_Adapter extends RecyclerView.Adapter<Movie_List_ViewHolder> {
    private List<MovieModel>movieModels;
    public Movie_List_Adapter(List<MovieModel>movieModels){
        this.movieModels=movieModels;
    }
    @NonNull
    @Override
    public Movie_List_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from((parent.getContext())).inflate(R.layout.movie_list_item,parent,false);
        return new Movie_List_ViewHolder(itemview) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Movie_List_ViewHolder holder, int position) {
        MovieModel CurrentMovieModel=movieModels.get(position);
        holder.population(CurrentMovieModel);

    }

    @Override
    public int getItemCount() {
        return movieModels.size();
    }
}
