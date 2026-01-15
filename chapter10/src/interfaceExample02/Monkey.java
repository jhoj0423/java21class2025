package interfaceExample02;

public class Monkey implements Animal{
	String bab;
	String move;
	String zzz;
	
//	public Monkey(String bab,String move, String zzz) {
//		this.bab=bab;
//		this.move=move;
//		this.zzz=zzz;
//	}
	public Monkey() {
		
	}

	@Override
	public void eat(String bab) {
		System.out.println("원숭이는 "+bab+"을 먹어요");
	}

	@Override
	public void work(String move) {
		System.out.println("원숭이는 "+move+"걸어요");
	}

	@Override
	public void sleep(String zzz) {
		System.out.println("원숭이는 "+zzz+"자요");
	}
}
