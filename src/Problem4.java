import java.util.ArrayList;
import java.util.Collections;


public class Problem4 {

	public static void main(String[] args) {
		ArrayList<Integer> Palos = new ArrayList<Integer>();
		for (int i = 100; i<=999; i++){
			for (int j = 100; j <= 999; j++){
				int k = i*j;
				if (Integer.toString(k).length() == 6){
					if (evaluator(k) == true){
						Palos.add(k);
					}
				}
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers " + Collections.max(Palos));
	}
	
	public static boolean evaluator(int x){
		int[] list = lister(convert(x));
		boolean a = false;
		int check = 0;
		for (int i = 0; i<=2; i++){
			if (list[i] == list[5-i]){
				check++;
			}
		}
		if (check == 3)
			a = true;
		return a;
	}
	
	public static String convert (int x) {
		return Integer.toString(x);
	}

	public static int[] lister(String x){
		int z = Integer.parseInt(x);
		int y = x.length() - 1;
		
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
		return array;
	}

}
