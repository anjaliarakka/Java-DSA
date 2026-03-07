package com.anjali.Basics.Functions;

import java.util.Scanner;

public class DisplayGradesOfMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of subjects: ");
        int countOfSubjects = input.nextInt();

        System.out.print("Enter marks for " + countOfSubjects + " subjects: ");
        float obtainedMarks = 0;

        for(int i=0; i<countOfSubjects; i++) {
            obtainedMarks += input.nextInt();
        }

        calculateGrade(obtainedMarks, countOfSubjects);

//        float average = obtainedMarks / (countOfSubjects*100);
//        float percentage = average * 100;

//        switch((int)percentage/10) {
//            case 10:
//            case 9:
//                System.out.println("Grade: AA");
//                break;
//            case 8:
//                System.out.println("Grade: AB");
//                break;
//            case 7:
//                System.out.println("Grade: BB");
//                break;
//            case 6:
//                System.out.println("Grade: BC");
//                break;
//            case 5:
//                System.out.println("Grade: CD");
//                break;
//            case 4:
//                System.out.println("Grade: DD");
//                break;
//            default:
//                System.out.println("Fail!");
//
//        }
    }

    static void calculateGrade(float marks, int numberOfSubjects) {
        float average =  marks / (numberOfSubjects*100);
        float percentage = average * 100;

        switch((int)percentage/10) {
            case 10,9 -> System.out.println("Grade: AA");
            case 8 -> System.out.println("Grade: AB");
            case 7 -> System.out.println("Grade: BB");
            case 6 -> System.out.println("Grade: BC");
            case 5 -> System.out.println("Grade: CD");
            case 4 -> System.out.println("Grade: DD");
            default -> System.out.println("Fail!");
        }

    }
}
