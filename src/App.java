
/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int highest = Integer.valueOf(scanner.nextLine());
        int lowest = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter test scores: ");
        int score = Integer.valueOf(scanner.nextLine());
        while (true) {

            if (score == -1) {
                break;
            }

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }

        }
        System.out.println("The highest score was " + highest);
        System.out.println("The lowest score was " + lowest);
    }

}
