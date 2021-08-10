package main.com.A4;

import main.com.A2.IF.SoundFeature;

public class Parrot {
	private SoundFeature soundFeature;

	public void setSoundFeature(SoundFeature soundFeature) {
		this.soundFeature = soundFeature;
	}

	public String performSound(){
		return soundFeature.sound();
	}
}
