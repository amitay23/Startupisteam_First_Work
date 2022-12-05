package arr;

import java.util.Scanner;

public class even_arr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [] numbers = new int[10];

		
		
		System.out.println("enter 10 numbers ");
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = s.nextInt();
		}
		System.out.println("all even numbers: ");
		
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0)
				System.out.println(numbers[i]);
		}
		
		
		
	}

}
