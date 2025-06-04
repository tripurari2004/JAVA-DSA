public class LargestNum {
    
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = findLargest(arr);
        System.out.println("The largest number in the array is: " + largest);
    }
}
