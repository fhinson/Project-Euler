import java.math.BigInteger;

public class Problem25 {

	public static void main (String[] args) {

		int x = -1;
		for (int i = 1; i < 10000; i++) {
			x++;
			if (fibonacci(i).toString().length() == 1000) {
				System.out.println("First term to contain 1000 digits in the fibonacci sequence is " + x);
				break;
			}
		}
	}

	private static BigInteger fibonacci (int x) {
		BigInteger p1 = new BigInteger("0");
		BigInteger p2 = new BigInteger("1");
		for (int i = 1; i < x; i++) {
			BigInteger savePrev = p1;
			p1 = p2;
			p2 = savePrev.add(p2);
		}
		return p1;
	}
}