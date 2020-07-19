package com.movielib.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.movielib.entity.Movie;
import com.movielib.exception.ApiRequestException;
import com.movielib.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/hello")
	public String Hello(String greeting) {
		if (greeting.contains("good")) {
			throw new ApiRequestException(("Oops something went wrong"));
		}
		return "Good morning Updating comments to git 123";
	}

	@PostMapping("/addmovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}

	@PostMapping("/addmovieresponse")
	public ResponseEntity<Object> addResponseMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{movieid}").buildAndExpand(movie.getId())
				.toUri();
		return ResponseEntity.created(path).build();

	}

	@GetMapping("/moviebyname")
	public List<Movie> getMovieByName(@RequestParam String movieName) {

		return movieService.getMovieByName(movieName);
	}

	@GetMapping("/movielist")
	public List<Movie> getMovieList() {
		return movieService.getMovieList();
	}

	@DeleteMapping("/deletemovie")
	public String deleteMovie(@RequestParam Integer movieid) {

		try {
			movieService.deleteMovie(movieid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "Movie Id does not exist";
			// .printStackTrace();
		}

		return "Movie id " + movieid + " deleted";
	}

	@PutMapping("/updatemovie")
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieService.updateMovie(movie);
	}

}
