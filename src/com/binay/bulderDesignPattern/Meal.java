package com.binay.bulderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> myItems = new ArrayList<Item>();
	
	public void addItem(Item item){
		myItems.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		for(Item item :myItems){
			cost +=item.price();
		}
		
		return cost;
	}
	
	public void showItems(){
		for(Item item : myItems){
			System.out.println("Item :"+ item.name());
			System.out.println("Packing :"+ item.packing().pack());
			System.out.println("Price :"+ item.price());
			
		}
	}
}
