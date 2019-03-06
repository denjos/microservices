package pe.com.denjos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import pe.com.denjos.Bean.Hotel;
import pe.com.denjos.Client.HotelClient;

@RestController
@RequestMapping("/reservations")
public class HotelController {

	@Autowired
	HotelClient hotelClient;

//	List<String> getReservationNamesFallback()
//	{
//		return new ArrayList<>();
//	}
//	
//	
//	@HystrixCommand(fallbackMethod="getReservationNamesFallback")
	@GetMapping(value="/hotels")
	List<String> getHotels()
	{
		return hotelClient.getReservations().stream().map(Hotel::getName).collect(Collectors.toList());
	}
}
