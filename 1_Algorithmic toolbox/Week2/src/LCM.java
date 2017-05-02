
import java.util.*;

public class LCM {
	
  private static Long gcd(Long a, Long b) {
	  if(a==0){
	    	return b;
	    }
	    return gcd(b%a, a);
  }
  private static long lcm_naive(int a, int b) {
    return (new Long(a) * new Long(b))/gcd(new Long(a), new Long(b));
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
