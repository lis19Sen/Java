package gdgfg;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp = "Dunedin* Civic Center";
		System.out.println(temp.substring(8));
		System.out.println(temp.substring(0,8));
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.toString());
		String[] parts = (currentDate.toString()).split("-");
		for(int i = 0; i < parts.length; i ++)
		{
			System.out.println(parts[i]);
		}
		
		Map<String,Integer> vehicles = new TreeMap<String, Integer>();
		
		
	}

}
