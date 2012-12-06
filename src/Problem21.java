import java.util.ArrayList;


public class Problem21 {
	public static ArrayList<Integer> divisors(int a){
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i < a; i++){
			if (a % i == 0){
				divisors.add(i);
			}
		}
		return divisors;
	}
	public static int sum(ArrayList<Integer> a){
		int s = 0;
		for (int i = 0; i <a.size(); i++){
			s+=a.get(i);
		}
		return s;
	}
	public static boolean check(int a){
		int b = sum(divisors(a));
		if(sum(divisors(b))==a && a!=b){
			return true;
		}
		else return false;
	}
	public static void main(String[] args){
		int sum = 0;
		for (int i = 1; i < 10000; i++){
			if (check(i)==true) {
				System.out.print(i);
				System.out.print(" : " +divisors(i));
				System.out.println();
				sum+=i;
			}
		}
		System.out.println("The sum of the amicable numbers under 10000 is " + sum);
	}
	

	
}
