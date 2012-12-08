import java.math.BigInteger;
import java.util.ArrayList;


public class Problem36 {


	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000000; i++){
			BigInteger binary = new BigInteger(Integer.toBinaryString(i));
			if(evaluator(BigInteger.valueOf(i)) == true && evaluator(binary)== true){
				System.out.println(i + " is a bingo!");	
				sum+=i;
			}
		}
		System.out.println("The sum of all numbers, less than one million, which are palindromic in base 10 and base 2 is " + sum);
	}
	
	public static boolean evaluator(BigInteger x){
		ArrayList<Integer> foo = list(x); 
		Integer[] list = foo.toArray(new Integer[0]);
		int check = 0;
			for(int i = 0; i <= (list.length/2)-1; i++){
				if(list[i] == list[list.length-i-1]){
					check++;
				}
			}
			if (check == list.length/2)
				return true;
		return false;
		
	}
	public static ArrayList<Integer> list(BigInteger value){
		ArrayList<Integer> list = new ArrayList<Integer>();
		BigInteger ten = new BigInteger("10");
		while (!value.equals(BigInteger.ZERO))
		{
		    list.add(0, value.mod(ten).intValue());
		    value = value.divide(ten);
		}
		return list;
	}
}
