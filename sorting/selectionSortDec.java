package sorting;

public class selectionSortDec {
    public static void sortDec(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int maxIndex= i;
            for(int j= i+1; j<n; j++){
                if(arr[j]>arr[maxIndex]) maxIndex= j;
            }
            int temp= arr[i];
            arr[i]= arr[maxIndex];
            arr[maxIndex] = temp;
        }
        
    }
    public static void main(String[] args) {
        int arr [ ]= {12,5,19,3,8,15};
        sortDec(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
