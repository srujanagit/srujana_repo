package com.mms.one.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class KfcFood implements RestaurantFood {
	//@Value("#{'${food.list.of.items}'.split(',')}")
	private List<String> foodItemList;
	
	public void orderFood() {
		System.out.println("inside KfcFood orderFood method");
		
		for(String order: foodItemList)
		{
    	System.out.println("The food item you can ordered are : "  + order);
        }
	}

	public List<String> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<String> foodItemList) {
		this.foodItemList = foodItemList;
	}

}
