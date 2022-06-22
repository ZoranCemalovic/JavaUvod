import java.util.Scanner;

public class CetvrtiCasZadatak2 {
    public static void main(String[] args) {
        //Zadatak 2 - Napraviti for petlju koja ce da se pokrene 5 puta. Svaki put ce traziti od korisnika
        // da unese neki broj. Ako korisnik unese 0 onda je potrebno ispisati "Bingo!"
        Scanner s=new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Unesite bilo koji ceo broj");
            int x = s.nextInt();
            if (x == 0) {
                System.out.println("Bingo");
            }
        }
    }
}
