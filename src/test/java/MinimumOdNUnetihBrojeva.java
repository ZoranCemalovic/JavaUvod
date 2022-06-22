import java.util.Scanner;

public class MinimumOdNUnetihBrojeva {
    public static void main(String[] args) {
        //Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj.
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite duzinu niza (n>0): ");
        int n=s.nextInt();
        int x;
        int min=2147483647; //najveci pozitivan int
        while (n<=0) {
            System.out.println("Uneli ste broj koji nije veci od 0. Unesite broj ponovo: ");
            n=s.nextInt();
        }
            for (int i=0; i<n; i++) {
            System.out.println("Unesite bilo koji ceo broj: ");
            x=s.nextInt();
                if (x<min) {min=x;
                }
            }
        System.out.println("Najmanji broj u nizu od unetih "+n+" brojeva je: "+min);
    }

}
