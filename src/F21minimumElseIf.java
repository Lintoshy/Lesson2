
public class F21minimumElseIf {

	public static void main(String[] args) {
		System.out.println (min (-2, 5, -3));
		System.out.println (min (7, 78, 1));
		
	}
	static int min (int a, int b, int c){
		int bingo = a;
		if (a <= c) {
			if (a <= b) {
				bingo = a;
			}
		}else if (b <= c) {	
			    bingo = b;
		
		}else if (c <= b) {
				bingo = c;
			}
		return bingo;
	}
}
