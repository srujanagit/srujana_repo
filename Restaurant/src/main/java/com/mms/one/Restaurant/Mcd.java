package com.mms.one.Restaurant;

import com.mms.one.Service.KfcService;
import com.mms.one.Service.McdService;
import com.mms.one.Service.RestaurantService;

public class Mcd implements Restaurant {
	private RestaurantService restaurantService;
	public void cook() {
		System.out.println("inside mcd cook method");
    /* RestaurantService service=new McdService();
     service.order();
		
		RestaurantService service=new KfcService();
	     service.order();*/
		restaurantService.menu();
		
	}
	public RestaurantService getRestaurantService() {
		return restaurantService;
	}
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}

}
