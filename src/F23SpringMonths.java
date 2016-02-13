
public class F23SpringMonths {

	public static void main(String[] args) {
		System.out.println(isSpring(16));
		System.out.println(isSpring(12));
		System.out.println(isSpring(4));
		System.out.println(isSpring(7));
		System.out.println(isSpring(-1));
	}
	
	static int isSpring (int month){
		 
		if (month <=5 && month >= 3) {
			return 1;	
		}
		if (month >= 1 && month < 3 || month > 5 && month <= 12){
			return 0;
		} 
		return -1;
	}
}
