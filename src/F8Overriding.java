
public class F8Overriding {

	public static void main(String[] args) {
		square (3);
		square (3.0);

	}
	static double square (double number){
		System.out.println(number * number);
		return number;
	}
	static int square (int number){
		System.out.println(number * number);
		return number;
	}

}
