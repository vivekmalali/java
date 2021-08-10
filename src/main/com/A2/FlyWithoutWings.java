package main.com.A2;

import main.com.A2.IF.Flyable;

public class FlyWithoutWings implements Flyable{
	public String fly(){
		System.out.println("I am not flying");
		return "I am not flying";
	}
}
