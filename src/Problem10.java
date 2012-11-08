
public class Problem10 {
	
	
	public static void main(String [] sdf){
		long sum = 0;
	for (int i = 2; i<2000000; i++){
		if(primecheck(i)==true){
			sum+=i;
			System.out.println(i);
		}
	}
	System.out.println("The sum of primes below 2million is " + sum); 	
	}
	
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}

}


