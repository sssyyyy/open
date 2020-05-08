import java.util.Scanner;

public class Euler {

	public static void main(String[] args) {
		System.out.print("계산 횟수를 입력하시오: ");
		double pi=0.0;
		int num=1;
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		while(num<n)
		{
			pi+=1.0/Math.pow(num, 2);
			num+=1;
		}
		
		System.out.println("답: "+Math.sqrt((6*pi)));

	}

}
