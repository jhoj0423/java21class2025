package capitalGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	HashMap<String, String> cu = new HashMap<String, String>();
	Random ran = new Random();
	int num;
    //디폴트 생성자 => JVM이 저장하고 컴파일하면 제일먼저 로드하는것
    public Game() {
    	AddCity();
    	num=cu.size() + 1;
    };
    
    //수도 추가
    public void AddCity() {
    	cu.put("한국", "서울");
		cu.put("미국", "워싱턴DC");
		cu.put("중국", "베이징");
		cu.put("일본", "도쿄");
		cu.put("프랑스", "파리");
		cu.put("러시아", "모스크바");
		cu.put("그리스", "아테네");
		cu.put("이탈리아", "로마");
    };
    
    //게임 시작
    public void PlayGame() {
    	boolean run = true;
    	
    	System.out.println("수도 맞추기 게임을 시작합니다.");
    	while(run) {
    		System.out.println("입력: 1, 퀴즈: 2 , 종료 : 3 >>");
    		int Sel = scan.nextInt();
			if(Sel==1) {
				intsert();
			}else if(Sel==2) {
				Start();
			}else if(Sel==3) {
				System.out.println("게임을 종료합니다");
				run = false;
				break;
			}else {
				System.out.println("[1~3] 번의 메뉴 중 선택해주세요");
			}
    	}
    };
    
    // 나라입력
    public void intsert() {
    	System.out.println("현재"+cu.size()+"개 나라의 수도가 입력되어 있습니다.");
		while(true) {
    		System.out.print("나라와 수도 입력"+num+">>");
    		//scan.nextInt()의 이슈인 \n 이 남는 상황을 제거해야한다.
    		//scan.nextLine(); // 이전 입력 버퍼정리 됨
			String answer = scan2.nextLine();
			
			if(answer.equals("그만")) {break;}
			
			StringTokenizer st = new StringTokenizer(answer);
			String c= st.nextToken().trim();
			String t= st.nextToken().trim();
			if(cu.containsKey(c)){
				System.out.println(c+"는 이미 입력되었습니다");
			}else {
				cu.put(c , t);
				num++;
			}
    	}
    }
    
    // 게임시작
    public void Start() {
    	//ArrayList<>의 매개변수로 hashCapital.keySet()의 나라를 사용
    	ArrayList<String> nations = new ArrayList<>(cu.keySet());
    	//[한국,중국, 일본]
    	while(true) {
    		
    		System.out.println(cu.keySet());
    		//랜덤하게 나라이름 이 출력되는 문제를 만든다.
    		int index = ran.nextInt(cu.size());
    		//nations.get(index) => get()은 ArayList 메소드로 추가
    		String qusetion = nations.get(index);
    		// key값이 qusetion인 value 값을 출력
    		String answer = cu.get(qusetion);
    		
    		System.out.println(qusetion + "의 수도는 >>");
    		String myAnswer = scan.next();
    		
    		if(myAnswer.equals("그만")) {
    			break;
    		}else if(answer.equals(myAnswer)) {
    			System.out.println("정답");
    			continue;
    		}else {
    			System.err.println("오답");
    		}
    	}
    	
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
