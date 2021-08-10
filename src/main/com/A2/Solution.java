package main.com.A2;

public class Solution {
	
	public static void main(String args[]){
		//Duck
		Duck duck = new Duck();
		duck.setFlyable(new FlyWithWings());
		duck.performFly();

		duck.setSoundFeature(new DuckSound());
		duck.performSound();

		duck.setSwimmer(new DuckSwim());
		duck.performSwim();
		duck.walk();

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyable(new FlyWithoutWings());
		chicken.performFly();

		chicken.setSoundFeature(new ChickenSound());
		chicken.performSound();

		chicken.setSwimmer(new ChickenSwim());
		chicken.performSwim();
		chicken.walk();

	}

}
