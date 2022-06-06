package com.example.expressflixster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMovies;
    ArrayList<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvMovies = findViewById(R.id.rvMovies);

//        movies.add("morbius");
//        movies.add("top gun");
//        movies.add("doctor strange");

//        Api.call(https://themoviesdb.org/now_playing) { result
//                movies.addAll(result)
//        };

        // Create adapter passing in the sample user data
        MovieAdapter adapter = new MovieAdapter(movies);
        // Attach the adapter to the recyclerview to populate items
        rvMovies.setAdapter(adapter);
        // Set layout manager to position the items
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
    }
}