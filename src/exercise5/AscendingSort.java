package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for(int i=0; i<numbers.length; i++){

          int min_index = i;
          for(int j=i+1; j<numbers.length; j++){
            if(numbers[j]<numbers[min_index]){
              min_index=j;
            }
          }
          int temp=numbers[i];
          numbers[i] = numbers[min_index];
          numbers[min_index]=temp;
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
