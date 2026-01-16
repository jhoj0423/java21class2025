package capitalGame;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	HashMap<String, String> cu = new HashMap<String, String>();
    private String country;
    private String city;
    
    //디폴트 생성자
//    public Game() {
//    	
//    };
    //멤버 생성사
    public Game(String country,String city) {
    	this.country = country;
    	this.city=city;
    }
    
    //수도 추가
    public void AddCity() {
    	
    };
    
    //게임 시작
    public void PlayGame() {
    	
    };
    
	
	
}
