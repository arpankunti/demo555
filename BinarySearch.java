public class BinarySearch {

    /**
     * Expectation : Array should be sorted
     *
     * if the num is found then print the index
     *
     * else print that the number is not found
     * @param arr
     * @param left
     * @param right
     * @param num
     *
     * TC : O(logn)
     *
     */
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        int sum=0;
        while( first <= last ){
            sum++;
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
               // System.out.println("Element is found at index: " + mid);
                 break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        System.out.println(sum-1);

        if ( first > last ){
            //System.out.println("Element is not found!");
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8};

        binarySearch(arr, 0, arr.length-1 , 8);
    }
}