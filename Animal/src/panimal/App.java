package panimal;

import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeaLine sealion = new SeaLine("Tom");
		System.out.println(sealion);
		Dog dog1 = new Dog("Damain");
		System.out.println(dog1);
		Tarzier tarzier1 = new Tarzier("Sen");
		System.out.println(tarzier1);
		Horse horse1 = new Horse("Pengfei");
		System.out.println(horse1);
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog1);
		animals.add(sealion);
		animals.add(horse1);
		animals.add(tarzier1);
		for(Animal item:animals)
		{
           if(item instanceof Domesticated)
           {
        	   System.out.println(((Domesticated) item).work());
           }

           else
           {
        	   System.out.println(item.getName() + " does no useful work");
           }
		}
	}

}
