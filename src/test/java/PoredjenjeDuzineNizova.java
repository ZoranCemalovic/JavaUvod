public class PoredjenjeDuzineNizova {
    public static void main(String[] args) {
        //Zadatak 5 - Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu
        int niz1[]={2,6,8,3,9,5,7};
        int niz2[]={2,6,8,3,9,5,7};
        int sumaNiz1=0;
        int sumaNiz2=0;
        if (niz1.length> niz2.length) {
            System.out.println("Niz 1 ima vise clanova");
        } else if (niz1.length< niz2.length) {
            System.out.println("Niz 2 ima vise clanova");
        }   else {
            System.out.println("Niz 1 i 2 imaju isti broj clanova");
        }
        for (int i=0; i<niz1.length; i++) {
            sumaNiz1=sumaNiz1+niz1[i];
        }
        for (int i=0; i<niz2.length; i++) {
            sumaNiz2=sumaNiz2+niz2[i];
        }
        if (sumaNiz1> sumaNiz2) {
            System.out.println("Niz 1 ima vecu sumu");
        } else if (sumaNiz1< sumaNiz2) {
            System.out.println("Niz 2 ima vecu sumu");
        }   else {
            System.out.println("Niz 1 i 2 imaju istu sumu");
        }
    }
}
