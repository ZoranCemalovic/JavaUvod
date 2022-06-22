import java.util.ArrayList;

public class SestiCas3 {
    public static void main(String[] args) {

        //Pravim listu sa 5 rezervacija za restoran

        ArrayList<String> rezervacije = new ArrayList<>();
        rezervacije.add(null);
        rezervacije.add(null);
        rezervacije.add(null);
        rezervacije.add(null);
        rezervacije.add(null);

        stampanje(rezervacije);

        rezervacije.set(0, "Sara");
        rezervacije.set(1, "Milan");
        rezervacije.set(2, "Mina");
        rezervacije.set(3, "Milos");
        rezervacije.set(4, "Aleksandar");
        rezervacije.add(0,"Dragoljub");

        stampanje(rezervacije);



    }

    public static void stampanje(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---------");
    }


}