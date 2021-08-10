package main.com.A2;

import main.com.A2.IF.SoundFeature;

public class DuckSound implements  SoundFeature{
	public String sound(){
		System.out.println("Quack, quack");
		return "Quack, quack";
	}
}
