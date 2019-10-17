package pfacebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import friend.Friend;
//import friend.Gender;
//import friend.Relationship;

class FaceBookTest {

	@Test
	void testGetIdentifier() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals("Sen's facebook:", sen.getIdentifier());
	    

	}

	@Test
	void testSetIdentifier() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    sen.setIdentifier("Sen's profile");
	    assertEquals("Sen's profile", sen.getIdentifier());
	}

	@Test
	void testNumberOfFriends() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals(3, sen.numberOfFriends());
	}

	@Test
	void testAddFriend() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    Friend friend4 = new Friend("Sen", "Li");
	    sen.addFriend(friend1);
	    assertEquals(true, sen.addFriend(friend4));
	}

	@Test
	void testShowAllData() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals("Sen Li Pengfei Cui, age 29. Mr. Hua Wang, age 33.Email is lis19@student.op.ac.nz. Hometown is Wuhan. He is MARRIED. ", sen.showAllData());
	}

	@Test
	void testShowLessThan21() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 2001, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals("Pengfei Cui, age 18.", sen.showLessThan21());
	}

	@Test
	void testRemoveFriend() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals(true, sen.removeFriend(friend1));
	}

	@Test
	void testCheckMarriedFriend() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    Friend friend4 = new Friend("Jua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.SINGLE);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    sen.addFriend(friend4);
	    assertEquals("Hua is Married", sen.checkMarriedFriend(friend3));
	    assertEquals("Jua is not Married", sen.checkMarriedFriend(friend4));
	}
	
	@Test
	void testRemoveNonFriend() {
		FaceBook sen = new FaceBook("Sen's facebook:");
		Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    Friend friend4 = new Friend("Jua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.SINGLE);
	    sen.addFriend(friend1);
	    sen.addFriend(friend2);
	    sen.addFriend(friend3);
	    assertEquals(true, sen.removeFriend(friend1));
	    assertEquals(false, sen.removeFriend(friend4));
	}

}
