
public class Main {

    // Question 1: Function to add two numbers
    public static int add(int a, int b){
        return a + b;
    }


    // Question 2: Function to check even or odd
    public static void checkEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }


    // Question 3: Function to find greatest of two numbers
    public static int greatest(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }


    // Question 4: Function to print multiplication table
    public static void table(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }


    // Question 5: Function to find factorial
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }


    // Question 6: Function to print star pattern
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        // Calling functions

        int sum = add(5, 3);
        System.out.println("Sum is: " + sum);

        checkEvenOdd(7);

        int g = greatest(10, 20);
        System.out.println("Greatest is: " + g);

        table(5);

        int f = factorial(4);
        System.out.println("Factorial is: " + f);

        pattern(4);
    }
}