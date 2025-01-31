package com.example.hotelService.controller;

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

import com.example.hotelService.entities.Hotel;
import com.example.hotelService.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		 Hotel hotel2 = hotelService.create(hotel);
		 return ResponseEntity.status(HttpStatus.CREATED).body(hotel2);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("id") String id) {
	Hotel hotel=hotelService.getByID(id);	
	return ResponseEntity.ok(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> AllHotel=hotelService.getAll();
		return ResponseEntity.ok(AllHotel);
	}
}
