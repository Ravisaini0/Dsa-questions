import java.util.*;
public class Qustions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Check Even/Odd
        System.out.println("Check Even/Odd");
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //Check whether a number is positive, negative, or zero.
        System.out.println("Check whether a number is positive, negative, or zero"); 
        System.out.println("Enter the whether degree");
        int whether=sc.nextInt();
        if(whether>0){
            System.out.println("whether is postitve");
        }
        else if (whether==0) {
            System.out.println("whether is Zero");
        }else{
            System.out.println("Whether is negative");
        }
        //Check if a person is eligible to vote.
        System.out.println("Check if a person is eligible to vote.");
        
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        if (age<=18) {
            System.out.println("Not Eligible for Voting");
        }else{
            System.out.println("Eligible for Voting");
        }
        //Find the largest of two numbers without equle using if-else.
        System.out.println("Find the largest of two numbers using if-else.");
        System.out.println("Enter the First no.");
        int First=sc.nextInt();
         System.out.println("Enter the Sec no.");
         int Second=sc.nextInt();
         if(First>Second){
            System.out.println(First + " First Number is Largest");
         } else{
            System.out.println( Second+ " Second Number is Largest");
         }    

         //Find the largest of three numbers without equle using else-if.
         System.out.println("Find the largest of three numbers using else-if."); 
         
          System.out.println("Enter the First no.");
        int Fir=sc.nextInt();
         System.out.println("Enter the Sec no.");
         int Sec=sc.nextInt();
         System.out.println("Enter the Three no.");
         int Three=sc.nextInt();
         if(Fir>Sec && Fir>Three){
            System.out.println(Fir + " First Number is Largest");
         } 
         else if(Three>Sec && Three>Fir){
            System.out.println(Three+"Three Number is Largest");
         }
         else{
            System.out.println( Sec+ " Second Number is Largest");
         }     
         //Check whether a year is a leap year
         System.out.println("Check whether a year is a leap year");

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        //Print the grade based on marks
        System.out.println("Print the grade based on marks");
          System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
        //Simple Calculator using switch
        System.out.println("Simple Calculator using switch");
         System.out.print("Enter First Number: ");
        int first = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();

        System.out.print("Enter Operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println(first + second);
                break;

            case '-':
                System.out.println(first - second);
                break;

            case '*':
                System.out.println(first * second);
                break;

            case '/':
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
        //Print the day of the week (1–7)
        System.out.println("Print the day of the week (1–7)");
        System.out.print("Enter Day Number: ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
        //Check whether a character is a vowel or consonant
        System.out.println("Check whether a character is a vowel or consonant");
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        //Login using Nested if
        System.out.println("Login using Nested if");
        System.out.println("Tempare Username admin and Password 1234");
            System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        if (username.equals("admin")) {

            if (password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
}
}