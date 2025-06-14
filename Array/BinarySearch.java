public class BinarySearch {

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
       
        while(left <= right){
            int mid = left+right / 2;

            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[mid] < key){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
