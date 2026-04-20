
public class Main {

    public static void main(String[] args) {

        // Question 1: Check if number is positive or negative
        int num1 = -5;
        if(num1 >= 0){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }


        // Question 2: Check if number is even or odd
        int num2 = 7;
        if(num2 % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        // Question 3: Find greatest of two numbers
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }


        // Question 4: Check if a number is divisible by 5 and 3
        int num3 = 15;
        if(num3 % 5 == 0 && num3 % 3 == 0){
            System.out.println("Divisible by both 5 and 3");
        } else {
            System.out.println("Not divisible by both");
        }


        // Question 5: Check if a character is vowel or consonant
        char ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }


        // Question 6: Check if a number is greater than 100
        int num4 = 120;
        if(num4 > 100){
            System.out.println("Number is greater than 100");
        } else {
            System.out.println("Number is less than or equal to 100");
        }

    }
}