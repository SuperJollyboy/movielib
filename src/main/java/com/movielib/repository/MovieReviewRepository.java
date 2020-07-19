package com.movielib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.movielib.entity.MovieReview;

@Component
public interface MovieReviewRepository extends JpaRepository<MovieReview, Integer> {

	  
}