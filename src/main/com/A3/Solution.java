package main.com.A3;

import main.com.A2.FlyWithWings;

public class Solution {

	public static void main(String args[]){
		Rooster rooster = new Rooster();
		rooster.setFlyable(new FlyWithWings());
		rooster.performFly();

		rooster.setSoundFeature(new RoosterSound());
		rooster.performSound();

		rooster.walk();

	}
}
