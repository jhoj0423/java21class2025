package example;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] arr01 = new int[] {10,20,30,40,50}; // = int[] arr ={10,20,30,40,50};
		int sum =0;
//		for(int i=0;i<arr01.length;i++) {
//			System.out.print(arr01[i] + " ");
//			
//		}
		System.out.println();
		System.out.println(Arrays.toString(arr01));
		for(int i=0;i<arr01.length;i++) {
			if(arr01[i]%4==0) {
				System.out.print(arr01[i] + " ");
				
			}
		}
		
		
		System.out.println();
		for(int i=0;i<arr01.length;i++) {
			if(arr01[i]%4==0) {
				sum += arr01[i];	
			}
		}
		System.out.print(sum + " ");
		System.out.println();

		int num = 0;
		for(int i=0;i<arr01.length;i++) {
			if(arr01[i]%4==0) {
				num++;
			}
		}
		System.out.print(num);
		System.out.println();
		int num2 = 0;
		for(int i=0;i<arr01.length;i++) {
			if(arr01[i]%2==0) {
				num2++;
			}
		}
		System.out.print(num2);
		System.out.println();

	}

}
