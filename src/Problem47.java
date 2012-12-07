
public class Problem47 {

	public static void main(String[] args) {
		int check = 0;
		for (int i = 1; i < 1000000; i++){
			
			if(divisor(i) == 4){
				check++;
				System.out.println(i + " is a match! : " + check);
				if (check == 4){
					System.out.println((i-3) + " is the answer!");
					break;
				}
				if (divisor(i+1) != 4){
					check = 0;
				}
			}
		}
	}
	
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}
	
	private static int divisor(int a) {
		int count = 0;
		for(int i = 2; i <= a; i++) {
			if (a % i == 0 && primecheck(i) == true) 
				count += 1;
		}
		return count;
	}

}
