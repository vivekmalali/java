package main.com.A3;

import main.com.A2.Bird;
import main.com.A2.IF.*;


public class Rooster extends Bird {
	
	private SoundFeature soundFeature;
	private Flyable flyable;

	public void setSoundFeature(SoundFeature soundFeature) {
		this.soundFeature = soundFeature;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}


	public String performSound(){
		return soundFeature.sound();
	}

	public String performFly(){
		return flyable.fly();
	}

}
