public class AbsDiff {
    int countAbsDiff(int []arr, int num, int dif){
      int n = arr.length;
      int count=0;
      for(int i=0; i<n; i++){
        int absDif = Math.abs(arr[i]-num);
        if (absDif<= dif) count++;
      }  
      return count;
    }

    public static void main(String[] args) {
        int array[]= {12, 3, 14, 56, 77, 13};
        AbsDiff a = new AbsDiff();
        int ans = a.countAbsDiff(array, 13, 2);
        System.out.println(ans);
    }
}
