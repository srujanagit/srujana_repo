package com.mms.one.Service;

import com.mms.one.dao.McdFood;
import com.mms.one.dao.RestaurantFood;

public class McdService implements RestaurantService {
	private RestaurantFood restaurantFood;
	public void menu() {
		System.out.println("inside mcdservice method");
	    /* RestaurantFood food=new McdFood();
	     food.orderFood();*/
		restaurantFood.orderFood();
	}
	public RestaurantFood getRestaurantFood() {
		return restaurantFood;
	}
	public void setRestaurantFood(RestaurantFood restaurantFood) {
		this.restaurantFood = restaurantFood;
	}

}
