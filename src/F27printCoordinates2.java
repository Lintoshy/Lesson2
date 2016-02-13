
public class F27printCoordinates2 {

	public static void main(String[] args) {

		printCoordinates ("i", "9");
		printCoordinates ("b", "2");
		
		printCoordinates ("a", "1");
		printCoordinates ("a", "2");
		
		printCoordinates ("h", "2");
		printCoordinates ("b", "3");

	}
	static void printCoordinates (String v, String h){
		String parameters = getQuadrant (v,h);

			System.out.print(v + h +":(");
			System.out.print (parameters.substring(0, parameters.indexOf("_"))+"px,");
			System.out.println (parameters.substring(parameters.indexOf("_") + 1) +"px)");	
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
