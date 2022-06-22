import java.util.Scanner;

public class CetvrtiCasZadatak4 {
    public static void main(String[] args) {
        //Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE
        Scanner s=new Scanner(System.in);

        System.out.println("Unesite neki ceo broj N");
        int n=s.nextInt();
        int i=1;
        double suma=0;
        while (i<=n) {
            suma=suma+i;
            i++;}
        System.out.println("Aritmeticka sredina od 1 do N je "+suma/n);
    }
}
