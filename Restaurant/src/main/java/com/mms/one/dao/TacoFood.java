package com.mms.one.dao;

import java.util.List;

public class TacoFood implements RestaurantFood {
	private List<String> foodItemList;
	public void orderFood() {
		System.out.println("inside TacoFood method");
		
		for(String order: foodItemList)
		{
    	System.out.println("The food item is "  + order);
        }
	}
	public List<String> getFoodItemList() {
		return foodItemList;
	}
	public void setFoodItemList(List<String> foodItemList) {
		this.foodItemList = foodItemList;
	}

}
