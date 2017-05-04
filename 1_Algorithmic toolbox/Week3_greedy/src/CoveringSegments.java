import java.util.*;

public class CoveringSegments {

	private static int[] optimalPoints(Segment[] segments) {
		// write your code here
		Arrays.sort(segments);
		List<Integer> points = new ArrayList<>();
		int index = 0;
		int i = 0;
		Segment minRightMostPoint = null;
		while (index < segments.length) {
			minRightMostPoint = segments[index];
			points.add(minRightMostPoint.end);
			while (i < segments.length) {
				Segment nextRightMostPoint = segments[i];
				if (nextRightMostPoint.start <= minRightMostPoint.end) {
					i = i + 1;
					index = i;
					
				} else {
					break;
				}
			}

		}

		int[] pointsToReturn = new int[points.size()];
		int j = 0;
		for (Integer val : points) {
			pointsToReturn[j] = val;
			j++;
		}
		return pointsToReturn;
	}

	private static class Segment implements Comparable<Segment> {
		int start, end;

		Segment(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Segment o1) {
			if (this.end < o1.end) {
				return -1;
			} else if (this.end == o1.end) {
				if (this.start < o1.start) {
					return -1;
				} else if (this.start > o1.start) {
					return 1;
				} else {
					return 0;
				}

			} else
				return 1;

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		Segment[] segments = new Segment[n];
		for (int i = 0; i < n; i++) {
			int start, end;
			start = scanner.nextInt();
			end = scanner.nextInt();
			segments[i] = new Segment(start, end);
		}
		int[] points = optimalPoints(segments);
		System.out.println(points.length);
		for (int point : points) {
			System.out.print(point + " ");
		}
	}
}
