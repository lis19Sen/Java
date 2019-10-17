package pcdcollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name;
       String line;
       int artistNumber = 0;
      
       ArrayList<Artist> artists = new ArrayList<>();
       File text = new File("data.csv");
	   try {
		Scanner scan = new Scanner(text);
		while(scan.hasNextLine() && artistNumber < 2)
		{
			line = scan.nextLine();
			name = line;
			ArrayList<Song> songs = new ArrayList<>();
			for(int i = 0; i <3; i++)
			{
			    Song temp = new Song(scan.nextLine());
				songs.add(temp);
				Collections.sort(songs);
			}
			Artist tempArtist = new Artist(name, songs);
			artists.add( tempArtist);
			Collections.sort(artists);
			artistNumber++;	
		}
		scan.close();
		CDCollection cdcollection = new CDCollection(artists);
		//for(Artist item:artists)
		//{
		System.out.println(cdcollection.toString());
		//}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}

}
