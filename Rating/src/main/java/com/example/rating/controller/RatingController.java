package com.example.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.entities.Rating;
import com.example.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
   @Autowired
	private final RatingService ratingService;
   
 public RatingController(RatingService ratingService) {
	 this.ratingService=ratingService;
 }
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		Rating rate=ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rate);
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingService.getAllRating());
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
	
	
}
