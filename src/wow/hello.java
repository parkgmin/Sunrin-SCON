package wow;

import java.lang.*;

public class hello {
    public static void main(String[] args) {
		//String str = new String(" I love 6�� ");
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
//    	StringBuffer sb1 = new StringBuffer("Java");
//    	System.out.println(sb1.append(" programming"));
//    	System.out.println(sb1.replace(5, 16, "loves you"));
//    	System.out.println(sb1.reverse());
//    	System.out.println(sb1.toString());
//    	System.out.println(sb1);
    	//String s1 = "Java Programming";
//    	int i1=100;
//    	char c1='A';
//    	double d1=1.1;
//    	String str="10";
//    	
//    	Integer wi1=300;
//    	
//    	Double wd1=3.3;
//    	System.out.println();
//    	
//    	System.out.println("toString:�⺻ ��������->String");
//    	String st1=Integer.toString(i1);
//    	String st2=Double.toString(d1);
//    	System.out.println(i1+d1);
//    	System.out.println(st1+st2+"\n");
//    	
//    	System.out.println(wi1.toString());
//    	System.out.println(wd1.toString());
//    	
//    	int i2=Integer.parseInt(str);
//    	float f2=Float.parseFloat(str);
//    	System.out.println("i1+i2 = " + (i1+i2));
//    	System.out.println("i1+f2 = " + (i1+f2));
//    	System.out.println();
    	
//    	System.out.println("valueof:String->Wrapper");
//    	Integer i3 = Integer.valueOf(str);
//    	System.out.println("10+i3 ="+(10+i3));
//    	System.out.println("20+Dobule.valueof(str) ="+(20+Dobule.valueof(str));
//    	System.out.println();
    	
//    	System.out.println("-Value:Wrapper->�⺻��������");
//    	int i4 = wi1.intValue();
//    	System.out.println("int �� i4 =" + i4);
    	
    	String s1 = " Java Programming";
        String s2 = "";
        System.out.println("s1�� ��� : " + s1);
        System.out.println("S1�� ���� : " + s1.length());
        s2 = s1.trim();
        System.out.println("s1���� ������ �����Ͽ� s2�� ���� : " + s2);
        System.out.println("s2�� ���� : " + s2.length());
        System.out.println("s2���� ���� o�� ��ġ : "+ s2.indexOf('o'));
        System.out.println("s2���� ���� a�� A�� ��ȯ : " + s2.replace("a","A"));
        System.out.println("s2���� Java�� c++�� ��ȯ : " + s2.replace("Java", "C++"));
        System.out.println("s2���� Program �ܾ� ���� ���� : " + s2.contains("Program"));
        System.out.println("s2���� 0~4���� ������ ���� ��� : " + s2.substring(0, 5));
        System.out.println("s2�� ��� �빮�ڷ� ��ȯ : " + s2.toUpperCase());
        System.out.println("s2�� ��� : " + s2);
    	
	}
}
