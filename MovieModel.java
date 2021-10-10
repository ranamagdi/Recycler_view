package com.example.recyclerview;

public class MovieModel {
    private final String Name;
    private final String Details;


    public MovieModel(String name, String details) {
        Name = name;
        Details = details;
    }

    public String getName() {
        return Name;
    }
   public String getDetails(){return Details;}


}
