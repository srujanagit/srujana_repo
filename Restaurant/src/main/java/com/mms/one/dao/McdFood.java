package com.mms.one.dao;

import java.util.Map;
import java.util.Map.Entry;

public class McdFood implements RestaurantFood {
	private Map<String,String> foodItems;

	public void orderFood() {
		System.out.println("inside mcdFood method");
		
		for ( Entry<String, String> order : foodItems.entrySet())
		{
			System.out.println("food items " + order);
		}
		
	}
	public Map<String, String> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(Map<String, String> foodItems) {
		this.foodItems = foodItems;
	}

}
