// Loops Practice (Beginner Level)

public class Main {

    public static void main(String[] args) {

        // Question 1: Print numbers from 1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        // Question 2: Print even numbers from 1 to 20
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


        // Question 3: Sum of first 5 natural numbers
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);


        // Question 4: Print multiplication table of 5
        int num = 5;
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        // Question 5: Reverse a number
        int number = 123;
        int rev = 0;
        while(number != 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number: " + rev);


        // Question 6: Print simple star pattern
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}