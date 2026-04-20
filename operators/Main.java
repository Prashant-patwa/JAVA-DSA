// Operators Practice (Beginner Level)

public class Main {

    public static void main(String[] args) {

        // Question 1: Add two numbers
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Sum is: " + sum);


        // Question 2: Subtract two numbers
        int x = 10;
        int y = 4;
        int sub = x - y;
        System.out.println("Subtraction is: " + sub);


        // Question 3: Multiply and divide
        int m = 6;
        int n = 2;
        int mul = m * n;
        int div = m / n;
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);


        // Question 4: Check if number is even using operator
        int num = 7;
        if(num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        // Question 5: Use relational operators
        int p = 15;
        int q = 20;
        if(p > q){
            System.out.println("p is greater");
        } else {
            System.out.println("q is greater or equal");
        }


        // Question 6: Use logical operators
        int age = 18;
        if(age >= 18 && age <= 60){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }
}