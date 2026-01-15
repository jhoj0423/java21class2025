package queInterface;

public class BookTest {

	public static void main(String[] args) {
		// 데이터 타입으로 업캐스팅
		Queue q = new BookShelf();
		
		//문자 삽입
		q.inQueue("A");
		q.inQueue("B");
		q.inQueue("C");
		q.inQueue("D");
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
