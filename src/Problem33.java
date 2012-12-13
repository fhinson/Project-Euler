import java.util.ArrayList;

public class Problem33 {
	
	public static void main(String[] args) {
		
		ArrayList<Double> denominator = new ArrayList<Double>();
		ArrayList<Double> numerator = new ArrayList<Double>();
		
		for (double i = 10; i <= 99; i++){
			for (double j = 10; j <= 99; j++){
				double[] list1 = list(i), list2 = list(j);
				if (i/j < 1){
					if(list1[0] != 0 && list1[1] != 0 && list2[0] != 0 && list2[1] != 0){
						if(list1[1] == list2[0]){
							if((i/j) == list1[0] / list2[1]){
								numerator.add(i); denominator.add(j);
							}
						}
						if(list1[0] == list2[1]){
							if((i/j) == list1[1] / list2[0]){
								numerator.add(i); denominator.add(j);
							}
						}
					}
				}
			}
		}
		
		long product = 1, product2 = 1;
		for (int k = 0; k < denominator.size(); k++){
			product*=denominator.get(k);
			product2*=numerator.get(k);
		}
		long gcd = gcd(product, product2);
		System.out.println("The fraction is " + product2/gcd + "/" + product/gcd);
		
	}
	
	public static long gcd(long a, long b) {
		if (b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static double[] list(double x){
		int v = (int)x;
		String t = Integer.toString(v);
		double z = x;
		int y = t.length() - 1;
		
		double [] array = new double[y+1];
		for (int counter = y; counter >= 0; counter--) {
			double a = z / (Math.pow(10, counter));
			double b = (Math.ceil(a) - 1);
			if (counter == 0){
				b = b+1;
			}
			array[y-counter]=b;
			z = (z - (b*Math.pow(10, counter))); 
		}
		if(array[array.length-1]==10){
			array[array.length-2]+=1;
			array[array.length-1]=0;
		}
		return array;
	}

}
