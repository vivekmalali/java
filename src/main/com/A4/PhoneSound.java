package main.com.A4;

import main.com.A2.IF.SoundFeature;

public class PhoneSound implements SoundFeature{
	public String sound(){
		System.out.println("Tring tring");
		return "Tring tring";
	}
}
