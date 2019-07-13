
public class Main8 {

	public static void main(String[] args) {
		int black = 16, white = 15;
		boolean blackOrWhite, good=true, bad = false, goodOrBad, comparison;
				blackOrWhite = black < white;
				goodOrBad = good || bad;
				comparison = blackOrWhite && goodOrBad;
		System.out.println(blackOrWhite);
		System.out.println(goodOrBad);
		System.out.println(comparison);

	}

}
