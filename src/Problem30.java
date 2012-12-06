
public class Problem30 {
	
	public static boolean lister(int x){
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
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum+=Math.pow(array[i], 5);
		}
		if (sum == x){
			return true;
		}
		else return false;
		
	}
	
	public static void main(String[] args){
		int sum = 0;
		for (int i = 2; i<354294; i++){
			if(lister(i)==true){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of all the numbers that can be written as the sum of fifth powers of their digits is " + (sum));
	}

}
