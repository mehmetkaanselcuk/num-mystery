import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Kaan is holding a number between 1 and 100 in his mind.");
        System.out.println("Can you guess what it is?");
        while (guess != number) {
            System.out.print("Your guess: ");
            guess = input.nextInt();

            if (guess < number) {
                System.out.println("Too low try something higher.");
            } else if (guess > number) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Good job! You guessed the number.");
            }
        }

    }
}
