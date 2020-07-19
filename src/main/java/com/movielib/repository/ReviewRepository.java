package com.movielib.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.movielib.entity.Review;

@Component
public interface ReviewRepository extends JpaRepository<Review, Integer> {

 
}