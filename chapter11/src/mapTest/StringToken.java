package mapTest;

import java.util.StringTokenizer;

public class StringToken{

	public static void main(String[] args) {
		// StringTokenizer 생성방법 3가지
		String str = "Java android";
		String str1 = "Java!android";
		String str2 = "Java!and*roid-fun";
		
		StringTokenizer st1 = new StringTokenizer(str);
		
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		System.out.println("----------------------------");
		StringTokenizer st2 = new StringTokenizer(str1,"!");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
		System.out.println("----------------------------");
		StringTokenizer st3 = new StringTokenizer(str2,"-*",true);
		
		System.out.println(st3.nextToken());
		System.out.println(st3.nextToken());
		System.out.println(st3.nextToken());
		System.out.println(st3.nextToken());
		
		System.out.println("----------------------------");
		StringTokenizer st4 = new StringTokenizer(str1,"!",true);
		
		System.out.println(st4.nextToken());
		System.out.println(st4.nextToken());
		System.out.println(st4.nextToken());
		System.out.println("----------------------------");

	}

}
