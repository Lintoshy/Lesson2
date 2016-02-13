
public class F32Continue {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			if (i <= 10){
				continue;
			}
			break;
		}
	}
}
