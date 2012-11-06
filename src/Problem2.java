import java.util.ArrayList;


public class Problem2 {

	public static void main(String[] args) {
		ArrayList<Integer> Fibonacci = new ArrayList<Integer>();
		Fibonacci.add(0); Fibonacci.add(1);
		
		long sum = 0;
		int j = 2;
		
		while(Fibonacci.get(j-2)+Fibonacci.get(j-1) < 4000000){
			Fibonacci.add(Fibonacci.get(j-2)+Fibonacci.get(j-1));
			j++;
		}
		
		for (int i = 0; i < Fibonacci.size(); i++){
			if (Fibonacci.get(i) % 2 == 0)
				sum+=Fibonacci.get(i);
		}
			
		System.out.println("The sum of even valued Fibonacci Terms less than 4 million is " + sum);
	}

}
