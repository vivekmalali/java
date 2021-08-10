package main.com.B;

import main.com.A2.IF.FishFeatures;

public class ClownfishFeature implements FishFeatures {
	@Override
	public String color() {
		System.out.println("Clownfish are small and colorful");
		return "Clownfish are small and colorful";
	}

	@Override
	public String behaviour() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}
}
