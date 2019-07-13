
public class Main5 {

	public static void main(String[] args) {
		int resultFor=0, resultWhile=0;
		for (int i = 1; i <= 10; i++) {
			resultFor = resultFor + 1;
		}
		int i=1;
		while(i<=10) {
			resultWhile = resultWhile + 1; i++;
		}
		System.out.println("resultFor = " + resultFor);
		System.out.println("resultWhile = " + resultWhile);

	}
}
