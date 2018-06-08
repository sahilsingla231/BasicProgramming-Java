import java.util.Scanner;

public class Ques5Pallindrome {

	public static void main(String[] args) {
		
		int N,i,rem,sum=0;
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter Number");
		N=sl.nextInt();
		
		for(i=N;i>0;i=i/10)
		{
			rem=i%10;
			sum=sum*10 + rem;
		}
		if(N == sum)
			System.out.println(N+" is Pallindrome");
		else
			System.out.println(N+" is NOT Pallindrome");
		sl.close();
		
	}
}
