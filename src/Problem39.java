import java.util.ArrayList;


public class Problem39 {
	
	public static void main(String[] args){
		
		ArrayList ps = new ArrayList();
	
		for (int i = 1; i <= 333; i++){
			for (int j = 1; j <= 333; j++){
				for (int k = 1; k <= 333; k++){
					if(Math.pow(i,i) + Math.pow(j,j) == Math.pow(k, k)){
						ps.add(i+j+k);
						System.out.println(ps);
					}
				}
			}
		}
		System.out.println(ps);
		
	}

}
