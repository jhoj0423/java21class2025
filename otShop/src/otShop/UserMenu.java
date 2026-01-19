package otShop;

import java.util.Scanner;

public class UserMenu extends User{
	//상속받은 User의 클래스 멤버변수, 생성자, 메소드 접근 가능
	//인스터스안해도 접근 가능
	Scanner scan = new Scanner(System.in);
	int cnt = id.length; //전체 유저 수
	static int logindex; //로그인한 유저 인덱스(다른 클래스와 공유)
	
	//사용자 로그인 메소드
	public int UserLog() {
		int log = super.log; // 부모인User클래스의 로그인 상태 사용
		System.out.println("ID입력");
		String myId = scan.next();
		System.out.println("PW입력");
		String myPw = scan.next();
		
		//id, pw로그인 성공과 실패를 작성
		for(int i=0;i<cnt;i++) {
			if(myId.equals(id[i]) && myPw.equals(pw[i])) {
				log=i; // 로그인 성공 -> 해당 index저장
				
			}
		}
		
		//if문으로 비교
		if(log<0){
			System.out.println("아이디와 비밀번호를 확인해 주세요");
		}else if(log==0) {
			System.out.println("당신은 관리자");
		}else {
			System.out.printf("%s님 환영합니다.",id[log]);
			logindex = log; //다른 클래스에서 사용하기위해 공유하는것 
		}
		
		return log;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
