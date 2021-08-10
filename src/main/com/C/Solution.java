package main.com.C;

public class Solution {

	public static void main(String args[]){

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();

		caterpillar.setFlyable(new FlyWithWings());
		caterpillar.setSoundFeature(new ButterflySound());

		caterpillar.performSound();
		caterpillar.performFly();
	}
}
