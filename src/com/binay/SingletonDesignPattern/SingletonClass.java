package com.binay.SingletonDesignPattern;

public class SingletonClass {
	
	private static SingletonClass singletonClassInstance;
	private SingletonClass(){}
	
	public static SingletonClass getSingletonInstance(){
		if(null == singletonClassInstance){
			synchronized(SingletonClass.class){
				if(null == singletonClassInstance){
					singletonClassInstance = new SingletonClass();
					System.out.println("Creating singleton class");
				}
			}
		}
		return singletonClassInstance;
	}

}
