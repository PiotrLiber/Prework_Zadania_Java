
public class Main9 {

    public static void main(String[] args) {
        //definicja zmiennej z liczbą rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 1; i <= n; i++) {

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 1; j <= n; j++) {
                if (j<=i) {                //warunek na wstawienie '*'
                    System.out.print("* ");
                } else {
                    System.out.print(j + " " ); // jesli nie gwiazdka to licznik 'j'
                }
            }
            System.out.print("\n");
        }

    }
}