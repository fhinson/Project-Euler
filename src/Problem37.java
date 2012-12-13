
public class Problem37 {
static int counter = 0;

	public static void main(String[] args) {
	check(list(3797));

	}
	
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
	
	public static void check(int[] array){
		int newnum = 0;
		for (int j = 1; j<array.length; j++){
			for (int i = j; i<array.length; i++){
				newnum+=array[i]*Math.pow(10, array.length-j-i);
			}
			if(primecheck(newnum)==true){
				System.out.println(newnum + " : " + counter);
				if(newnum > 9){
					counter++;
					check(list(newnum));
				}
				else{
					break;
				}
			}
		}
		//return counter;
		
	}
	
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}

}
