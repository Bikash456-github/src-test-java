package practiceonly;

import java.util.Arrays;

public class copytoarray2 
{
public static void main(String[] args) {
	int m[]=new int[4];
	                
	m[0]=20;
	m[1]=30;
	m[2]=40;
	m[3]=50;
	int m2[]=new int[4];
	for(int i=0,k=3;i<m.length;i++)
	{
	
	m2[k]=m[i];
	k--;
	}
	System.out.println(Arrays.toString(m));
	System.out.println(Arrays.toString(m2));
}
}

