// Patterns Practice (Beginner Level)

public class Main {

    public static void main(String[] args) {

        // Question 1: Print square pattern
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Question 2: Right angle triangle
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Question 3: Inverted triangle
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Question 4: Number triangle
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Question 5: Same number triangle
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }


        // Question 6: Simple pyramid (not perfectly centered)
        int n = 4;
        for(int i = 1; i <= n; i++){

            // spaces (little confusing logic like beginner)
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            // stars
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}