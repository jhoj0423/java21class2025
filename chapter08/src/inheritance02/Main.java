package inheritance02;

public class Main {

	public static void main(String[] args) {
		ColorTV c = new ColorTV(32,1024);
		c.printPropetry();
		
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printPropetry();
	}

}
