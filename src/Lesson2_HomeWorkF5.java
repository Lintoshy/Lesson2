
public class Lesson2_HomeWorkF5 {

	public static void main(String[] args) {
		printNumbers(3,45);
	}
	static void printNumbers (int i, int n) {
		while (i < n) {
			n++;
			i += 4;
			System.out.println(n);
		}
	}
}
