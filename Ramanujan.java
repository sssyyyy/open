import java.util.Scanner;

public class Ramanujan {

	public static void main(String[] args) {
		System.out.print("계산 횟수를 입력하시오: ");
		double pi=0.0;
		int num=0;
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		while(num<n)
		{
			double mol=fact(4*num)*(1103+26390*num);
			double den=Math.pow(fact(num), 4)*Math.pow(396, 4*num);
			pi=pi+mol/den;
			num++;
		}
		System.out.println("답: " + 1/((Math.sqrt(8)/9801)*pi));

	}
	
	public static int fact(int n)
	{
		int p=1;
		for(int i=1;i<=n;i++)
			p=p*i;
		return p;
	}

}
