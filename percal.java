import java.util.*;
public class percal{

public static void main( String args[] ){
     System.out.println("what is your name");
Scanner sc = new Scanner(System.in);
     String name = sc.next();

     System.out.println(" hello " + name + " have a good day ! percentage obtain by you in board exam is ");

System.out.println("enter the number of subject1 (out of 100) :");
int subject1  = sc.nextInt();
System.out.println("enter the number of subject2 (out of 100) :");

 int subject2 = sc.nextInt();

System.out.println("enter the number of subject3 (out of 100) :");
int subject3 = sc.nextInt();

System.out.println("enter the number of subject4 (out of 100) :");
int subject4 = sc.nextInt();

System.out.println("enter the number of subject5 (out of 100) :");
int subject5 = sc.nextInt();

// total marks and percentage calculation
int totalMarks =  subject1 + subject2 + subject3 + subject4 + subject5 ;
double Percentage = ( totalMarks / 500.0 ) * 100; 
System.out.println("totalMarks = " +totalMarks+" out of 500");
System.out.println("Percentage  obtain by the student= " +Percentage+ "%"); 
 System.out.println("this is good % in board exam ");
}
}