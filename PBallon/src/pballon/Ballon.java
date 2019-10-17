package pballon;

import java.util.Random;

public class Ballon {

	private int colour;
	
	public Ballon()
	{
		Random rand = new Random();
		this.colour = rand.nextInt(10) + 1; 
	}
	
	public String writeColour()
	{
		String ballonColour;
		switch(colour)
		{
		case 1:
			ballonColour = "red";
			break;
	        case 2:
				ballonColour = "green";
				break;
			case 3:
				ballonColour = "yellow";
				break;
			case 4:
				ballonColour = "black";
				break;
			case 5:
				ballonColour = "pink";
				break;
			case 6:
				ballonColour = "purple";
				break;
			case 7:
				ballonColour = "gray";
				break;
			case 8:
				ballonColour = "blue";
				break;
			case 9:
				ballonColour = "orange";
				break;
			case 10:
				ballonColour = "darkred";
				break;
				default:
					ballonColour = "no clolour";
		}
		return ballonColour;
	}
}
