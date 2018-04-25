package SumOfArrays;
import java.util.Scanner;
public class SumOfArrays {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 10 numbers");

		int sum=0;
		int[] numbers=new int[10];

		for(int i=0; i<numbers.length; i++){

			numbers[i]=scanner.nextInt();
		}

		for(int i=0; i<numbers.length; i++){

			sum=numbers[i]+sum;
		}
		System.out.println(sum);
	}
}
