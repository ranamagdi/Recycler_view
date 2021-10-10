package com.example.recyclerview;

import android.content.Intent;
import android.graphics.Movie;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class Movie_List_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final TextView Name;






    public Movie_List_ViewHolder(@NonNull View itemView) {
        super(itemView);
        Name = itemView.findViewById(R.id.movie_name);

        itemView.setOnClickListener(this);
    }

    public void population(MovieModel movie) {
        Name.setText(movie.getName());







    }

    @Override
    public void onClick(View view) {
        if (view.getId() == itemView.getId()) {

            Intent intent = new Intent(itemView.getContext(), details_activity.class);
            intent.putExtra("Details", "Movie" + Name.getText());

            itemView.getContext().startActivity(intent);


        }
    }

}