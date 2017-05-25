package com.mms.one.Restaurant;

import com.mms.one.Service.RestaurantService;

public class Kfc implements Restaurant {
	private RestaurantService restaurantService;
	public void cook() {
		System.out.println("inside kfc cook method");
		restaurantService.menu();

	}
	public RestaurantService getRestaurantService() {
		return restaurantService;
	}
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}

}
