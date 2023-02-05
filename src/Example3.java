import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {


        int [] array = {1,2,3,5,0};

        int n = array.length;
        int summaAllElements = n * (n+1) /2;

        int summaWithoutOneElement=0;

        for (int i = 0; i <array.length ; i++) {
            summaWithoutOneElement = summaWithoutOneElement + array[i];
        }


        int missingElement = summaAllElements - summaWithoutOneElement;

        System.out.println("Missing element - " + missingElement);


    }
}


