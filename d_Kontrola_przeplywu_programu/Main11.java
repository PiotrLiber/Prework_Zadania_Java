public class Main11 {

        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= 2 * n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i <= n) {
                        if (i >= j) {
                            System.out.print("* ");
                        } else {
                            System.out.print(j + " ");
                        }
                    } else {
                        int k = 2 * n - i + 1;
                        if (j <= k) {
                            System.out.print("* ");
                        } else {
                            System.out.print(j + " ");
                        }
                    }
                }
                System.out.println("");
            }

        }
    }