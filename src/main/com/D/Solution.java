package main.com.D;

public class Solution {

	public static void main(String[] args) {

		int flyCount = 0;
		int swimCount = 0;
		int walkCount = 0;
		int singCount = 0;

		Animal[] animals = new Animal[]{
				new Bird(),
				new Fish(),
				new Cat()
                //below all objects can be implemented same way as Bird,Fish & Cat
				//new Duck(),             
				//new Chicken(),
				//new Rooster(),
				//new Parrot(),
				//new Shark(),
				//new Clownfish(),
				//new Dolhpin(),
				//new Frog(),
				//new Dog(),
				//new Butterfly(),
			};

		for(int i = 0 ; i< animals.length; i++){
			if(animals[i].fly()){
				flyCount = flyCount + 1;
			}
			if(animals[i].sing()){
				singCount = singCount + 1;
			}
			if(animals[i].walk()){
				walkCount = walkCount + 1;
			}
			if(animals[i].swim()){
				swimCount = swimCount + 1;
			}
		}
		System.out.println("Fly Animals count:"+flyCount);
		System.out.println("Sing Animals count:"+singCount);
		System.out.println("Walk Animals count:"+walkCount);
		System.out.println("Swim Animals count:"+swimCount);
	}	
}

