
public class F31Break2 {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			
			if (i<11){
				System.out.println(i++);
				if (i == 11){
					break;
				}
			}		
		}
	}
}


