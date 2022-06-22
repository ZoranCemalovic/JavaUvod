import java.util.Scanner;

public class CetvrtiCasZadatak1 {
    public static void main(String[] args) {
        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog
        // oduzima treci, ako se unese 3 onda se mnoze, ako se unese 4 onda se dele
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite prvi broj (1-4)");
        int x=s.nextInt();
        System.out.println("Unesite drugi broj");
        double y=s.nextDouble();
        System.out.println("Unesite treci broj");
        double z=s.nextDouble();
        switch (x) {
            case 1:
                System.out.println("Sabiranjem drugog i treceg broja dobija se "+(y+z));
                break;
            case 2:
                System.out.println("Oduzimanjem treceg od drugog broja dobija se "+(y-z));
                break;
            case 3:
                System.out.println("Mnozenjem drugog i treceg broja dobija se "+(y*z));
                break;
            case 4:
                System.out.println("Deljenjem drugog broja sa trecim dobija se "+(y/z));
                break;
            default:
                System.out.println("Uneli ste pogresan prvi broj");
                break;
        }
    }
}
