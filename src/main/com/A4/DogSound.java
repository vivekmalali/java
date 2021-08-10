package main.com.A4;

import main.com.A2.IF.SoundFeature;

public class DogSound implements SoundFeature{

	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}
}
