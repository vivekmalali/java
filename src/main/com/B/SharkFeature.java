package main.com.B;

import main.com.A2.IF.FishFeatures;

public class SharkFeature implements FishFeatures{
	@Override
	public String color() {
		System.out.println("Sharks are large and grey color");
		return "Sharks are large and grey color";
	}

	@Override
	public String behaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
