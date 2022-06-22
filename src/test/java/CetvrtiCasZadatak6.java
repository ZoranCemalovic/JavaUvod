import java.util.Scanner;

public class CetvrtiCasZadatak6 {
    public static void main(String[] args) {
        //Zadatak 6 - Nacrtajte trougao sa N redova
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj");
        int n=s.nextInt();
        String zvezda="";
        for (int i=1; i<=n; i++) {
            String zvezdica="*";
            zvezda=zvezda+zvezdica;
            System.out.println(zvezda);

        }
    }
}
