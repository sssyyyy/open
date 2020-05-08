import java.util.Scanner;

public class Wallis {

	public static void main(String[] args) {
		System.out.print("계산 횟수를 입력하시오: ");
		double pi=1.0;
		double even=2.0;
		double odd=1.0;
		int num=1;
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		while(num<n)
		{
			pi*=even/odd;
			if(num%2==1)
				odd+=2;
			else
				even+=2;
			num++;
		}
		
		System.out.println("답: "+2.0*pi);

	}

}
