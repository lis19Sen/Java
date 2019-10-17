package pfacebook;

import java.util.ArrayList;

import pfacebook.Friend;
import pfacebook.Gender;
import pfacebook.Relationship;

public class FaceBook {

	private ArrayList<Friend> friends;
	private String identifier;
	
	
	public FaceBook(String identifier)
	{
		this.identifier = identifier;
		this.friends = new ArrayList<Friend>();
		 
		
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public int numberOfFriends()
	{
		int numberOfFriends = friends.size();
		return numberOfFriends;
	}
	
	public Boolean addFriend(Friend friend)
	{
		Boolean checkDuplicateFriend = false;
		for(Friend item:friends)
		{
			if(item.isTheSame(friend) == true)
			{
				checkDuplicateFriend = true;
				
			}
			
		}
		
		if(checkDuplicateFriend == false)
		{
			friends.add(friend);
		}
		return checkDuplicateFriend;
	}
	 
	public String showAllData()
	{
		StringBuilder allFriendsData = new StringBuilder();
		for(Friend item:friends)
		{
			allFriendsData.append(item);
			allFriendsData.append(" ");
		}
		return allFriendsData.toString();
	}
	
	public String showLessThan21()
	{
		StringBuilder friendsUnder21 = new StringBuilder();
		for(Friend item:friends)
		{
			if(item.getBirthdate() != null)
			{
				if(item.calcAge() < 21)
				{
					friendsUnder21.append(item);
				}
				
			}
		}
		
		return friendsUnder21.toString();
	}
	
	public Boolean removeFriend(Friend friend)
	{
		Boolean removeStatus = false;
		for(int i= 0; i < friends.size(); i++)
		{
			if(friends.get(i).isTheSame(friend) == true )
			{
				friends.remove(friend);	
				removeStatus = true;
			}
			
		}
		return removeStatus;
	}
	
	public String checkMarriedFriend(Friend friend)
	{
		StringBuffer sb = new StringBuffer();
		//sb.append(friend.getFirstName());
		//sb.append(" ");
		//sb.append(friend.getLastName());
		//for(Friend item:friends)
		//{
			if(friend.getRelationshipStatus() == Relationship.MARRIED)
			{
				sb.append(friend.getFirstName());
				sb.append(" is Married");
			}
		
		    else
		    {
		    	sb.append(friend.getFirstName());
		    	sb.append(" is not Married");
		    }
			//sb.append("\n");
		//}
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
