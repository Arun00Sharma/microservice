package com.example.hotelService.service;

import java.util.List;

import com.example.hotelService.entities.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel getByID(String id);
}

