import java.util.Scanner;

/**
 *  Patrick Byrne 11507057
 *
 *  Problem Statement
 *
 *  The goal is to read in a number N and output the distance between the prime number that preceeds it, and the prime that follows it.
 *  If the number itself happens to be prime, then output the distance to the subsequent prime. For example,
 *  if N is 7, then output 4, because the next prime is 11, which is 4 away.
 *
 *   Input Format:   An integer N.
 *
 *   Output Format:  The distance between the preceeding and subsequent prime number at N.
 *
 *   Constraints:    2≤N≤1000
 */
public class PrimeSpacing {

    public static void main(String...args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] primeArray = new int[N]; // array to store all calculated prime numbers

        int primeCount = 1; // number of primes found

        primeArray[0] = 2;

        for (int i=2; i<(N*2); i++) { // next prime is within the distance of n^2

            boolean primeTest = true; // base case is true

            for (int j=0; j < primeCount && primeTest; j++) { // complexity n^2

                if (i % primeArray[j]==0) // if the number is divisible by anything other than itself or one it is not a prime

                {

                    primeTest = false;

                    j = primeCount;

                }

            }

            if (primeTest) // value is a prime number

            {

                primeArray[primeCount] = i; // added to array

                primeCount++;

            }

        }

        int higher = 0;

        int lower = 0;

        for (int i=0; i<primeCount; i++) // find the value that is higher than N

        {

            if (primeArray[i]>N)

            {

                higher = primeArray[i];

                lower = primeArray[i-1];

                i = primeCount;

            }

        }

        int diff = higher - lower;

        System.out.println(diff);

    }

}