package practiceonly;


class method2{
void login()
 {
	System.out.println("login to amazon phone "); 
 }
}
public class polimorisham extends method2 
{
void login()
	{
		System.out.println("login to amazon email");
	}

public static void main(String[] args) {
	polimorisham m1=new polimorisham();
	m1.login();
	//method2 m2=new method2();
	//m2.login();
	// so here parent class clas suppress by child class this is overriding
	//so we can use super this keywords
}
}
