import java.math.BigInteger;
import java.util.ArrayList;


public class Problem16 {

	public static void main(String[] args) {
		BigInteger value= new BigInteger("10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376");
		
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
	

//consulted http://stackoverflow.com/questions/13206556/split-biginteger-into-digits-and-put-them-in-an-array
	
}
