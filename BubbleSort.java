import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the no. of elements :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            // setting the initial value of swap to zero.
            int swap = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swapping when element at position j-1 is greater than element at j position.
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = 1;
                    /* if at any step the swapping is done, we change the swap value to one,
                    so that we know  that the sequence is not sorted at this step.*/
                }
            }
            /*This will check if the swap value is not changed to 1, because if the value
            is not updated then it has not entered the inner loop even once, and no swapping was done.
            Therefore the sequence is sorted now.*/
            if (swap == 0) {
                break;
            }
        }

        System.out.println("sorted array ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}