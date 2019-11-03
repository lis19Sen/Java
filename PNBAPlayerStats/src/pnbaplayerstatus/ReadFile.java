package pnbaplayerstatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFile {

	public static void load(ArrayList<Player> players) {
	String temp;
	File text = new File("data2.csv");
	String firstName;
	String lastName;
	String height;
	String weight;
	String pts; 
	String reb;
	String ast;
    try {
          Scanner scan = new Scanner(text);
	      while(scan.hasNextLine())
	      {
		   String line = scan.nextLine();
		   String[] parts = line.split(",");
		   String[] nameParts = parts[1].split(" ");
		   firstName = nameParts[0];
		   lastName = nameParts[1];
		   height = parts[4];
		   weight = parts[5];
		   pts = parts[12];
		   reb = parts[13];
		   ast = parts[14];
		   players.add(new Player(firstName, lastName,Double.parseDouble(height),Double.parseDouble(weight),
				Double.parseDouble(pts),Double.parseDouble(reb),Double.parseDouble(ast)));
          }
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
    HeightComparator cp = new HeightComparator();
    Collections.sort(players,cp);
	/*for (Player item:players)
	{
		System.out.println(item.toString1());
	}*/ 
 }
}
