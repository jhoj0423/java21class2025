package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapTest01 {

	public static void main(String[] args) {
		// Map<key,value> : 자바의 collection의 프레임워크 일종이다
		// Map의 특장은 반드시 key(키),value(값)의 쌍으로 이루어져야 한다.
		// Key(키)는 중복을 허용하지 않는다.
		// value(값)은 중복을 허용한다.
		// Map은 Key(키)를 이용하여 value(값)을 저장 하거나,
		// 검색, 삭제할 때 사용하면 유용하다.
		// Map의 종류 : HashMap, Hashtable, TreeMap, Properties...
		// Map 인터페이스 메소드 : put[키, 값] => 키와 값을 입력하는 메소드 이다.
		// Map은 반드시 import해야 한다.
		// Map<K,V> => <> 재네릭이라고 한다.
		// Map<K,V> => K는 반드시 래퍼클래스(String, Intger, Double..)
		//          => 또는 개발한 클래스 예)Member, Product, Cart...
		// HashMap은 Map의 하위 클래스 이므로 데이터 타입을 부모인 Map로 업케스팅 할 수 있다.
		Map<String, String> list = new HashMap<String, String>();
		//생성한 객체의 list를 부르는 말 "참조변수"라 한다.
		//HashMap<String, String> list2 = new HashMap<String, String>();
		//Map<String, String> list3 = new Map<String, String>(); 
		//--> Map은 interface 이므로 객체를 생성할 수 없다.
		// 고로, 아래 객체생성은 오류이다.
		// Map<String, String> list03 = new Map<String,String>();
		
		String[] key = {"a","b","c","d","e"};
		String[] value = {"apple","banana","candy","dog","egg"};
		
		//list.put(key[i], value[i]);  메소드 작성방법
		for(int i=0;i<key.length;i++) {
			//list 참조변수에 put()메소드 사용 가능한이유
			//=> HasjMap객체를 생성하고 데이터 타입은 Map이기때문에
			//=> Map인터페이스의 메소드에 모두 접근할 수 있다.
			list.put(key[i], value[i]); 
		}
		
		// HashMap은 순서를 보장하지 않는다.
		//고로, 입력도 순서가 없고, 저장도 순서가 없다.
		// HashMap은 헤시테이블에 저장된다.
		// HashMap은 비선형자료구조이다
		System.out.println(list);
		
		//KeySet() 은 Key값을 출력, Values()메소드는 value갑을 출력 사용방법
		System.out.println("-----------------");
		System.out.println(list.keySet());
		System.out.println(list.values());
		
		
		// get(현재 출력하고 싶은 키값을 입력) 메소드
		System.out.println("-----------------");
		// list.get("c") => key 값이 "c"에 해당하는 value값인 candy 출력
		System.out.println(list.get("c"));
		System.out.println(list.get("apple"));
		System.out.println(list.get(list.keySet()));
		
		// replace() : 키 값과 바꿀 값을 제공하면 해당 키의 값이 변경
		System.out.println("-----------------");
		list.replace("c", "code");
		System.out.println(list.get("c"));
		
		
		System.out.println("-----------------");
		// 이미 존재하는 같은 key에 해당하는 value를 새로운 값으로 덮어씀
		list.put("c", "candy");
		System.out.println(list.get("c"));
		
		//f, float 추가
		list.put("f", "foalt");
		System.out.println(list);
		
		// containsKey(), containsValue() :
		// => Key 나 Value의 존재유무 => 결과는 true/false
		System.out.println("-----------------");
		boolean isChk;
		boolean isChkV;
		isChk = list.containsKey("X");
		System.out.println(isChk);
		isChkV = list.containsValue("candy");
		System.out.println(isChkV);
		
		// remove(), clear() => remove(제공한 key): 제공한 키 값의 항목만 삭제
		// clear() => 전체 삭제
		
		System.out.println("-----------------");
		list.remove("c");
		System.out.println(list);
		
		list.clear(); // 모두 삭제
		System.out.println(list);
		
		for(int i=0;i<key.length;i++) {
			list.put(key[i], value[i]); 
		}
		
		System.out.println("---- 확장 for문 이용 출력 ----");
		for(String m : list.keySet()) {
			System.out.println(m+":"+list.get(m));
		}

		System.out.println("---- Iterator() 메소드 ----");
		// collection 또는 Map에서 사용하는 객체 순회 메소드
		Set<String> Keyset = list.keySet();
		//Iterator<E>
		Iterator<String> ir = Keyset.iterator();
//		Iterator<String> ir = Keyset.iterator();
		
		while(ir.hasNext()) {
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k+": "+v);
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
