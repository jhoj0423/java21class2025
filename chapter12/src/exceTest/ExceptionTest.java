package exceTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		//Exception 및 하위 클래스를 이영해서 예외 처리를 다양하게 할 수 있다.
		Scanner scan = new Scanner(System.in);
		int i=0;
		int j=0;
		//자료구조 => 선형(자료를 길게 저장)
		int[] iarr=new int[5];
		// ArrayList<> 는 List<> 하위클래스이다
		// 고로 List<.로 업캐스팅 할 수 있다.
		//자료구조 => 선형자료구조
		List<Integer> list = new ArrayList<Integer>();
		
		//try{}catch(){}catch(){}...finally(){}
		try {
			// 실행구문
			System.out.println("input i:");
			i = scan.nextInt();
			System.out.println("input j:");
			j = scan.nextInt();
			System.out.println("(i/j)"+(i/j));
			
			for(int k=0;k<6;k++) {
				System.out.println("iarr["+k+"]"+iarr[k]);
			}
			System.out.println("List size :" + list.size());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.err.println(e.getMessage());
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(Exception e) {
			// Exception 최상위 클래스로 catch()가 하나일때는 사용가능
			// 단, catch()구문이 여러개일 때 Exception 맨 앞ㄴ에 catch
			//실행구문 오류가 있을때 catch()로 넘겨라
			e.printStackTrace();
			System.out.println("숫자를 입력하세요");
		}finally {
			System.out.println("end");
		}
		
		

	}

}
