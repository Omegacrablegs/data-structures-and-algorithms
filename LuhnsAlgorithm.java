import java.util.Scanner;

/**
 *  Patrick Byrne Lab 1
 *  11507057
 */
public class LuhnsAlgorithm {

    /*
    Write a program to check if a credit card number satisfies Luhn's Algorithm
     */

    public static void main(String args []) throws Exception {

        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        int total=0;

        for(int i=0;i<number.length()-1;i++){

            int digit = Integer.parseInt(""+number.charAt(number.length()-i-2)); // access the numbers one at a time in reverse order

            if(i%2==0){

                digit=digit*2; // if the number is at an even position multiply by two

            }

            if(digit>9){

                digit=digit-9; // if the digit is larger than nine, minus nine

            }

            total+=digit;

        }

        if((total+Integer.parseInt(""+number.charAt(number.length()-1)))%10==0){ // if the check digit + the total % 10 is 0 then the number is valid

            System.out.println("VALID");

        }else{

            System.out.println("INVALID");

        }

    }

}
