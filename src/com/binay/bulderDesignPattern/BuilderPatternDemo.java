package com.binay.bulderDesignPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder mealBuilder  = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		
		
		Meal nonVegMeal = mealBuilder.prepareNonVegBurger();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItems();

	}

}
