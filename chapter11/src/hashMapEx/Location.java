package hashMapEx;

public class Location {
	private String country;
	private int st;
	private int g;
	
	public Location () {
		
	}
	public Location (String country,String st,String g) {
		this.country = country;
		this.st = Integer.parseInt(st);
		this.g = Integer.parseInt(g);
	}
	
	public String weg() {
		return country+" "+st+" "+g;
	}
	
	public void showPrint() {
		System.out.println(country+" "+st+" "+g);
	}
	@Override
	public String toString() {
		return country+" "+st+" "+g;
	}
//	public void showPrint() {
//		System.out.println(country+" "+st+" "+g);
//	}
}
