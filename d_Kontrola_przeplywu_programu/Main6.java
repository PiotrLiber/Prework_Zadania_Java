

public class Main6 {

	public static void main(String[] args) {
		// PETLA FOR
		int n=8, modulo;
		for (int i=0; i<=n; i++) {
			modulo = i % 2;
			if (modulo>0) {
				System.out.println(i + " - For: nieparzysta"); //dopisalem text "For:" aby bylo wiadome ze to petla for sprawdza
			} else {
				System.out.println(i + " - For: parzysta");
			}
		}

        // PETLA WHILE
		int i=0;
		while (i<=n) {
			modulo = i % 2;
			if (modulo>0) {
				System.out.println(i + " - While: nieparzysta"); //dopisalem text "While:" aby bylo wiadome ze to petla While sprawdza
			} else {
				System.out.println(i + " - While: parzysta");
			} i++;

		}

	}

}
