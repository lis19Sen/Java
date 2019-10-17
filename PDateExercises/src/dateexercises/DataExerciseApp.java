package dateexercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class DataExerciseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(currentDate);  //2019-08-12
		System.out.println(currentDate.getYear()); //2019
		System.out.println(currentDate.getMonth()); //AUGUST
		System.out.println(currentDate.getYear());  //2019
		System.out.println(currentDate.getDayOfWeek());  //MONDAY
		System.out.println(currentDate.getDayOfYear());  //224
		System.out.println(currentDate.getDayOfMonth()); //12
		System.out.println(currentDate.lengthOfMonth()); //31
		System.out.println(currentDate.lengthOfYear());  //365
		System.out.println(currentDate.atStartOfDay());  //2019-08-12T00:00
		System.out.println(currentTime);  //14:13:19.589993400
		System.out.println(currentTime.toString()); //14:13:19.589993400
		System.out.println(currentTime.getHour()); //14
		System.out.println(currentTime.getMinute()); //14
		System.out.println(currentTime.getNano());   //589993400
		System.out.println(currentTime.getSecond());  //19
		System.out.println(currentTime.format(formatter));  //02:13 PM
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("hh:mm a"))); //02:13 PM
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))); 
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("kk:mm:ss"))); 
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a"))); 
        //https://www.baeldung.com/java-datetimeformatter
		//https://www.boraji.com/java-8-localtime-example
		System.out.println(System.currentTimeMillis());
		long x = System.currentTimeMillis();
		LocalTime a = currentTime.now();
		
		String userBirth = JOptionPane.showInputDialog("Please enter your birthday");
		System.out.println(userBirth);
		String[] parts  = userBirth.split("/");
		for(int i = 0; i < parts.length; i++)
		{
			System.out.println(parts[i]);
		}
		LocalDate userBirthday = LocalDate.of(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]));
		int userAge = currentDate.getYear() - userBirthday.getYear();
		JOptionPane.showMessageDialog(null,"Your age is: " + userAge);
		//int x = Integer.parseInt(System.currentTimeMillis());
		LocalTime b = currentTime.now();
		long y = System.currentTimeMillis();
		System.out.println(y-x);
		System.out.println(Duration.between(a, b));
		
	}

}
