package pnbaplayerstatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Player> players = new ArrayList<>();
		ReadFile.load(players);
        HeightComparator cp = new HeightComparator();
        Collections.sort(players,cp);
		for (Player item:players)
		{
			System.out.println(item.toString1());
		}				
	}

}
