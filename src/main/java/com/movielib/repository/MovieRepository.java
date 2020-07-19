package com.movielib.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.movielib.entity.Movie;

@Component
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	List<Movie> findByName(String name);

}