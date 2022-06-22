import java.util.Scanner;

public class PetiCasZadatak3 {
    public static void main(String[] args) {
        //Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
        // od prvog elementa niza do n gde je n poslednji element niza ...
        // u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n] (edited)
                //napisati program koji prvo samo stampa elemente niza
        //onda smisliti kako da racunamo sumu
                //*bonus napravite da se elementi niza i duzina niza ucitava preko skenera
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite duzinu niza");
        int n= s.nextInt();
        int[] niz=new int[n];


        for (int i=0; i<niz.length; i++) {
            System.out.println("Unesite "+(i+1)+". broj u nizu");
            niz[i]=s.nextInt();
            System.out.println(niz[i]);
        }
        double suma=0;
        for (int i=0; i<niz.length; i++) {
            suma=suma+niz[i];
        }
        System.out.println("Zbir svih brojeva u nizu je "+suma);
        System.out.println("Aritmeticka sredina sume je "+suma/niz.length);
    }
}
