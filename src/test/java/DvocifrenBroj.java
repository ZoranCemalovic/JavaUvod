import java.util.Scanner;

public class DvocifrenBroj {
    public static void main(String[] args) {
        //Uneti dvocifren broj i prikazati prvu i drugu cifru
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite dvocifren broj:");
        int x=s.nextInt();
        if (x<10 || x>99) {
            System.out.println("Uneli ste broj koji nije dvocifren");
            return;
        }
        int prvaCifra=x/10;
        int drugaCifra=x%10;
        System.out.println("Prva cifra je: "+prvaCifra);
        System.out.println("Druga cifra je: "+drugaCifra);

    }
}
