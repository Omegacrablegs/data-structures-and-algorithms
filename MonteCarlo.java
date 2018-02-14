import java.util.Scanner;

/**
 *  Patrick Byrne 11507057
 *  Problem Statement
 *
 * The goal is to read in a number of fair coin tosses, and the probability that a given coin toss will produce heads, and output the probability that the majority of coin tosses will be heads, rounded to the nearest percent.
 *
 * Input Format: An integer N for the number of coin tosses, followed on the next line by an integer H for the probability of getting heads.
 * Output Format: An integer from 0 to 100 representing the percentage probability that the majority of coin tosses will be heads.
 *
 * Constraints: 0≤N≤1000  0≤H≤100
 *
 */
public class MonteCarlo {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        double tosses = scan.nextInt(); // number of coin flips
        double bias = scan.nextInt(); // how bias the coin is
        double count = 0;
        double simulations = 1000;

        for (int i = 0; i < simulations; i++) { // Monte Carlo Simulation

            double total = 0;

            for (int j = 0; j < tosses; j++) {

                if (Math.random() < bias / 100.0) { // mimics the same chance of the coin flip

                    total++;

                }

            }

            if (total > tosses / 2.0) { //check majority

                count++; // adds to the simulation result

            }

        }

        System.out.println((count * 100 / simulations));

    }
}
