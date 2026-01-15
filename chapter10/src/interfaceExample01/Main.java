package interfaceExample01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyable t = new Television("TV-samsung","MV-2020", 509000);
		Buyable r = new Refrigerator("1등급","MV-2020", 2000000);
				
		System.out.println("--- 텔레비젼 정보 ---");
		System.out.printf("메이커 : %s%n모델명 : %s%n금액 : %d%n",t.getMaker(),t.getModel(),t.getPrice());
		System.out.println("--- 냉장고 정보 ---");
		System.out.printf("효율성 등급 : %s%n모델명 : %s%n금액 : %d%n",r.getMaker(),r.getModel(),r.getPrice());
		System.out.println("------------------");
	}

}
