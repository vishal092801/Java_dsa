package sorting;

public class selectionSort {
    public static void Sort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j]<arr[min]){
                   min =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]= temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        Sort(arr);
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
