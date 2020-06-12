package wow;

import java.lang.*;

public class hello {
    public static void main(String[] args) {
		//String str = new String(" I love 6¹Ý ");
		//System.out.println(str.charAt(3));
		//String str2=new String("I love Sunrin");
		//System.out.println(str.equals(str2));
		//System.out.println(str.length());
//		String a = String.valueOf(3);
//		String b = String.valueOf(5);
//		System.out.println(a+b);
		//System.out.println(str.trim());
//	    System.out.println(str.substring(3));
//	    System.out.println(str.substring(3,4)); //start ~ end-1
    	StringBuffer sb1 = new StringBuffer("Java");
    	System.out.println(sb1.append(" programming"));
    	System.out.println(sb1.replace(5, 16, "loves you"));
    	System.out.println(sb1.reverse());
    	System.out.println(sb1.toString());
    	System.out.println(sb1);
	}
}
