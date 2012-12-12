import java.util.ArrayList;
import java.util.HashSet;


public class Problem23 {
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
	public static boolean abundant(int a){
		int b = sum(divisors(a));
		if(sum(divisors(b))>a && a!=b){
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		for (int i = 12; i <= 1000; i++){
			for (int j = 12; j <= 1000; j++){
				if (abundant(i) == true && abundant(j) == true){
					sums.add(i+j);
					//System.out.println(sums);
				}
			}
		}
		
		HashSet hs = new HashSet();
		 hs.addAll(sums);
		 sums.clear();
		 sums.addAll(hs);
		 
		 System.out.println(sums);
	}
}
