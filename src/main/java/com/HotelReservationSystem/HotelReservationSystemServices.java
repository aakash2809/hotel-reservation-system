package com.HotelReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystemServices {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	// Add hotel Hotel Name Rate
	public void addHotelNameAndRateForRegularCustomer() {
		Hotel hotel = new Hotel();
		System.out.println("Enter Hotel Name");
		hotel.setHotelName(scanner.next());
		System.out.println("Enter Hotel rate for regular customer");
		hotel.setRateforRegularCustomer(scanner.next());
		hotelList.add(hotel);
		System.out.println("hotel name and rate added ");
	}

}
