package com.example.hotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
