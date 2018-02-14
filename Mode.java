import java.util.Scanner;

/**
 *  Patrick Byrne Lab 3
 *  11507057
 */
public class Mode {

    /*
    Write a program to find the mode of an array of numbers
     */

    public static void main(String... args) throws Exception{

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int[] data = new int[number]; // first input is the array size

        for(int i=0;i<number;i++){

            data[i]=scan.nextInt(); // fill the array with the inputs

        }

        int record=0; // count the number of occurrences

        int recordNumber=0; // track the most occurred number

        for(int i=0;i<number;i++){

            int count=0;

            for(int j=0;j<number;j++){

                if(data[i]==data[j])

                    count++;

            }

            if(count>record){

                record=count;

                recordNumber=data[i];

            }

        }

        System.out.println(recordNumber);

    }
}
