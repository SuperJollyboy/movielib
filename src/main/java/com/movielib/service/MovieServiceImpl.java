package com.movielib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movielib.entity.Movie;
import com.movielib.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getMovieList() {
		List<Movie> movieList = movieRepository.findAll();
		return movieList;
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getMovieByName(String moviename) {
		List<Movie> movieList = movieRepository.findByName(moviename);
		return movieList;

	}

	@Override
	public String deleteMovie(Integer movieid) {
		movieRepository.deleteById(movieid);
		return "movie deleted";
	}

	@Override
	public Movie updateMovie(Movie movie) {
		Movie existingMovie = movieRepository.findById(movie.getId()).orElse(null);
		existingMovie.setName(movie.getName());
		existingMovie.setMovieHouse(movie.getMovieHouse());
		existingMovie.setMovieLeadActor(movie.getMovieLeadActor());
		return movieRepository.save(existingMovie);
	}

}
