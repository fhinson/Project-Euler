import java.math.BigInteger;


public class Problem48 {

	
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		BigInteger thousand = new BigInteger("1000");
		for (int i = 1; i <=1000; i++){
			sum = sum.add(BigInteger.valueOf(i).pow(i));
			//System.out.println(BigInteger.valueOf(i).pow(i));
		}
		System.out.println(sum);

	}

}
