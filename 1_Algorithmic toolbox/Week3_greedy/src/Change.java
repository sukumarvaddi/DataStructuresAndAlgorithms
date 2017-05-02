import java.util.Scanner;

public class Change {
	private static int getChange(int m) {
		return m;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
