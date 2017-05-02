package maximumPairWiseProduct;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
	static Long getMaxPairwiseProduct(int[] numbers) {

		int maxIndex1 = -1;
		int maxIndex2 = -1;
		for(int index1=0; index1<numbers.length; index1++){
			if(maxIndex1 == -1 || numbers[maxIndex1]<numbers[index1]){
				maxIndex1 = index1;
			}
		}
		
		for(int index2=0; index2<numbers.length; index2++)
		{
			if((index2 != maxIndex1) && ((maxIndex2 == -1)|| numbers[index2]>numbers[maxIndex2])){
				maxIndex2 = index2;
			}
		}
		
		return new Long( numbers[maxIndex1])* new Long(numbers[maxIndex2]);
		
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
	
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		
		}
		
		System.out.println(getMaxPairwiseProduct(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}