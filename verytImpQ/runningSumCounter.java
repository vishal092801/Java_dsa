

public class runningSumCounter {
    public static void SumAndCounter(int N){

        int counter=0;
        int runningSum = 0;

        for(int i=0; i<=N; i++){
            runningSum += i;
            if(runningSum%5 == 0) counter++;
        }
        System.out.println("Running sum is "+ runningSum);
        System.out.println("Counter is " +counter);

    }
    public static void main(String[] args) {
        SumAndCounter(10);
        
    }
}

