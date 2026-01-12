package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleEx {

	public static void main(String[] args) throws ParseException {
		// SimpleDateFormat 클래스는 날짜를 특정 형식의 문자영로
		// 출력하거나 문자열로 변환할 때 사용한다.
		// 출력할때 : SimpleDateFormat.format()
		// 변경할때 : SimplseDateFormat.parse()
		// SimpleDateFormat 클래스도 new 예약어로 객체 생성한다.
		// SimpleDateFormat.format("yyyy-mm-dd")=>따옴표 안에 변경할 날짜 형식 입력
		
		Scanner scan = new Scanner(System.in);
		
		// 현재 날짜/시간 객체
		// 타입이 Date인 객체를 생성
		Date now = new Date();
		// 날짜포멧
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일(E)");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss a");
		
		System.out.println(now);
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
		
		// SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd(E)");출력이 아니라
		//입력 형식이므로 Unparseavle date: "2026-02-03" 오류로 파싱할 수 없다.
		// sdf1.parse("2026-02-03") => 날짜를 문자열 형식으로 입력한 것이다.
		// sdf4.format(sdf1.parse("2026-02-03"))=>sdf4형식으로 출력한 것이다.
		System.out.println(sdf3.format(sdf1.parse("2026-02-03")));
		
		
	}

}
