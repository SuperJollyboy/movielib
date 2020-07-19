package com.movielib.service;

import java.util.List;

import com.movielib.entity.Movie;

public interface MovieService {

	public List<Movie> getMovieList();

	public Movie addMovie(Movie movie);

	public List<Movie> getMovieByName(String moviename);

	public String deleteMovie(Integer movieid);

	public Movie updateMovie(Movie movie);

}
