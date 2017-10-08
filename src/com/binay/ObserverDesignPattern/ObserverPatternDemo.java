package com.binay.ObserverDesignPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new HexaObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("First state change is 15");
		subject.setState(15);
		
		System.out.println("First state change is 15");
		subject.setState(20);

	}

}
