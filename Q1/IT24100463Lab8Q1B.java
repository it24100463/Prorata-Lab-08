import java.util.Scanner;

public class ITxxxxxxxxLab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];   // unused slots stay 0
        int evenIndex = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }

        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
    }
}