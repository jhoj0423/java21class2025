package queInterface;

//shelf가 Queue를 implements
//BookShelf가 Shelf extends 받을 예정
//실무에서 많이 쓰는 방법
public class BookShelf extends Shelf implements Queue{

	@Override
	public void inQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// 꺼내기 => 삭제
		
		return shelf.remove(0); // 제일 첫 번째 자료를 삭제
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
