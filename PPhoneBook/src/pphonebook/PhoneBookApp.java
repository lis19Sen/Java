package pphonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> people = new ArrayList<>();
		File text = new File("Phone.csv");
		String firstName;
		String lastName;
		String room;
		String title;
		String phone;
		
		//File text = new File("H:\\IN610 Java\\PPhoneBook\\src\\Phone.csv");
		//Scanner scan;
		
		try {
			
			Scanner scan = new Scanner(text);
			while(scan.hasNextLine())
		{
			String line = scan.nextLine();
			String[] parts = line.split(",");
			firstName = parts[0];
			lastName = parts[1];
			room = parts[2];
			title = parts[3];
			phone = parts[4];
			people.add(new Person(lastName,firstName,room,title, phone));
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(people);
		for(Person item:people)
		{
			System.out.println(item);
		}
	}

}
