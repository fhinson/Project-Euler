
public class Problem9 {

	public static void main(String[] args) {
		for (double i = 1; i <500; i++){
			for (double j = 1; j<500; j++){
				if (checker((i*i)+(j*j)) == true && i + j + sqrt((i*i)+(j*j)) == 1000){
					System.out.println("The pythagorean triple is " + i + ", " + j + ", " + sqrt((i*i)+(j*j)));
					System.out.println("The product is " + i*j*(sqrt((i*i)+(j*j))));
					break;
				}
			}
		}
	}
	
	public static boolean checker(double x){
		boolean a = false;
		if (Math.pow(x, 0.5) - Math.ceil(Math.pow(x, 0.5)) == 0)
			a = true;
		return a;
	}
	
	public static double sqrt(double x){
		return Math.pow(x, 0.5);
	}

}
