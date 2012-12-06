import java.util.ArrayList;
import java.util.Scanner;


public class Problem17 {


	public static void main(String[] args) {
		String[] numericals = new String[1000];
		
		numericals[0] = "zero";
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
		numericals[18] = "eightteen";
		numericals[19] = "nineteen";
		numericals[20] = "twenty";
		numericals[30] = "thirty";
		numericals[40] = "fourty";
		numericals[50] = "fifty";
		numericals[60] = "sixty";
		numericals[70] = "seventy";
		numericals[80] = "eighty";
		numericals[90] = "ninty";
		numericals[100] = "onehundred";
		
		
		Scanner input = new Scanner( System.in );
		System.out.println("Please enter a number to find the length of its numerical: ");
		int x = input.nextInt();
		System.out.println(numericals[x].length());
		

	}

}
