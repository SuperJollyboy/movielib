package com.movielib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movielib.dto.MovieReviewList;
import com.movielib.repository.MovieReviewRepository;

@RestController
public class MoviewReviewController {

	@Autowired
	private MovieReviewRepository moviereviewrepository;

	@PostMapping("/addmoviereview")
	public com.movielib.entity.MovieReview AddMovieReview(@RequestBody MovieReviewList request) {
		return moviereviewrepository.save(request.getMoviereview());
	}

	@GetMapping("/listmoviereviews")
	public List<com.movielib.entity.MovieReview> ReviewList() {
		return moviereviewrepository.findAll();
	}
}
