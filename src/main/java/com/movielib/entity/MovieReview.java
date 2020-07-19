package com.movielib.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="movie")
public class MovieReview {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String movieLeadActor;
	private String movieHouse;

	@OneToMany(targetEntity = Review.class, cascade = CascadeType.ALL)
	@JoinColumn(name="movie_id", referencedColumnName = "id")
	private List<Review> reviews;



}
