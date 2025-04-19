package practiceonly;

public class pracctice {
public static void main(String[] args) {
	int count_of_alphabet=0;
	int count_of_numeric=0;
	int count_of_space=0;
	int count_of_specialchar=0;
	int Count_of_Uppercase=0;
	String a="ManishKumaR7474847 48";
	char[]c1=    a.toCharArray();
			for (int i=0;i<a.length();i++)
			{
				boolean b1=Character.isLetter(c1[i]);
				if(b1==true)
				{
					count_of_alphabet++;
				}			
			}
	System.out.println("the number of alphabet are:-"+count_of_alphabet);
	
	for(int i=0;i<a.length();i++)
	{
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			count_of_numeric++;
		}
	}
	System.out.println("the number of numeric are:-"+count_of_numeric);
	
	for (int i=0;i < a.length(); i++) 
	{
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			count_of_space++;	
		}
		}
	System.out.println("the number of space are:"+count_of_space);
	
for (int i=0;i < a.length(); i++) 
{
	
	boolean  b4=(Character.isUpperCase(a.charAt(i)));
	if(b4==true)
	{
		Count_of_Uppercase++;	
	}
	}
System.out.println("the number of uppercase are:"+Count_of_Uppercase);

for (int i=0;i < a.length(); i++) 
{
	char ch = a.charAt(i);
	boolean  b5=(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) ;
	if(b5==true)
	{
		count_of_specialchar++;	  
	}
}
System.out.println("the number of uppercase are:"+count_of_specialchar);
}


    }
	


