package practiceonly;

import java.util.Arrays;

public class test {
public static void main(String[] args) {
	

	   
	        String name = "";
	       // System.out.println(name.repeat(10));
	        
	        String s1 = "i have a boy";
	        String[] a1 = s1.split(" ");
	        System.out.println(Arrays.toString(a1));
	        
	        String s2 = "i have a boy";
	        String[] a3 = s2.split(" ", 3);
	        System.out.println(Arrays.toString(a3)); // Missing parenthesis added here
	    }
	

}

