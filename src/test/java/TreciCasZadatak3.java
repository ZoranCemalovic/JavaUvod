import java.util.Scanner;

public class TreciCasZadatak3 {
    public static void main(String[] args) {
        //Zadatak 3 - Imamo dve kockice ispred nas (plava i crvena), preko skenera treba uneti
        // koju kockicu bacamo i koji broj smo dobili. Ako bacimo plavu kockicu i dobijemo 1, onda dobijamo 1 poen,
        // ako dobijemo 2 onda dobijamo 2 poena, ako dobijemo 3,4,5 ili 6 onda dobijamo 10 poena. Crvena kockica
        // ima ista pravila kao i plava samo sto donosi duplo vise poena.
        //&& - and
        //|| - or
        Scanner s = new Scanner(System.in);
        System.out.println("Uneti boju kockice (plava,crvena)");
        String boja = s.next();
        System.out.println("Uneti broj kockice (1-6)");
        int broj = s.nextInt();
        if (boja.equals("plava") && broj >= 1 && broj <= 2) {
            System.out.println("Dobili ste " + broj + " poen/a");
        } else if (boja.equals("plava") && broj >= 3 && broj <= 6) {
            System.out.println("Dobili ste 10 poena");
        } else if (boja.equals("crvena") && broj >= 1 && broj <= 2) {
            System.out.println("Dobili ste " + broj * 2 + " poena");
        } else if (boja.equals("crvena") && broj >= 3 && broj <= 6) {
            System.out.println("Dobili ste 20 poena");
        } else {
            System.out.println("Uneli ste boju kockice koja nije ni crvena ni plava ili ste uneli broj koji nije od 1 do 6");
        }
    }
}
