package com.mms.one.Service;

import com.mms.one.dao.KfcFood;
import com.mms.one.dao.McdFood;
import com.mms.one.dao.RestaurantFood;

public class KfcService implements RestaurantService {
	private RestaurantFood restaurantFood;
	public void menu() {
		System.out.println("inside Kfcservice menu method");
	    /* RestaurantFood food=new KfcFood();
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
