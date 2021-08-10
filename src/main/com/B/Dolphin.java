package main.com.B;

import main.com.A2.IF.Swimmer;

public class Dolphin implements Swimmer{

	@Override
	public String swim() {
		System.out.println("Dolphins are good swimmers");
		return "Dolphins are good swimmers";
	}
}
