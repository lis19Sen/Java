package friend;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

//import pfacebook.Gender;
//import pfacebook.Relationship;

class FriendTest {

	@Test
	void testGetFirstName() {
	    Friend friend1 = new Friend("Sen", "Li");
	    Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
	    Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
	    assertEquals("Sen", friend1.getFirstName());
	}

	@Test
	void testSetFirstName() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend2.setFirstName("Issacc");
		 assertEquals("Issacc", friend2.getFirstName());
	}

	@Test
	void testGetLastName() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals("Wang", friend3.getLastName());
	}

	@Test
	void testSetLastName() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setLastName("Zhang");
		 assertEquals("Zhang", friend3.getLastName());
	}

	@Test
	void testGetHomeTown() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(null, friend1.getHomeTown());
		 assertEquals(null, friend2.getHomeTown());
		 assertEquals("Wuhan", friend3.getHomeTown());
	}

	@Test
	void testSetHomeTown() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend1.setHomeTown("Tianjin");
		 friend3.setHomeTown("Weifang");
		 assertEquals("Tianjin", friend1.getHomeTown());
		 assertEquals(null, friend2.getHomeTown());
		 assertEquals("Weifang", friend3.getHomeTown());
	}

	@Test
	void testGetEmail() {
		Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(null, friend1.getEmail());
		 assertEquals(null, friend2.getEmail());
		 assertEquals("lis19@student.op.ac.nz", friend3.getEmail());
	}

	@Test
	void testSetEmail() {
		Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend1.setEmail("lis18@student.op.ac.nz");
		 friend3.setEmail("lis17@student.op.ac.nz");
		 assertEquals("lis18@student.op.ac.nz", friend1.getEmail());
		 assertEquals(null, friend2.getEmail());
		 assertEquals("lis17@student.op.ac.nz", friend3.getEmail());
	}

	@Test
	void testGetBirthdate() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(LocalDate.of(1986, 7, 22),friend3.getBirthdate());
		 //System.out.println(friend3.getBirthdate());
		 
	}

	@Test
	void testSetBirthdate() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setBirthdate(LocalDate.of(2005, 4, 22));
		 assertEquals(LocalDate.of(2005, 4, 22),friend3.getBirthdate());
	}

	@Test
	void testGetDateEntered() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(LocalDate.now(), friend1.getDateEntered());
		 assertEquals(LocalDate.now(), friend2.getDateEntered());
		 assertEquals(LocalDate.now(), friend3.getDateEntered());
	}

	@Test
	void testSetDateEntered() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend1.setDateEntered(LocalDate.of(2018, 5, 12));
		 assertEquals(LocalDate.of(2018, 5, 12), friend1.getDateEntered());
	}

	@Test
	void testGetGender() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(null, friend1.getGender());
		 assertEquals(null, friend2.getGender());
		 assertEquals(Gender.MALE, friend3.getGender());
	}

	@Test
	void testSetGender() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setGender(Gender.FEMALE);
		 assertEquals(null, friend1.getGender());
		 assertEquals(null, friend2.getGender());
		 assertEquals(Gender.FEMALE, friend3.getGender());
	}

	@Test
	void testGetRelationshipStatus() {
		Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(null, friend1.getRelationshipStatus());
		 assertEquals(null, friend2.getRelationshipStatus());
		 assertEquals(Relationship.MARRIED, friend3.getRelationshipStatus());
	}

	@Test
	void testSetRelationshipStatus() {
		Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setRelationshipStatus(Relationship.DIVORCED);
		 assertEquals(null, friend1.getRelationshipStatus());
		 assertEquals(null, friend2.getRelationshipStatus());
		 assertEquals(Relationship.DIVORCED, friend3.getRelationshipStatus());
	}

	@Test
	void testCalcAge() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 //friend3.setBirthdate(LocalDate.of(1986, 8, 15));
		 assertEquals(33, friend3.calcAge());
	}
	@Test
	void testCalcAge1() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setBirthdate(LocalDate.of(1986, 8, 15));
		 assertEquals(33, friend3.calcAge());
	}
	@Test
	void testCalcAge2() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setBirthdate(LocalDate.of(1986, 8, 13));
		 assertEquals(33, friend3.calcAge()); 		 
	}
	
	@Test
	void testCalcAge3() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setBirthdate(LocalDate.of(1986, 9, 13));
		 assertEquals(32, friend3.calcAge()); 		 
	}
	
	@Test
	void testCalcAge4() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 friend3.setBirthdate(LocalDate.of(1986, 8, 18));
		 assertEquals(32, friend3.calcAge()); 		 
	}

	@Test
	void testIsTheSame() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend4 = new Friend("Ran", "Liu");
		 Friend friend5 = new Friend("Sen", "Liu");
		 Friend friend6 = new Friend("Ran", "Li");		 
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);
		 assertEquals(true, friend1.isTheSame(friend1));
		 assertEquals(false, friend1.isTheSame(friend4));
		 assertEquals(false, friend1.isTheSame(friend5));
		 assertEquals(false, friend1.isTheSame(friend6));
	}
	

	@Test
	void testToString() {
		 Friend friend1 = new Friend("Sen", "Li");
		 Friend friend2 = new Friend("Pengfei", "Cui", 1990, 5, 12);
		 Friend friend3 = new Friend("Hua", "Wang", 1986, 7, 22, Gender.MALE, "Wuhan", "lis19@student.op.ac.nz", Relationship.MARRIED);	
	     assertEquals("Sen Li", friend1.toString());
	     assertEquals("Pengfei Cui, age 29.", friend2.toString());
	     assertEquals("Mr. Hua Wang, age 33.Email is lis19@student.op.ac.nz. Hometown is Wuhan. He is MARRIED.", friend3.toString());
	     friend3.setGender(Gender.FEMALE);
	     assertEquals("Ms. Hua Wang, age 33.Email is lis19@student.op.ac.nz. Hometown is Wuhan. He is MARRIED.", friend3.toString());
	     
	}

}
