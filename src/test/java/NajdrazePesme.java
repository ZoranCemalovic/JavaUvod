import java.util.Scanner;

public class NajdrazePesme {
    public static void main(String[] args) {
        //Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
        //pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese.
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj najdrazih pesama:");
        int n= s.nextInt();
        s.nextLine();
        String[] niz=new String[n];
        int i;

        for (i=0; i<n; i++) {
            System.out.println("Unesite "+(i+1)+". najdrazu pesmu:");
            niz[i]=s.nextLine();
        }
        System.out.println("Vase najdraze pesme su: ");
        for (i=0; i<n; i++) {
            System.out.println((i+1)+". "+niz[i]);
        }
    }

}
