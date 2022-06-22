import java.util.Scanner;

public class PetiCasZadatak4 {
    public static void main(String[] args) {
        //Napisati program koji izracunava geometrijsku sumu parnih brojeva
        //na neparnim indeksima: niz[0] * niz[1] * ... * niz[n]
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite duzinu niza");
        int n= s.nextInt();
        int[] niz=new int[n];


        for (int i=0; i<niz.length; i++) {
            System.out.println("Unesite broj na indeksu "+i);
            niz[i]=s.nextInt();

        }
        double suma=1;
        for (int i=0; i<niz.length; i++) {
            if(niz[i]%2==0 && i%2!=0)
            suma=suma*niz[i];
        }
        System.out.println("Geometrijska suma parnih brojeva na neparnim indeksima je "+suma);
    }
}
