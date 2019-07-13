
public class Main10 {

    public static void main(String[] args) {
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 1; i <= n; i++) {
            String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 1; j <= n; j++) {

                if (j<=i) {                  // warunek na gwiazdke
                    System.out.print("* ");
                } else {                     // jesli nie gwiazdka to nic nie wstawia
                    System.out.print("");
                }
            }
            System.out.print("\n");
        }

    }

}
