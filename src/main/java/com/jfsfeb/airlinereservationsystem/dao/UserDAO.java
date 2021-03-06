package com.jfsfeb.airlinereservationsystem.dao;

import java.util.List;

import com.jfsfeb.airlinereservationsystem.dto.FlightDetails;
import com.jfsfeb.airlinereservationsystem.dto.TicketsInfo;
import com.jfsfeb.airlinereservationsystem.dto.UserDetails;

public interface UserDAO {
	
	public boolean userRegistration(UserDetails user);
	
	public UserDetails userLogin(String emailId,String password);
	
	public List<FlightDetails> getFlightDetails();
	
	public List<FlightDetails> searchFlightByName(String name);
	
	public List<FlightDetails> searchFlightBySourceAndDestination(String source, String destination);
	
	public TicketsInfo bookFligthTicket(int bookingId, UserDetails userInfo, FlightDetails flightInfo, int seats);
	
	public boolean cancelFlightTicket(int bookingId);
	
	public List<TicketsInfo> getTicketDetails(int userId);

}
