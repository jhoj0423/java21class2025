package interfaceExample02;

public class UserMain {

	public static void main(String[] args) {
		Animal ca = new Cat();
		Animal ch = new Chicken();
		Animal mo = new Monkey();
		
		Animal[] print = {ca,mo,ch};
		String[] bab = {"생선","과일","사료"};
		String[] move = {"네발로","네발 또는 두발로","두발로"};
		String[] zzz = {"엎드려서","누워서","서서"};
		
		for(int i=0;i<print.length;i++) {
			print[i].eat(bab[i]);
		}
		System.out.println();
		for(int i=0;i<print.length;i++) {
			print[i].work(move[i]);
		}
		System.out.println();
		for(int i=0;i<print.length;i++) {
			print[i].sleep(zzz[i]);
		}

	}

}
