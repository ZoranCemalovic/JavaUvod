import java.util.Scanner;

public class SumaDoUnosaIstihBrojeva {
    public static void main(String[] args) {
        //Zadatak 4 - Unositi brojeve sve dok se ne unesu dva ista broja za redom,
        // nakon toga prikazati sumu svih prethodno unetih brojeva
        Scanner s=new Scanner(System.in);
        int x;
        int y=2147483647;
        int suma=0;
        for (int i=0; i>=0; i++) {
            System.out.println("Unesite bilo koji ceo broj: ");
            x=s.nextInt();
            suma=x+suma;

            if (y==x) {
                System.out.println("Uneli ste dva ista broja za redom.");
                break;
            }
            y=x;
        }
        System.out.println("Suma svih prethodno unetih brojeva je: "+suma);

    }
}
