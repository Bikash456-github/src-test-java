package practiceonly;

import java.util.Scanner;

public class Arraycheck {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner Scanner=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	
	int size = 0;
	int[] array=new int[size];
	
System.out.println("Enter the element of the arrray:");
	for (int i=0;i< size; i++);{
		@SuppressWarnings("unused")
		int i;
		//array[i]=Scanner.nextInt();
	}
	System.out.println("enter the number to check");
	int notocheck=Scanner.nextInt();
	boolean found=false;
	for(int i=0;i<size;i++) {
		if (array[i]==notocheck) {
			found=true;
			break;
		}
	}
	if (found) {
		System.out.println("the given number "+notocheck+"is part of the array" );
	}else {
		System.out.println("the given number"+notocheck + "is not part of array");
	}
	
}
}
