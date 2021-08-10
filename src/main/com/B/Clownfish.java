package main.com.B;

import main.com.A2.IF.FishFeatures;

public class Clownfish extends Fish{
	
	private FishFeatures fishFeature;

	public void setFishFeature(FishFeatures fishFeature) {
		this.fishFeature = fishFeature;
	}

	@Override
	public String sing() {
		System.out.println("Clownfish don’t sing");
		return "Clownfish don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	@Override
	public String walk() {
		System.out.println("Clownfish don't walk");
		return "Clownfish don't walk";
	}

	public String getFishColor(){
		return fishFeature.color();
	}

	public String getFishFeature(){
		return fishFeature.behaviour();
	}
}
