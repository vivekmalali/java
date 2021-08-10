package main.com.B;

import main.com.A2.IF.FishFeatures;

public class Shark extends Fish{
	private FishFeatures fishFeature;

	public void setFishFeature(FishFeatures fishFeature) {
		this.fishFeature = fishFeature;
	}

	@Override
	public String sing() {
		System.out.println("Sharks don’t sing");
		return "Sharks don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}

	@Override
	public String walk() {
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}

	public String getFishColor(){
		return fishFeature.color();
	}

	public String getFishFeature(){
		return fishFeature.behaviour();
	}

}
