package myfirst;

import java.util.Random;

public class MyFristApp {
 
	private static int number;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      System.out.println("my first line");
      System.out.println(Math.PI);
      
      Random generator = new Random();
      int dice = (generator.nextInt(6) + 1);
      System.out.println(dice);
      // System.out.println(generator.nextInt(6));
      System.out.println("Number is a static class variable");
      number = 5;
	}

}
