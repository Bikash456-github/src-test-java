package practiceonly;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandle {
public static void main(String[] args) {

	try {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter your age");
	s1.nextInt();	
}
catch(InputMismatchException a1)
{	
System.out.println("sorry but this doesnt seems your agr,please check again");
Scanner s2=new Scanner(System.in);
System.out.println("please enter your age again");
s2.nextInt();
}
	}
}
