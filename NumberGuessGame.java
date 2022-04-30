import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        //  System.out.println(number);

        while (right < 5) {
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0-100");
                if (isWrong) {
                    right++;
                    System.out.println("last "+(5 - right)+" chance"  );
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations, right guess! Your guess : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong !");
                if (selected > number) {
                    System.out.println("Down");
                } else {
                    System.out.println("Up");
                }

                wrong[right++] = selected;
                System.out.println("last "+(5 - right)+" chance"  );
            }
        }

        if (!isWin) {
            System.out.println("You lost ! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev