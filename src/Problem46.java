import java.util.ArrayList;


public class Problem46 {

	
	public static void main(String[] args) {
		ArrayList<Integer> compodds = new ArrayList<Integer>();
		for(int i = 2; i < 1000; i++){
			for(int j = 1; j < 1000; j++){
				if (primecheck(i) == true){
					if (primecheck(i + 2*Math.pow(j, 2)) == false && oddcheck(i + 2*Math.pow(j, 2)) == true){
						compodds.add(((int)(i + 2*Math.pow(j, 2))));
						//System.out.println(((int)(i + 2*Math.pow(j, 2))) + " = " + i + "+" + "2*" + j+"^2");
					}
				}
			}
		}
		for(int t = 1; t < 1000; t++){
			if(primecheck(t) == false && oddcheck(t) == true){
				if(compodds.indexOf(t) == -1){
					System.out.println(t + " is the answer");
				}
			}
		}

	}
	
	public static boolean primecheck(int x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}
	
	public static boolean primecheck(double x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}
	
	public static boolean oddcheck(double x){
		if (x % 2 == 0)
			return false;
		else return true;
	}

}
