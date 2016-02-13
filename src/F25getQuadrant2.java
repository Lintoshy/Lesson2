
public class F25getQuadrant2 {

	public static void main(String[] args) {

        System.out.println(getQuadrant("a","2"));
        System.out.println(getQuadrant("a","1"));
		System.out.println(getQuadrant("b","1"));
		
		System.out.println(getQuadrant("d","5"));
		System.out.println(getQuadrant("c","8"));
		System.out.println(getQuadrant("h","9"));
		
		System.out.println(getQuadrant("i","9"));
		System.out.println(getQuadrant("g","3"));
		System.out.println(getQuadrant("e","7"));

	}
	/*
	 * - TANKS -
	 */
	static String getQuadrant(String v, String h){
		
		String tire = "_";
		int y = 0;
		int x = 0;
		
	if (v == "b"){
		y = 1;	
	}else if (v == "c"){
		y = 2;	
	}else if (v == "d"){
		y = 3;	
	}else if (v == "e"){
		y = 4;	
	}else if (v == "f"){
		y = 5;	
	}else if (v == "g"){
		y = 6;	
	}else if (v == "h"){
		y = 7;	
	}else if (v == "i"){
		y = 8;	
	}

	if (h == "2"){
		x = 1;	
	}else if (h == "3"){
		x = 2;	
	}else if (h == "4"){
		x = 3;	
	}else if (h == "5"){
		x = 4;	
	}else if (h == "6"){
		x = 5;	
	}else if (h == "7"){
		x = 6;	
	}else if (h == "8"){
		x = 7;	
	}else if (h == "9"){
		x = 8;	
	}
	return (y * 64) + tire + (x * 64);

	}

}
