import java.lang.reflect.Array;
import java.util.*;

public class DotProduct {
    private static long maxDotProduct(long[] a, long[] b) {
        //write your code here
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = (a.length-1); i>=0; i--){
        	result = result+((a[i]*b[i]));
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a , b));
    }
}

