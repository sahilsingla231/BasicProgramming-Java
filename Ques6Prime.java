import java.util.Scanner;

public class Ques6Prime {

public static void main(String[] args) {
		
		int N,i,count=0;
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter Number");
		N=sl.nextInt();
		for(i=1;i<=N;i++)
		{
			if(N % i == 0)
			{
				count++;
			}
		}
		
	
		if(count == 2)
			System.out.println(N+" is Prime");
		else
			System.out.println(N+" is NOT Prime");
		sl.close();
		
	}
}
