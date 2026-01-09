package arrayListTest;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
		// ArrayList<E> 참조변수 = new ArrayList<>();
		//<E> 부분을 제네릭(Generic)라 부르며
		//<E>부분엔 반드시 데이터 타입이 클래스로 작성되어야 한다.
		//ArrayList<>는 가변길이 클래스 배열이다.
		//데이터가 삭제되거나,추가되면 자동으로 크기(배열의 길이) 증감한다.
		//ArrayList<>에서 데이터 추가 메서드는 add(인덱스번호, 값), add(갑)
		//단, add(값)은 항상 맨 마지막 위치에 추가된다.
		//단, add(인덱스번호, 값)은 인덱스번호 위치에 값이 추가되는데 이경우 뒤의 모든데이터 뒤로 밀림
		//ArrayList<>에서 데이터 삭제 메서드는 remove(인덱스 번호)
		//단, 삭제시 뒤의 데이터들은 앞으로 이동한다.
		//ArrayList<>에서 데이터를 추출하는 메서드는 get(인덱스번
		//ArrayList<>에서 배열의 길이를 추출하는 메서드는 size()이다.
		//ArrayList<>에서 요소가 비어있는지 확인하는 매서드는 isEmpty()이다.
		//isEmpty()는 비어있으면 true,아니면 false를 반환한다.
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		//ArrayList<E>의 <E>부분에 더에터 타입이 클래스 이어야하므로
		//기본 데이터 타입인 int를 사용할수 없다
		//그러므로 정수형 클래스 데이터 타입인 Integer 래퍼클래스를 입력한다.
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(20);
		num.add(40);
		
		System.out.println(list.isEmpty());
		
		list.add("원숭이");
		list.add("사과");
		list.add(1,"엉덩이");
		list.add(1,"빨개");
		// list2의 요소를 list로 통째로 추가하고 싶을때
		// addAll을 사용한다.
		list2.add("바나나");
		list2.add("길어");
		list2.add("기차");
		
		list.addAll(list2);
		
		//전체 출력
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//데이터 삭제
		list.remove(5);
		
		//확장 for문으로 출력
		//for(자료형 변수이름 작명 : 참조변수)
		for(String li :list)System.out.println(li);
		for(Integer Number :num)System.out.println(Number);
		
		//----------------------------
		
		//내가 만든 클래스를 ArrayList<>의 데이터 타입으로 사용
		ArrayList<Member> meminfo = new ArrayList<Member>();
		
		// main()메서드에서 생성할때 입력한 매개변수의 값이
		//this.name = "홍길동" ...
		meminfo.add(new Member("홍길동","한양",21));
		meminfo.add(new Member("개나리","북구",17));
		
		for(Member nam : meminfo) {
			nam.printmember();
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
