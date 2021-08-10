package main.com.A3;

import main.com.A2.IF.SoundFeature;

public class RoosterSound implements SoundFeature{
	public String sound(){
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}
}
