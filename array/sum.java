package array;

public class sum {
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        int s=0;
        for(int i=0; i<3; i++){
            s+=arr[i];
        }
        System.out.println("sum is " + s);
    }
}
