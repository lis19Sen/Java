package friend;

import java.util.Arrays;

//import pfacebook.Gender;
//import pfacebook.Relationship;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Jayden", "Wang", 1986, 7, 22, Gender.FEMALE, "Dunedin", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    Friend friend4 = new Friend("Jinrui", "Liu");
	    Friend friend5 = new Friend("Bing", "Cui", 1997, 4, 12);
	    Friend friend6 = new Friend("Hua", "Cui", 1950, 9, 18, Gender.MALE, "Wuhan", "lis20@student.op.ac.nz", Relationship.SINGLE);
	    
	    Friend[] friends = { friend1,friend2,friend3,friend4,friend5,friend6};
	   // ArrayAndListUtilities.bubbleSort1(friends);
	    
	    //genderCompare gc = new genderCompare();
	    Arrays.sort(friends);
	    for(Friend item:friends)
	    {
	    	System.out.println(item);
	    }
	    //System.out.println("Li".compareTo("Cui"));
	}

}
