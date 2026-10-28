// package sorting;

public class selectionSortCountSwap {
    public static int Sort(int arr[]) {
        int n = arr.length;
        int swap =0;
        for (int i = 0; i < n-1 ; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swap++;
            }
        }
        return swap;
    }


    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};

        int c =Sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(c);
    }
    
}
