package queInterface;

public interface Queue {
	//Queue는 자료 구조로 FIFO(first in first out)
	//처음에 입력한 데이터가 처음으로 출력되는 자료 구조
	void inQueue(String title); // 맨뒤로 넣기
	String deQueue(); //꺼내기
	int getSize();
}
