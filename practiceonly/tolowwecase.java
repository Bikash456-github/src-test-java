package practiceonly;

public class tolowwecase {public static void main(String[] args) {
	String m1="BiKAsh";
	
	int lower=0;
	int upper=0;
	
	
	for (int i=0;i<m1.length();i++)
	{
	char ch=m1.charAt(i);
	if(ch>=65 && ch<=90)
	{	
	upper++;
	}	
	else
	{
		lower++;
	}
}
System.out.println("lower"+lower);
System.out.println("upper"+upper);
}
}
