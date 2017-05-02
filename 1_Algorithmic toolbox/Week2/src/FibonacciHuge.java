
import java.util.*;

public class FibonacciHuge {
	private static long getPisanoPeriod(long m){
		long a=0;
		long b = 1;
		long currentValueMod_M = b+a;
		for(long i = 0; i< m*m; i++){
			currentValueMod_M = (a+b)%m;
			a=b;
			b = currentValueMod_M;
			if(a==0 && b == 1){
				return (i+1);
			}
		}
		return -1l;
	}
	
	
	private static long getFibonacciHugeNaive(long n, long m) {
		long pisannoPer = getPisanoPeriod(m);
		//System.out.println("Pisaano Period:"+pisannoPer);
		long reminder = n % pisannoPer;			
		long a = 0;
		long b = 1;
		long c = reminder;
		for(int i = 1; i< reminder; i++){
			c = (a+b)% m ;
			a=b;
			b= c;	
		}
		return c % m;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		System.out.println(getFibonacciHugeNaive(n, m));
	}
}
