import java.util.Scanner;

public class CetvrtiCasZadatak3 {
    public static void main(String[] args) {
        //Zadatak 3 - Prikazati sve dvocifrene brojeve deljive sa 3 - Koristiti FOR
        Scanner s=new Scanner(System.in);
        for (int i=10; i<100; i++)
        if (i%3==0) {
            System.out.println(i);
        }
    }
}
