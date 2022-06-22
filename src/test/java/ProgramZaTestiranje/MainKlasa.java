package ProgramZaTestiranje;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasa {
    public static void main(String[] args) {
        /*Napisati program koji sluzi za testiranje ucenika i njihovog znanja
        Napisati apstraktnu klasu Pitanje koja ima atribute:
● String tekstPitanja
● int brojMaxPoena (>0)
● Int osvojenBrojPoena (>=0)
● boolean pitanjePregledano
        Geteri i seteri za ove attribute
        Klasa KlasicnoPitanje nasledjuje abstraktnu klasu Pitanje i sadrzi attribute:
● String odgovorNaPitanje
        Geteri i seteri za ovaj atribut
        Klasa PitanjeSaPonudjenimOdgovorima nasledjuje abstraktnu klasu Pitanje i sadrzi atribute
● String odgovorA
● String odgovorB
● String odgovorC
● String odgovorD
● String tacanOdgovor // identican sa jednim od prijasnih odgovora
        Main klasa sadrzi ArrrayList<Pitanje> pitanja popuniti listu sa 5 pitanja.
                Koristeci petlju proci kroz  ovih 5 pitanja i odgovoriti na jedno po jedno  pitanje.
        Drugom petljom proci kroz ovih 5 pitanja i dodeliti bodove za odgovore, istovremeno beleziti
        sumu osvojenih poena*/

        Pitanje p1 = new KlasicnoPitanje("Pitanje 1", 5,  "odgovor 1");
        Pitanje p2 = new KlasicnoPitanje("Pitanje 2", 5,  "odgovor 2");
        Pitanje p3 = new KlasicnoPitanje("Pitanje 3", 5,  "odgovor 3");
        Pitanje p4 = new KlasicnoPitanje("Pitanje 4", 5,  "odgovor 4");
        Pitanje p5 = new KlasicnoPitanje("Pitanje 5", 5,  "odgovor 5");
        Pitanje p6 = new PitanjeSaPonudjenimOdgovorima("Pitanje sa ponudjenim odg", 10,
                 "odgovor A", "odgovor B", "odgovor C",
                "odgovor D", "odgovor D");

        ArrayList<Pitanje> listaPitanja = new ArrayList<>();
        listaPitanja.add(p1);
        listaPitanja.add(p2);
        listaPitanja.add(p3);
        listaPitanja.add(p4);
        listaPitanja.add(p5);
        listaPitanja.add(p6);

        Scanner skener = new Scanner(System.in);

        for (Pitanje p : listaPitanja){
            System.out.print(p);
            p.setOdgovorStudenta(skener.nextLine());
        }
        System.out.println("Test je zavrsen");

        System.out.println("--------------------------------------");

        int suma = 0;
        for (Pitanje p : listaPitanja){
            System.out.println(p);
            suma += p.ocenjivanje(true);
        }

        System.out.println("Ukupno osvojenih poena na testu: " + suma);
    }
}
