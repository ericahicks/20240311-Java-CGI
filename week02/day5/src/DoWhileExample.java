import java.util.Scanner;
import java.util.Random;

public class DoWhileExample {
    // Challenge: Wrap the number game in a loop ask the user if the want to play again and check if they say yes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0; // initialize the variable used in the condition outside the do-block
        do {
            // Note, all variables declared inside the do block are out of scope in the while condition
            System.out.print("Please guess a number betwen 1 and 10: ");
            guess = in.nextInt();
        } while (guess < 1 || guess > 10); // don't forget your semi-colon
        Random randomGenerator = new Random();
        // nextInt(11) gives us values between 0 inclusive and 11 exclusive so 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10
        int num = randomGenerator.nextInt(10) + 1; // use .nextInt(_) to get a value between 1 and 10 inclusive
        if (num == guess)
            System.out.println("Great job! You're correct :)");
        else
            System.out.println("Sorry, you lose. The number was " + num);
        in.close();
    }
}
