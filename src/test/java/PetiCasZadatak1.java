public class PetiCasZadatak1 {
    public static void main(String[] args) {
        //Inicijalizovati niz tipa String sa 2 vrednosti, imenom i prezimenom
        //Isprintamo vrednost imena i prezimena
        //Izmeniti prezime osobe
        //Opet isprintamo ime i prezime da vidimo rezultat
        String[] niz=new String[2];
        niz[0]="Zoran Cemalovic";
        System.out.println(niz[0]);
        niz[0]="Zoran Bogdanovic";
        System.out.println(niz[0]);

        String[] niz1= {"Zoran Cemalovic","Ana Bogdanovic"};
        System.out.println(niz1[0]);
        niz1[0]="Zoran Bogdanovic";
        System.out.println(niz1[0]);
    }
}
