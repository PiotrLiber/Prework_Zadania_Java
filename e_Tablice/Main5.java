
public class Main5 {

	public static void main(String[] args) {
		int [] numbers = {-1,-5-8,-88,-10};
		int max = numbers[0];
				for(int i=0; i<numbers.length; i++) {
					if (numbers[i]>max) {
						max = numbers[i];
					}
				}
		System.out.println((max));
	}

}
