import java.util.Scanner;

public class Ques4Biggest {

	public static void main(String[] args) {
		

		int a,b,c;
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=sl.nextInt();
		b=sl.nextInt();
		c=sl.nextInt();
		sl.close();
		if(a>b && a>c)
			System.out.println("Greatest number is "+ a);
			else if(b>a && b>c)
				System.out.println("Greatest number is "+ b);
				else
					System.out.println("Greatest number is "+ c);

	}

}
