
public class Problem6 {

	public static void main(String[] args) {
		int numsum = 0;
		for (int i = 0; i<=100; i++){
			numsum+=i;
		}
		numsum = numsum*numsum;
		
		int squaresum = 0;
		for (int i = 0; i<=100; i++){
			squaresum+=(i*i);
		}
		
		System.out.println("The difference between the sum of the squares and the square of the sum is " + (numsum-squaresum));
	}

}
