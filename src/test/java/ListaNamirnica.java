import java.util.ArrayList;

public class ListaNamirnica {
    public static void main(String[] args) {
        ////Zadatak 1 - Kreirati listu namirnica iz prodavnice, dodeliti vrednosti, odstampati sve vrednosti,
        // zatim obrisati drugi i cetvrti clan pa ponovo odstampati listu
        ArrayList ListaNamirnica = new ArrayList();

        ListaNamirnica.add("Krompir");
        ListaNamirnica.add("Luk");
        ListaNamirnica.add("Celer");
        ListaNamirnica.add("Sargarepa");
        ListaNamirnica.add("Paradajz");
        ListaNamirnica.add("Krastavac");
        System.out.println("Lista namirnica je: ");
        for (int i=0; i< ListaNamirnica.size(); i++)
        System.out.println((i+1) + ". namirnica je "+ListaNamirnica.get(i));
        ListaNamirnica.remove(1);
        ListaNamirnica.remove(2);
        System.out.println("Lista namirnica nakon korekcije je: ");
        for (int i=0; i< ListaNamirnica.size(); i++)
            System.out.println((i+1) + ". namirnica je "+ListaNamirnica.get(i));
    }
}
