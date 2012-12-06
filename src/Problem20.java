import java.math.BigInteger;
import java.util.ArrayList;


public class Problem20 {
	public static void main(String[] args) {
		BigInteger value= new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		BigInteger ten = new BigInteger("10");
		while (!value.equals(BigInteger.ZERO))
		{
		    list.add(0, value.mod(ten).intValue());
		    value = value.divide(ten);
		}
		
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++){
			sum+=list.get(i);
		}
		
		System.out.println("The sum is " + sum);
		
	}

}
