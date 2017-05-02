import java.util.Scanner;

public class Change {
	private static int getChange(int m) {
		int countForDenomination10 = m/10;
		m = m-countForDenomination10*10;
		int countForDenomination5 = m/5;
		m = m-countForDenomination5*5;
		int countForDenomination1= m/1;
		return (countForDenomination1+countForDenomination10+countForDenomination5);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
