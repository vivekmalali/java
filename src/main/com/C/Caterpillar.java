package main.com.C;

import main.com.A2.IF.*;

public class Caterpillar extends Animal {

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

	
	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
}
