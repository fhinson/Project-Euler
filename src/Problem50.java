import java.util.ArrayList;


public class Problem50 {
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int sumcheck = 0;
		for (int i = 2; i < 1000000; i++){
			if (primecheck(i)==true){
				primes.add(i);
				System.out.println(i);
				for (int j = 0; j<primes.size()-1;j++){
					sumcheck+=primes.get(j);
					if(sumcheck == i){
						System.out.println("BINGO !!!!" + i + " with a length of " + (j+1));
						break;
					}
				}
				sumcheck = 0;
			}
		}
	}

}
