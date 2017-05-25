package com.mms.one.Service;

import com.mms.one.dao.RestaurantFood;

public class TacoService implements RestaurantService {
	private RestaurantFood restaurantFood;
	public void menu() {
		System.out.println("inside tacoservice method");
		restaurantFood.orderFood();
	}
	public RestaurantFood getRestaurantFood() {
		return restaurantFood;
	}
	public void setRestaurantFood(RestaurantFood restaurantFood) {
		this.restaurantFood = restaurantFood;
	}

	}

