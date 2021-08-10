package main.com.A4;

import main.com.A2.IF.SoundFeature;

public class CatSound implements SoundFeature{
	public String sound(){
		System.out.println("Meow");
		return "Meow";
	}

}
