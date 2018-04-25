package Armstrong;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[]args){


		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<9999;i++){
			
			Check(i);
			
		}
		
	}
	
	public static void Check(int n){
		int x1,x,d,sum=0;
		x=n;
			x1=x;
			while(x>0)
			{
				d=x% 10;
				sum= sum+(d*d*d);
				x=x/10;
				
			}

			if(x1==sum)
			{
				System.out.println(x1);
			}
		
	}
}