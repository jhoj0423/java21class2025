package example;

import java.util.Arrays;

public class Arrtest {

	public static void main(String[] args) {
		// 배열 선언 방법
		//1. int[] arr = new int[3] (정석)
		//2. int arr[] = new int[3]
		//선언한 배열에 초기값 지정하는 방식
		//1. int[] arr01 = new int[]{1,2,3};
		//1. int[] arr01 = new int[3]{1,2,3};=>오류출력
		//								이유: 배열에 초기값 지정시 크기는 적지 않는다
		//3.int[] arr01{1,2,3};
		//배열 선언 시 int[] arr = new int []=>어루,반드시 크기 입력
		//배열의 특징
		//1.배열은 고정길이이다
		//2.배열은 자동으로 길이를 늘리고, 줄일 수 없다 -> 삭제 불가.
		//3.배열은 생성과 동시에 메모리를 한 번에 할당한다.-> 수정 불가.
		//4.배열은 중간에 값을 비워둘 수 없다.
		//5.배열은 단순한 자료구조 이므로 가변 기능은 컬렉션이 담당한다.
		//	예) ArrayList, Linkedlist, Vector,stack...
		
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			//정수형 배열에 초기값을 입력하지 않으면 0 출력
			System.out.println(arr[i]);
		}
		
		double[] dub = new double[3];
		for(int j=0;j<dub.length;j++) {
			//ㅣ실수형 배열의 초기값을 지정하지 않으면 값은 0.0출력
			System.out.println(dub[j]);
		}
		
		String[] str = new String[3];
		String[] str02 = null;
		String[] str03 = null;
		//배열의 길이 : 3
		System.out.println(str.length);
		//배열의 요소 값 : [null, null, null]
		System.out.println(Arrays.toString(str));
		//배열의 레퍼런스 : [Ljava.lang.String;@17211155
		System.out.println(str);
		//객체 배열의 요소를 복사 : Arrays.copyOf()
		str02 = Arrays.copyOf(str, str.length);
		
		System.out.println(str02);
		str03 = str; // 복사가 아니라 str과 같은 배열을 대입한 경우임
		System.out.println(str03);
		
		
		
		for(int k=0;k<str.length;k++) {
			//str이 null이면 '난 배열값'으로 출력하고, null이 아니면 본인 자기자신 값 출력
			//원래 String객체는 비교할 때 equals()사용해야 하지만
			//문제는 null이 객체가 아니므로 메서드 사용 못함
//			if(str[k].equals(null)) {
//				System.out.println("난 배열값");
//			}else {
//				System.out.println(str[k]);
//			}
			System.out.println(str[k]);
			String result = (str[k]==null?"난 배열 값":str[k]);
			System.out.println(result);
		}
	}

}
