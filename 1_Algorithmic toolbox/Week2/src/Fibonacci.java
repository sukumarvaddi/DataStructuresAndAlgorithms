
import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
	long [] fibArray = new long[n+1];  
	fibArray[0] = 0;
	if(n>=1){
		fibArray[1] = 1;
	}
    for(int i = 2; i<n+1; i++){
    	fibArray[i]= fibArray[i-1]+fibArray[i-2];
    }
    return fibArray[n];
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
