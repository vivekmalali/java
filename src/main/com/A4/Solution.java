package main.com.A4;

import main.com.A2.DuckSound;
import main.com.A3.RoosterSound;

public class Solution {
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.setSoundFeature(new DogSound());
		parrot.performSound();
		parrot.setSoundFeature(new DuckSound());
		parrot.performSound();
		parrot.setSoundFeature(new CatSound());
		parrot.performSound();
		parrot.setSoundFeature(new RoosterSound());
		parrot.performSound();
		parrot.setSoundFeature(new PhoneSound());
		parrot.performSound();
	}

}
