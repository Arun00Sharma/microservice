package com.example.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rating.entities.Rating;
import com.example.rating.repository.RatingRepository;
@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating create(Rating rating) {
	
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {

		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String id) {
		
		return ratingRepository.findByUserId(id);
	}
	

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
	
		return ratingRepository.findByHotelId(hotelId);
	}

	
}
