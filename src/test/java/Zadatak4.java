import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Zadatak 4 - Preko skenera uneti dva broja i odstampati aritmeticku sredinu unetih brojeva

        Scanner s=new Scanner(System.in);
        System.out.println("Molimo vas unesite neki ceo broj");
        int x = s.nextInt();
        System.out.println("Molimo vas unesite neki ceo broj");
        int y = s.nextInt();
        System.out.println("Aritmeticka sredina brojeva "+x+" i "+y+" je "+(x+y)/2+".");

        double z=(x+y)/2.0;
        System.out.println("Aritmeticka sredina brojeva "+x+" i "+y+" je "+z+".");

        System.out.println("Molimo vas unesite neki realan broj");
        double p=s.nextDouble();
        System.out.println("Molimo vas unesite neki realan broj");
        double q=s.nextDouble();
        double w=(p+q)/2;
        System.out.println("Aritmeticka sredina brojeva "+p+" i "+q+" je "+w+".");


    }
}
