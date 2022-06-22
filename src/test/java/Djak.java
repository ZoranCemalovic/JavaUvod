import java.util.Scanner;

public class Djak {
    public static void main(String[] args) {
        // Zadatak 2 - Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        // ako ima sve petice program vrati poruku "Odlican djak",
        // ako nema sve petice vraca poruku "Nije odlican djak"
        Scanner s=new Scanner(System.in);
        int i=0;
        int ocena;
        boolean odlican=true;
        System.out.println("Unesite poslednjih 5 ocena");
        for (i=0; i<5; i++) {
            System.out.println("Unesite " + (i + 1) + ". ocenu");
            ocena = s.nextInt();
            if (ocena<1 || ocena>5) {
                i--;
                System.out.println("Uneli ste nepostojecu ocenu. Unesite ocenu ponovo: ");
                }
                else if (ocena<5){
                odlican=false;
                }

            }
        if (odlican==false) {
            System.out.println("Nije odlican djak");

        } else {
            System.out.println("Odlican djak");
        }


    }
}
