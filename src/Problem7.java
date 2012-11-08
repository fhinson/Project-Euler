
public class Problem7 {

	
	public static void main(String[] args) {
		int counter = 0;
		int count = 2;
		while (counter != 10001){
			if (primecheck(count) == true){
				counter++;
			}
			count++;
		}
		System.out.println("The 10001st prime number is " + (count-1));
	}
	
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}

}
