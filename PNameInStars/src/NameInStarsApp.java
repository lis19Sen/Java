import javax.swing.JOptionPane;

public class NameInStarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get the users name
        String userName = JOptionPane.showInputDialog("Enter your name");
        //Create a NameInStars object that stores the users name
        NameInStar you = new NameInStar(userName);
        // display the name
        //JOptionPane.showMessageDialog(null,you.surroundNameInStars());

	}

}
