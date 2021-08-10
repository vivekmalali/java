package main.com.A2;

import main.com.A2.IF.*;

public class Duck extends Bird{

	private Flyable flyable;
	private SoundFeature soundFeature;
    private Swimmer swimmer;


	public void setSwimmer(Swimmer swimmer) {
		this.swimmer = swimmer;
	}
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

	public String performSwim(){
		return swimmer.swim();
	}

	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}

}
 