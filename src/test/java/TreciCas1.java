import java.util.Scanner;

public class TreciCas1 {
    public static void main(String[] args) {
        System.out.println("Unesite broj veci od 10");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if (x>10) {
            System.out.println("Broj je veci od 10");
            System.out.println("Kraj programa");
        }
    }
}
