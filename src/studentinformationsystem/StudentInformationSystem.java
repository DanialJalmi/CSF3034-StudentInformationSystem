
package studentinformationsystem;

/**
 * Author: DANIAL BIN JALMI SHAFIZAL
 * Program Name: StudentInformationSystem.java
 * Description: To create a Student Information System java program 
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 */
public class StudentInformationSystem {

    
    public static void main(String[] args) {
        
        // i. Display student name and student ID
        String studentName = "Danial Jalmi"; 
        String studentID = "S87118";
        
        System.out.println("=== Student Information System ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID  : " + studentID);
        System.out.println("---------------------------------");

        // ii. Store two marks using variables
        double mark1 = 42.5;
        double mark2 = 45.0;

        // iii. Calculate the total mark
        double totalMark = mark1 + mark2;

        // iv. Display the total
        System.out.println("Mark 1     : " + mark1);
        System.out.println("Mark 2     : " + mark2);
        System.out.println("Total Mark : " + totalMark);

        // v. Display a message based on the total
        System.out.print("Result     : ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        System.out.println("=================================");
    }
}

    
    

