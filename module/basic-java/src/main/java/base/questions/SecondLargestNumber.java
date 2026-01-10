package base.questions;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 7, 6, 1, 4, 2};
        int[] arr3 = {7, 6, 6, 1, 4, 2};
        int[] arr4 = {2, 6, 6, 1, 4, 7};
        int[] arr5 = {6, 5, 7, 1, 4, 2};

        // Store all arrays in a 2D array container
        int[][] allArrays = {arr1, arr2, arr3, arr4, arr5};

        for (int i = 0; i < allArrays.length; i++) {
            System.out.printf("\nLoop number: %d\n", i + 1);
            getSecondlargestNumber(allArrays[i]);
        }
    }

    public static void getSecondlargestNumber(int[] arraysNum) {
        int largest = arraysNum[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0 ; i < arraysNum.length ; i++) {
            if (arraysNum[i] > largest) {
                secondLargest = largest;
                largest = arraysNum[i];
            } else if (arraysNum[i] > secondLargest && arraysNum[i] != largest) {
                secondLargest = arraysNum[i];
            }
        }

        System.out.printf("Largest number is: %s\nSecond Largest number is: %s", largest,secondLargest);
    }
}
