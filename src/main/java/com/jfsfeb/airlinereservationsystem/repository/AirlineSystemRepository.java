package com.jfsfeb.airlinereservationsystem.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.jfsfeb.airlinereservationsystem.dto.FlightDetails;
import com.jfsfeb.airlinereservationsystem.dto.TicketsInfo;
import com.jfsfeb.airlinereservationsystem.dto.UserDetails;

public class AirlineSystemRepository {

//	public static final List<AdminDetails> admin = new ArrayList<AdminDetails>();
	public static final List<FlightDetails> flight = new ArrayList<FlightDetails>();
	public static final List<TicketsInfo> tickets = new ArrayList<TicketsInfo>();
	public static final List<UserDetails> user = new ArrayList<UserDetails>();

	public static void addData() {
		
		UserDetails adminBean = new UserDetails();
		adminBean.setUserId(6500);
		adminBean.setName("Madhuri");
		adminBean.setMailId("madhuri@gmail.com");
		adminBean.setPassword("Admin@2345");
		adminBean.setRole("admin");
		user.add(adminBean);
		
		UserDetails userBean1 = new UserDetails();
		userBean1.setUserId(5000);
		userBean1.setName("Usha");
		userBean1.setMailId("usha@gmail.com");
		userBean1.setPassword("Usha&1234");
		userBean1.setPhoneNumber(8231235431l);
		userBean1.setRole("user");
		user.add(userBean1);
		
		UserDetails userBean2 = new UserDetails();
		userBean2.setUserId(5100);
		userBean2.setName("Aruna");
		userBean2.setMailId("aruna@gmail.com");
		userBean2.setPassword("Aruna@1234");
		userBean2.setPhoneNumber(9502314732l);
		userBean2.setRole("user");
		user.add(userBean2);

		FlightDetails flight1 = new FlightDetails();
		flight1.setFlightId(1000);
		flight1.setFlightName("SpiceJet");
		flight1.setArrivalTime(LocalTime.of(2, 30, 00));
		flight1.setArrivalDate(LocalDate.of(2020, 06, 16));
		flight1.setDepartureTime(LocalTime.of(3, 00, 00));
		flight1.setDepartureDate(LocalDate.of(2020, 06 , 18));
		flight1.setSource("Kadapa");
		flight1.setDestination("Hyderabad");
		flight1.setNoOfSeats(300);
		flight1.setPrice(3000.00);
		flight.add(flight1);
		
		FlightDetails flight2 = new FlightDetails();
		flight2.setFlightId(1100);
		flight2.setFlightName("TrueJet");
		flight2.setArrivalTime(LocalTime.of(6, 20, 00));
		flight2.setArrivalDate(LocalDate.of(2020, 07, 11));
		flight2.setDepartureTime(LocalTime.of(6, 30, 00));
		flight2.setDepartureDate(LocalDate.of(2020, 07, 15));
		flight2.setSource("Banglore");
		flight2.setDestination("Chennai");
		flight2.setNoOfSeats(400);
		flight2.setPrice(3500.00);
		flight.add(flight2);
		
		TicketsInfo info = new TicketsInfo();
		info.setTicketId(1000);
		info.setUserDetails(userBean1);
		info.setFlightDetails(flight1);
		info.setNoOfSeatsBooked(1);
		tickets.add(info);
	}

}
