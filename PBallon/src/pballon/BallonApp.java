package pballon;

import java.util.ArrayList;

public class BallonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ballon> ballons = new ArrayList<>();
		Ballon ballon1 = new Ballon();
		Ballon ballon2 = new Ballon();
		Ballon ballon3 = new Ballon();
		/*for(int i = 4; i < 11; i++)
		{
			Ballon ballon[i] = new Ballon();
		}*/
			
		System.out.println(ballon1.writeColour());
		System.out.println(ballon2.writeColour());
		System.out.println(ballon3.writeColour());
		ballons.add(ballon1);
		ballons.add(ballon2);
		ballons.add(ballon3);
		for(Ballon item:ballons)
		{
			System.out.print(item.writeColour() + " ");
		}
		System.out.println(ballons.get(0));System.out.print("rtyrtyrt");
	}

}
