package com.movie.movies.service;

import com.movie.movies.model.Movie;
import com.movie.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return  movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId){
        return  movieRepository.findMovieByImdbId(imdbId);
    }
}
