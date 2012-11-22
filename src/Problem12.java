import java.util.ArrayList;

public class Problem12 {

	public static void main (String[] args) {

		ArrayList<Long> triangle = triangle(5);
		for (int i = 199999; i < 200000; i++) {
			System.out.println(triangle.get(i) + ":" + divisor(triangle.get(i)));
			if (divisor(triangle.get(i)) == 500) {
				System.out.println("The first triangle number that has over 500 divisors is " + triangle.get(i));
			break;
			}
		}
	}

	private static ArrayList<Long> triangle(int x) {

		ArrayList<Long> triangle = new ArrayList<Long>();
		triangle.add((long) 1);
		long sum = 0;
		for(long i = 1; i < 200000; i++) {
			sum += i;
			triangle.add(sum);
			//System.out.println(triangle.get(i));
		}
		return triangle;
	}

	private static int divisor(long a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if (a % i == 0) 
				count += 1;
		}
		return count;
	}

}
