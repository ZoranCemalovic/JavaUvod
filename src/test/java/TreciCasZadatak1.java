import java.util.Scanner;

public class TreciCasZadatak1 {
    public static void main(String[] args) {

        ////Zadatak 1 - Preko skenera uneti ime, pol i broj godina.
        // Ako je korisnik maloletan treba se ispisati odgovarajuca poruka.
        // Ako je korisnik muskog pola potrebno je ispisati poruku "Gospodine " + ime,
        // a ako je zenskog pola treba ispisati poruku "Gospodjo " + ime

        System.out.println("Unesite Vase ime");
        Scanner s=new Scanner(System.in);
        String ime=s.next();
        System.out.println("Unesite Vas pol kao muski ili zenski");
        String pol=s.next();
        System.out.println("Unesite Vas broj godina");
        int brojGodina=s.nextInt();
        if (brojGodina<18){
            System.out.println("Korisnik je maloletan");}
        if (pol.equals("muski")) {
            System.out.println("Gospodine "+ime);}
            else if (pol.equals("zenski")) {
                System.out.println("Gospodjo "+ime);}
        else {
            System.out.println("Niste uneli odgovarajuci pol");}
    }
}
