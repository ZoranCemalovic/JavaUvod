import java.util.ArrayList;
import java.util.Scanner;

public class OmiljeneZivotinje
{
    public static void main(String[] args)
    {
        //Napisati metodu koja vraca ArrayList-u vasih omiljenih zivotinja, unos vrsiti preko Scanner-a.
        //Napraviti drugu metodu koja stampa sadrzaj liste. Napraviti metodu
        //public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinije)
        //koja dodaje datu zivotinju u listu.

        Scanner s=new Scanner(System.in);
        ArrayList<String> omiljeneZivotinje= new ArrayList();
        System.out.println("Unesite broj omiljenih zivotinja: ");
        int brojZivotinja=s.nextInt();
        for(int i=0; i<brojZivotinja; i++) {
            System.out.println("Unesite "+(i+1)+" omiljenu zivotinju: ");
            String nazivZivotinje=s.next();
            dodaj(omiljeneZivotinje, nazivZivotinje);
        }
        System.out.println("---------------------------");
        stampanje(omiljeneZivotinje);

    }
    public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinje) {
        listaZaDodavanje.add(nazivZivotinje);
        return listaZaDodavanje;
    }
    public static void stampanje(ArrayList lista)
    {
        System.out.println("Lista omiljenih zivotinja je:");
        for(int i=0; i<lista.size(); i++) {
            System.out.println((i+1)+". "+lista.get(i));
        }
    }
}