package main.com.D;

public class Cat extends Animal {
	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean sing() {
		return false;
	}
}
