package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        double number;
        double largestNumber = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number " + counter + ": ");
        number = scanner.nextDouble();

        if (number <= 0.0) {
            System.out.println("No number entered.");
        } else {

            while (number > 0.0) {
                counter++;
                System.out.print("Number " + counter + ": ");
                number = scanner.nextDouble();


                if (largestNumber < number) {
                    largestNumber = number;

                }
            }
            System.out.println("The largest number is " + String.format("%.2f", largestNumber));
        }
    }



    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int rows = scanner.nextInt();
        int number = 1;

        if (rows > 0) {
            for (int j = 0; j < rows; j++) {
                for (int i = 0; i <= j; i++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int rows = 6;

        for (int i=1; i<=rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 != 0) {
            for (int i = 1; i <= (h / 2) ; i++) {       //Obere Hälfte
                for (int j = i; j <= h / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 1; i <= h / 2; i++) {       //Untere Häflte
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= h / 2; j++) {
                    System.out.print("*");
                }
                for (int j = i; j <= h / 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int grade;
        int counter = 1;
        int negativeMarks = 0;
        int sum = 0;
        double average = 0.00;


        do {
            System.out.print("Mark " + counter + ": " );
            grade = scanner.nextInt();

            if (grade <=5 && grade != 0) {
            sum += grade;
            if (grade == 5 ) {
                negativeMarks++;
            }
                counter++;

            } else if (grade != 0) {
                System.out.println("Invalid mark!");

            }else {
                counter--;
            }
        }
        while (grade != 0);

        if (counter != 0) {
            average = (double) sum / counter;
        }

        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Negative marks: " + negativeMarks);


    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 1 && number != 4) {
            while (number > 0) {
                sum = sum + (number % 10) * (number %10);
                number = number / 10;
            }
            number = sum;
            sum = 0;

        }
        if (number == 1) {
            System.out.println("Happy number!");
        }else {
            System.out.println("Sad number!");
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        /*System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid(); */

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}