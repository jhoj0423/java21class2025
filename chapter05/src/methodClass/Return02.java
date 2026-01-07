package methodClass;

public class Return02 {
	public int test(int[] arr) {
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 4 ==0) {
				cnt++;
			}
		}
		//4의 배수의 갯수
		return cnt;
	}
	
	public static void main(String[] args) {
		Return02 r = new Return02();
		int[] arr02 = {1,54,135,41,21,28,40};
		r.test(arr02);
		System.out.println(r.test(arr02));
	}
}
