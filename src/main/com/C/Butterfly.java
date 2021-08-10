package main.com.C;

import main.com.A2.IF.Flyable;
import main.com.A2.IF.SoundFeature;

public class Butterfly extends Animal {
	private Flyable flyable;
	private SoundFeature soundFeature;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void setSoundFeature(SoundFeature soundFeature) {
		this.soundFeature = soundFeature;
	}

	public String performSound(){
		return soundFeature.sound();
	}
	public String performFly(){
		return flyable.fly();
	}
	
}


