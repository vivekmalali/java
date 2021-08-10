package main.com.B;

import main.com.A2.IF.Swimmer;

public class Solution {

	public static void main(String[] args) {

		Fish fish = new Shark();
		fish.sing();
		fish.swim();
		fish.walk();

		Shark s = new Shark();
		s.setFishFeature(new SharkFeature());
		s.getFishFeature();
		s.getFishColor();
		Fish clownfish = new Clownfish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();

		Clownfish c = new Clownfish();
		c.setFishFeature(new ClownfishFeature());
		c.getFishFeature();
		c.getFishColor();

		Swimmer d = new Dolphin();
		d.swim();
	}
}
