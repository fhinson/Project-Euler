import java.util.Arrays;


public class Problem34 {

	public static void main(String[] args) {
		for (int i = 3; i < 10000000; i++ ){
			if (factorialize(list(i)) == i){
				System.out.println(i + " is a match!!!");
			}
		}
	}
	
	public static int[] list(int x){
		String t = Integer.toString(x);
		int z = x;
		int y = t.length() - 1;
		
		int [] array = new int[y+1];
		
		for (int counter = y; counter >= 0; counter--) {
			
			double a = z / (Math.pow(10, counter));
			
			int b = (int)(Math.ceil(a) - 1);
			if (counter == 0){
				b = b+1;
			}
			array[y-counter]=b;
			z = (int)(z - (b*Math.pow(10, counter))); 
		}
		if(array[array.length-1]==10){
			array[array.length-2]+=1;
			array[array.length-1]=0;
		}
		return array;
	}
	
	public static int factorialize(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum+=Factorial(array[i]);
		}
		return sum;
	}
	
	public static int Factorial(int n){
		if (n == 0)
			return 1;
		else
			return n * Factorial(n-1);
	}
	

}
