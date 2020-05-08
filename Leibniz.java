import java.util.Scanner;

public class Leibniz {
public static void main(String[] args) {
		
		System.out.print("계산 횟수를 입력하시오: ");
		double pi=0.0;
		int sign=1;
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<2*n;i+=2)
		{
			pi+=(double)sign/i;
			sign=-sign;
		}
		System.out.print("답: "+4*pi);
	}

}
