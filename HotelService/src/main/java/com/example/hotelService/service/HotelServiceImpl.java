package com.example.hotelService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelService.entities.Hotel;
import com.example.hotelService.exception.ResourceNotFoundException;
import com.example.hotelService.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String id = UUID.randomUUID().toString();
		hotel.setId(id);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getByID(String id) {
		
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found!!"));
	}

}
