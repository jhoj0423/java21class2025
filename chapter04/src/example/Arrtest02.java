package example;

public class Arrtest02 {

	public static void main(String[] args) {
		// 
		double[] data = new double[5];
		int size = 0; 
		data[0]=10.0;size++;
		data[1]=20.0;size++;
		data[2]=30.0;size++;
		int total = 1;
		//double[] data = {10.0, 20.0, 30.0, 0.0, 0.0}
		
		for(int i=0;i<size;i++) {
//			total*= data[i];
//			System.out.println(data[i]);
//			if(data[i]!=0.0) {
//				total*=data[i];
//			}
			total*= data[i];
			System.out.println(size);
		}
		System.out.println(total);
		System.out.println(data[0]);
	}

}
