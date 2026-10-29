//package BinarySearch;

public class binarySearch {
    public static int  BSearch(int arr[], int target){
        int n = arr.length;
        int left = 0;
        int right= n-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]== target) return mid;

            else if (arr[mid]>target){
                right= mid-1;
            }
            else{
                left = mid +1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int ans = BSearch(arr, 2);
        System.out.println(ans);
    }
}
