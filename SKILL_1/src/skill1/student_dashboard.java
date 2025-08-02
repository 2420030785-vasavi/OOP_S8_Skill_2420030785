package skill1;
import java.util.Scanner;
public class student_dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long rollNumber = 2420030785L;
	        String name = "K.Vasavi";
	        float marks = 94.9f;
	        char gender = 'F';
	        boolean isPassed = true;       
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Name        : " + name);
	        System.out.println("Marks       : " + marks);
	        System.out.println("Gender      : " + gender);
	        System.out.println("Status      : " + (isPassed ? "Pass" : "Fail"));
	}

}
