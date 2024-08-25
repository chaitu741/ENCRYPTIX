import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
      
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        
        double averagePercentage = (double) totalMarks / (numberOfSubjects * 100) * 100;

       
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n************");
        System.out.println("Total Marks of student is : " + totalMarks);
        System.out.println("************");
        System.out.println("Average Percentage of student is: " + averagePercentage + "%");
        System.out.println("************");
        System.out.println("Grade of student is: " + grade);
        System.out.println("************");
    }
}