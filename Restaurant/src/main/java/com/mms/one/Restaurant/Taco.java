package com.mms.one.Restaurant;

import com.mms.one.Service.RestaurantService;

public class Taco implements Restaurant {
	private RestaurantService restaurantService;
	public void cook() {
		System.out.println("inside taco cook method");
		restaurantService.menu();
		
	}
	public RestaurantService getRestaurantService() {
		return restaurantService;
	}
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
}
