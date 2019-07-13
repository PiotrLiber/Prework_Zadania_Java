
public class Main4 {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		int modulo, sumOdd=0;
		for(int i=0; i<numbers.length; i++) {
			modulo = numbers[i] % 2;
			if (modulo>0) {
				System.out.println(numbers[i]);
				sumOdd = sumOdd + numbers[i];
			}

		}
		System.out.println("Suma liczb nieparzystych to: " + sumOdd);

	}

}
