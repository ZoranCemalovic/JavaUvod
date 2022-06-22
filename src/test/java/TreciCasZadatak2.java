import java.util.Scanner;

public class TreciCasZadatak2 {
    public static void main(String[] args) {
        ////Zadatak 2 - Potrebno je napraviti program koji ce ispitati godine korisnika i
        // da li ce korisnik moci da polaze za vozacku dozvolu. Ako korisnik ima vise od 17 godina
        // treba ispisati "Mozete polagati za vozacku dozvolu", ako ima tacno 17 godina treba ispisati
        // "Mozete polagati za vozacku dozvolu vec ove godine", a ako ima manje od 17 treba ispisati
        // "Mozete polagati za vozacku dozvolu za x godina" gde je x promenljiva u zavisnosti koliko
        // korisniku treba do 17 godina

        Scanner s=new Scanner(System.in);
        System.out.println("Unesite Vas broj godina");
        int brojGodina=s.nextInt();
        int x=17-brojGodina;
        if (brojGodina>17){
            System.out.println("Mozete polagati za vozacku dozvolu");}
        else if (brojGodina==17){
            System.out.println("Mozete polagati za vozacku dozvolu vec ove godine");}
        else if (brojGodina<17){
            System.out.println("Mozete polagati za vozacku dozvolu za "+x+" godina");}
        }
    }

