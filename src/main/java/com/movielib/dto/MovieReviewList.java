package com.movielib.dto;

import com.movielib.entity.Movie;
import com.movielib.entity.MovieReview;
import com.movielib.entity.Review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieReviewList {

	private MovieReview moviereview;
	
}
