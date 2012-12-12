import java.util.Arrays;

public class lister {
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
	
	public static void printer(int[] x){
		System.out.println(Arrays.toString(x));
	}
	
	public static void main(String[] args){
		printer(list(540));
		printer(newlister(54032));
	}
	
	
	public static int[] newlister(int x){
		String y = Integer.toString(x);
		
		char[] c = new char[y.length()];

		for (int counter = 0; counter < y.length(); counter++){	
			c[counter] = y.charAt(counter);
		}
		
		int[]n = new int[c.length];
		
		for (int i = 0; i < n.length; i++){
			n[i] = Integer.parseInt(Character.toString(c[i]));
		}
		
		return n;
	
	}
}
