import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;


public class Problem29 {
	
	public static void main(String[] args){
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		BigInteger hundred = new BigInteger("101");
		 for (BigInteger bi = BigInteger.valueOf(2); bi.compareTo(hundred) < 0; bi = bi.add(BigInteger.ONE)) {
			 for (int bn = 2; bn <= 100; bn++){
				 numbers.add(bi.pow(bn));
			 }
		}
		 
		 HashSet hs = new HashSet();
		 hs.addAll(numbers);
		 numbers.clear();
		 numbers.addAll(hs);
		
		System.out.println("The total number of distinct numbers is " + numbers.size());
	}

}
