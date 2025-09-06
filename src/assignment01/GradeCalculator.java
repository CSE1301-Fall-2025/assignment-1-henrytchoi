import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("how many studios did you attend?");
        double studiosAttended = in.nextDouble(); //studio grade
        double weightedStudios = (studiosAttended / 8.0) * 15.0;
        double roundedStudios = Math.round(weightedStudios * 100.0) / 100.0;
        System.out.println("What is your average quiz grade, with drops included?");
        double averageQuizGrade = in.nextDouble(); //quiz grade
        double weightedQuizzes = averageQuizGrade * .25;
        double roundedQuizzes = Math.round(weightedQuizzes * 100.0) / 100.0;
        System.out.println("What is your average exam grade?");
        double averageExamGrade = in.nextDouble(); //exam grade
        double weightedExams = averageExamGrade * .6;
        double roundedExams = Math.round(weightedExams * 100.0) / 100.0;
        double TotalGrade = roundedExams + roundedQuizzes + roundedStudios;
        System.out.println("CSE Grade for " + name);
        System.out.println("Number of studios attended: " + studiosAttended);
        System.out.println("Weighted studio grade (out of 15): " + roundedStudios + "%");
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 25): " + roundedQuizzes + "%");
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 60): " + roundedExams + "%");
        System.out.println("Total Grade: " + TotalGrade + "%");







    }

}
