import java.util.Scanner;

public class Ques2Year {

	public static void main(String[] args) {
	
		int year;
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter year");
		year=sl.nextInt();
		if((year%4 ==0 && year% 100!=0) || year%400==0)	
		System.out.println(year+" is Leap year");
		else
			System.out.println(year+" is not Leap year");
				sl.close();

	}

}
