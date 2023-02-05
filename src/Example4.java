import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();


        int[]array = new int[size];

        System.out.println("Please enter an array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Please enter the amount: ");
        int sum = scanner.nextInt();

        int pair = 0;
        for (int i = 0; i <size; i++) {
            for (int j = i+1; j < size ; j++) {
                if (array[i] + array[j] == sum){
                    pair ++;
                }

            }

        }

        System.out.println("Kоличество пар элементов в массиве, сумма которых равна" + sum+ "равно - " +pair);



    }
}



