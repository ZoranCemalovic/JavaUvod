import java.util.Scanner;

public class ParniNeparni {
    public static void main(String[] args) {
        //Program koji ucitava prirodne brojeve sve dok ne bude unesen broj 0, i odredjuje koliko je
        //ucitanih brojeva parno, a koliko neparno.
        Scanner s=new Scanner(System.in);
        int x;
        int p=0;
        int n=0;
        do {
            System.out.println("Unesite ceo broj:");
            x = s.nextInt();
            if (x%2==0) {p=p+1;
            }  else {n=n+1;
            }
        } while (x!=0);
        System.out.println("Ucitano je "+p+" parnih i "+n+" neparnih brojeva.");
    }
}
