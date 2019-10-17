package friend;

import java.util.ArrayList;
import java.util.Collections;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> friends = new ArrayList<>();
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Jayden", "Wang", 1986, 7, 22, Gender.FEMALE, "Dunedin", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    Friend friend4 = new Friend("Jinrui", "Liu");
	    Friend friend5 = new Friend("Bing", "Cui", 1997, 4, 12);
	    Friend friend6 = new Friend("Hua", "Cui", 1950, 9, 18, Gender.MALE, "Wuhan", "lis20@student.op.ac.nz", Relationship.SINGLE);
	    friends.add(friend1);
	    friends.add(friend2);
	    friends.add(friend3);
	    friends.add(friend4);
	    friends.add(friend5);
	    friends.add(friend6);
		genderCompare gc = new genderCompare();
		Collections.sort(friends, gc);
		for(Friend item:friends)
		{
			System.out.println(item);
		}
		AgeCompare ac = new AgeCompare();
		Collections.sort(friends, ac);
		for(Friend item:friends)
		{
			System.out.println(item);
		}
	}

}
