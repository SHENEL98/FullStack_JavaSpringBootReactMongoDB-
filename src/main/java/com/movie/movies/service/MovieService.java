package com.movie.movies.service;

import com.movie.movies.modal.Movie;
import com.movie.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
