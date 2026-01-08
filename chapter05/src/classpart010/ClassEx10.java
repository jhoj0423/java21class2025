package classpart010;

import java.util.Random;

public class ClassEx10 {
	
	
	
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[");
		for(int i=0;i<x.length;i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+" ");
		}System.out.print("]");
	}
	
	public int total(int[] x) {
		int sum = 0;
		for(int i=0;i<x.length;i++) {
			sum += x[i]; 
		}
		return sum;
	}
	public double avg(int[] x) {
		double sum = total(x);
		return sum/x.length;
	}
	public int first(int[] x) {
		int top = 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>top) {
				top = x[i];
			}; 
		}
		return top;
	}
	public int last(int[] x) {
		int under = first(x);
		for(int i=0;i<x.length;i++) {
			if(x[i]<under) {
				under = x[i];
			};
		}
		return under;
	}
}
