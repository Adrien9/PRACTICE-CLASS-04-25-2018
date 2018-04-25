package DivisibleBy4_5;
import java.util.Scanner;
public class DivisibleBy4_5 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 5 numbers.");

		int[]numbers=new int[5];

		for(int i=0; i<numbers.length; i++){

			numbers[i]=scanner.nextInt();
		}

		for(int i=0; i<numbers.length; i++){

			if(numbers[i]%4==0 && numbers[i]%5==0 &&numbers[i]>10){

				System.out.println(numbers[i]);
			}
		}
	}
}
