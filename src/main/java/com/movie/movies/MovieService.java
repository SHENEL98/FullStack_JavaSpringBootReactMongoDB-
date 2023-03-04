package com.movie.movies;

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
        List<Movie> movieList = movieRepository.findAll();
        return null;
    }
}
