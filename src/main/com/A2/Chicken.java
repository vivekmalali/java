package main.com.A2;
import main.com.A2.IF.*;
public class Chicken extends Bird{

	private Flyable flyable;
	private SoundFeature soundFeature;
	private Swimmer swimmer;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
	public void setSoundFeature(SoundFeature soundFeature) {
		this.soundFeature = soundFeature;
	}
	public void setSwimmer(Swimmer swimmer) {
		this.swimmer = swimmer;
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

}
