import java.util.ArrayList;
import java.util.Scanner;


public class Problem17 {


	public static void main(String[] args) {
		String[] numericals = new String[1001];
		
		numericals[0] = "";
		numericals[1] = "one";
		numericals[2] = "two";
		numericals[3] = "three";
		numericals[4] = "four";
		numericals[5] = "five";
		numericals[6] = "six";
		numericals[7] = "seven";
		numericals[8] = "eight";
		numericals[9] = "nine";
		numericals[10] = "ten";
		numericals[11] = "eleven";
		numericals[12] = "twelve";
		numericals[13] = "thirteen";
		numericals[14] = "fourteen";
		numericals[15] = "fifteen";
		numericals[16] = "sixteen";
		numericals[17] = "seventeen";
		numericals[18] = "eighteen";
		numericals[19] = "nineteen";
		numericals[20] = "twenty";
		numericals[30] = "thirty";
		numericals[40] = "forty";
		numericals[50] = "fifty";
		numericals[60] = "sixty";
		numericals[70] = "seventy";
		numericals[80] = "eighty";
		numericals[90] = "ninety";
		numericals[100] = "onehundred";
		numericals[200] = "twohundred"; 
		numericals[300] = "threehundred";
		numericals[400] = "fourhundred";
		numericals[500] = "fivehundred";
		numericals[600] = "sixhundred";
		numericals[700] = "sevenhundred";
		numericals[800] = "eighthundred";
		numericals[900] = "ninehundred";
		numericals[1000] = "onethousand";
		
		int[] carry;
		for (int i = 0; i<numericals.length; i++){
			if(numericals[i] == null){
				carry = lister(i);
				numericals[i] = "";
				for (int j = 0; j<carry.length; j++){
					if(carry.length == 3 && j == 1){
						numericals[i]+=numericals[(int) (carry[j]*Math.pow(10,(carry.length-1 - j)))+carry[j+1]];
					break;
					}
					else{
					numericals[i]+=numericals[(int) (carry[j]*Math.pow(10,(carry.length-1 - j)))];
					if(carry.length == 3 && j == 0)
						numericals[i]+="and";
					}
				}
				
			}
				
		}
		numericals[0] = "zero";
		
		//for (int i = 0; i <1000; i++){
		Scanner input = new Scanner( System.in );
		System.out.println("Please enter a number to find the length of its numerical: ");
		int x = input.nextInt();
		System.out.println(numericals[x] + " : " + numericals[x].length());
		//}
		String result = "";
		
		for (int n = 1; n < numericals.length; n++){
			result+=numericals[n];
			System.out.println(numericals[n]);
		}
		System.out.println("If all the numbers from 1 to 1000 inclusive were written out in words, " + result.length() + " would be used");
		

	}
	
	public static int[] lister(int x){
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
		return array;
	}

}
