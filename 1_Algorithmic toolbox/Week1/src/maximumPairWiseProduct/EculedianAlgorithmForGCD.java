package maximumPairWiseProduct;

public class EculedianAlgorithmForGCD {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);

	}

	public static void main(String[] args) {
		int result = gcd(357, 234);
		System.out.println(result);
	}
}
