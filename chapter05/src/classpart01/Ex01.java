package classpart01;

public class Ex01 {
	//멤버변수는 배열도 작성할 수 있다.
	//클래스는 데이터, 기능만 작성
	//main()메소드는 출력을 담당
	int[] arr = {87,100,11,72,92};
	
//	public Ex01() {}
//	public Ex01(int arr) {
//		arr = arr;
//	}
//	public void showtotal() {
//		int sum =0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		System.out.println("총합 : " + sum);
//	}
	
	
	public static void main(String[] agrs) {
		// 문제 1) 전체 합 출력
		// 문제 1) 362
		Ex01 sum = new Ex01();
//		sum.showtotal();
		
		int tot = 0;
		for(int i=0;i<sum.arr.length;i++) {
			tot+=sum.arr[i];
		}
		System.out.println("총합 : " + tot);
		
		
	}
	
}
