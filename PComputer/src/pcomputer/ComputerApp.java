package pcomputer;

import java.util.ArrayList;

public class ComputerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer computer1 = new Computer("Dell","i9",8,128);
		ArrayList<LapTop> laptops = new ArrayList<>();
		LapTop laptop1 = new LapTop("Mac","i7", 2, 128, 17.3,12);
		LapTop laptop2 = new LapTop("i7", 2, 128, 17.3,12);
		laptops.add(laptop1);
		laptops.add(laptop2);
		for(LapTop item:laptops)
		{
			System.out.println(item.toString());
		}
		System.out.println(computer1);
		int count= 1;
		count = count++;
		System.out.println(count);
		int y=1;int x=2;int w=3;
		y=x+++w;
		System.out.println(Integer.toString(x)+Integer.toString(y)+Integer.toString(w) );
				
		System.out.println();
	}

}
