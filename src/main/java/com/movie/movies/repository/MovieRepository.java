package com.movie.movies.repository;

import com.movie.movies.modal.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    List<Movie> findAll();

}
