
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); // wartosc 'a=1' zostanie zwiekszona o 1 i wyswietlona 2, 'a' ma teraz wartosc 'a=2'
		System.out.println(a++); /*obecna wartosc 'a=2' zostanie najpierw wyswietlona,
		                           a dopiero pozniej zostanie dodana liczba 1 i 'a=3' */
		System.out.println(a);   //wyswietli sie obecna wartosc  'a=3'
		b=a++;                   /* zmienna b staje sie tozsama z 'a++',
		                            natomiast a powieksza sie o 1 i ma teraz wartosc a=4 */
		System.out.println(b);   /* poniewaz b=a++ zostanie wyswietlona wartosc 'a=3 */
		b=++a;                   /* zmienna b staje sie tozsama z '++a',
		                            natomiast a powieksza sie o 1 i ma teraz wartosc a=5 */
		System.out.println(++a); // wartosc a=5 zostaje zwiekszona o 1 i wyswietla sie 6, a ma teraz wartosc 6
	}

}
