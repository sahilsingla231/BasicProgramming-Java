import java.util.Scanner;

public class Ques1Sum {
	
	public static void main(String args [])
	{
		int a,b,c;
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sl.nextInt();
		b=sl.nextInt();
		c=a+b;
		System.out.println("Sum is "+c);

		sl.close();
	}

}
