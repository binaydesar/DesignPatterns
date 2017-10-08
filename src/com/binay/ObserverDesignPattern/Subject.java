package com.binay.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	public List<Observer> observerList = new ArrayList<Observer>();
	public int state;
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach (Observer observer){
		observerList.add(observer);
	}
	
	public void notifyAllObservers(){
		for(Observer observer : observerList){
			observer.update();
		}
	}
}
