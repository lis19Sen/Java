package robot;

public class RobotApp {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println("Making the robots");
		Robot machine1 = new Robot("r2d2", "solar", 2);
		Robot machine2 = new Robot("c3p0", "solar", 3);
		
		System.out.println(machine1.getName() + " runs on " + machine1.getFuel() + ", and it is " + machine1.getAge() + " years old.");
		System.out.println(machine2.getName() + " runs on " + machine1.getFuel());
	}

}
