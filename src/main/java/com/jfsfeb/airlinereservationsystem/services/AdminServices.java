package com.jfsfeb.airlinereservationsystem.services;

import java.util.List;

import com.jfsfeb.airlinereservationsystem.dto.FlightDetails;
import com.jfsfeb.airlinereservationsystem.dto.TicketsInfo;
import com.jfsfeb.airlinereservationsystem.dto.UserDetails;

public interface AdminServices {
		
	public boolean addNewAdmin(UserDetails admin);
	
	public boolean addFlights(FlightDetails flights);
	
	public boolean deleteFlights(int id);
	
	public List<FlightDetails> searchFlight(int id);
	
	public List<FlightDetails> viewFlightDetails();
	
	public List<UserDetails> viewAllUserDetails();
	
	public List<TicketsInfo> viewTicketsInfos();
	

}
