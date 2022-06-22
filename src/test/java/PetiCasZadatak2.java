public class PetiCasZadatak2 {
    public static void main(String[] args) {
//Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
// od prvog elementa niza do n gde je n poslednji element niza ...
// u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n]
//napisati program koji prvo samo stampa elemente niza
//onda smisliti kako da racunamo sumu
        int[] niz={1,5,8,34,67,79};
        for (int i=0; i<niz.length; i++) {
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
