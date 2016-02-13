
public class Lesson2_HomeWorkF4 {

	public static void main(String[] args) {
		start (10);	

	}
	static void start (int number) {
		while (true) {
			if (number > 0) {
				System.out.println(number --);
				if (number == 0) {
					System.out.println("Go!");
				}
			} else if (number < 0) {
				System.out.println("Start failed");	
				return;
			}
		}
	}
}
