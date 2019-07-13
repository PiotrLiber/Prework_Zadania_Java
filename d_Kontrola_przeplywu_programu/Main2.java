
public class Main2 {

	public static void main(String[] args) {
		int nr1=7, nr2=2, nr3=11;
		if ((nr1+nr2)<=nr3) {
			System.out.println("Najwieksza z liczb " + nr1 + ", " + nr2 +", " + nr3 + " to " + nr3);
		} else if ((nr2+nr3)<=nr1){
			System.out.println("Najwieksza z liczb " + nr1 + ", " + nr2 +", " + nr3 + " to " + nr1);
		} else {
			System.out.println("Najwieksza z liczb " + nr1 + ", " + nr2 +", " + nr3 + " to " + nr2);
		}

	}

}
