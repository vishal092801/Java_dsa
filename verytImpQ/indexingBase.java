import util.java.*;
public class indexingBase {
    public static int num[] SumOfTransArray(int num[]){
        int n = num.length;
        int transArray[];
        int add=0;
        for(int i=0; i<n;i++){
            int s= (i%7)*3;
            if(num[i]%11==0){
                add = num[i]+ (num[i]/11);
            }
            transArray[i] = add - s;
        }
        return transArray;

    }
    public static void main(String[] args) {
        int arr[]= {11,14,22};
        System.out.println(SumOfTransArray(arr));
    }
}
