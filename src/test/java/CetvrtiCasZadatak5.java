import java.util.Scanner;

public class CetvrtiCasZadatak5 {
    public static void main(String[] args) {
        //Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu
        // dok korisnik ne unese negativan broj - Koristiti DO WHILE
        Scanner s = new Scanner(System.in);

        int x = 0;
        int n;
        do {
            System.out.println("Unesite broj N");
            n = s.nextInt();
            if (n>0)
                x = x + n;
        } while (n > 0);
        System.out.println("Zbir prethodno unesenih brojeva je " + x);
        System.out.println("Kraj programa");
    }
}
