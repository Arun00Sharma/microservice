package com.example.rating.service;

import java.util.List;

import com.example.rating.entities.Rating;

public interface RatingService {

	//create 
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getAllRating();
	
	//get all by userId
	List<Rating> getRatingByUserId(String id);
	
	//get all by hotel id
	 List<Rating> getRatingByHotelId(String hotelId);
	
}

