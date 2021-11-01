package computernetwork_lab_3;

import java.util.Scanner;

public class Even_Odd_Array {

    public static void main(String[] args) {
        int n, i;

        System.out.println("Enter You Array Size : ");

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        int array[] = new int[n];
        // Array Element Input
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; i++) {

            array[i] = input.nextInt();
        }
        System.out.println("Odd Numbers:");

        for (i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                System.out.println(array[i]);
            }
        }

        System.out.println("Even Numbers:");

        for (i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.println(array[i]);
            }
        }
    }
}
