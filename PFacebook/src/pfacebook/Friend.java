package pfacebook;

import java.time.LocalDate;

public class Friend {

	private String firstName, lastName, homeTown, email;
	
	private LocalDate birthDate, dateEntered;
	private Gender gender;
	private Relationship relationshipStatus;
	
	public Friend(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateEntered = LocalDate.now();
	}
	


	public Friend(String firstName, String lastName, int year, int month, int day)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		birthDate = LocalDate.of(year, month, day);
		this.dateEntered = LocalDate.now();
		
	}
	
	public Friend(String firstName, String lastName, int year, int month, int day, Gender gender, String homeTown, String email, Relationship relationshipstatus)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = LocalDate.of(year, month, day);
		this.gender = gender;
		this.relationshipStatus = relationshipstatus;
		this.email = email;
		this.homeTown = homeTown;
		this.dateEntered = LocalDate.now();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthdate() {
		
		return birthDate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthDate = birthdate;
	}

	public LocalDate getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(LocalDate dateEntered) {
		this.dateEntered = dateEntered;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Relationship getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(Relationship relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	
	public int calcAge()
	{
		int age= 0;
		if(dateEntered.getMonthValue() > birthDate.getMonthValue())
		{
		  age = dateEntered.getYear() - birthDate.getYear();
		}
		else if(dateEntered.getMonthValue() == birthDate.getMonthValue())
		{
			if(dateEntered.getDayOfMonth() < birthDate.getDayOfMonth())
			{
				age = dateEntered.getYear() - birthDate.getYear() - 1;
			}
			else
			{
				age = dateEntered.getYear() - birthDate.getYear();
			}
		}
		else
		{
			age = dateEntered.getYear() - birthDate.getYear()-1 ;
		}
		return age;
	}
	
	public boolean isTheSame(Friend yFriend)
	{
		boolean check;
		if(this.firstName.contentEquals(yFriend.firstName) && this.lastName.contentEquals(yFriend.lastName))
		{
			check = true;
		}
		else
		{
			check = false;
		}
		return check;		
	}
	
	public String toString()
	{
		//String myFriendDetail;
		StringBuilder sb = new StringBuilder();
		sb.append(firstName + " " + lastName);
		if(birthDate != null)
		{
			sb.append( ", age " + calcAge() + ".");
		}
		
		if(gender != null)
		{
			if(gender == gender.MALE)
			{
				sb.insert(0, "Mr. ");
			}
			else
			{
				sb.insert(0, "Ms. ");
			}
		}
		
		if(email != null)
		{
			sb.append("Email is " + email);
		}
		
		if(homeTown != null )
		{
			sb.append(". Hometown is " + homeTown);
		}
		
		if(relationshipStatus != null)
		{
			sb.append(". He is " + relationshipStatus + ".");
		}
		return sb.toString();
	}
	
	
}
