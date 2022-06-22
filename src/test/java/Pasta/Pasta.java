package Pasta;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> listaSastojaka;

    public Pasta() {
        this.listaSastojaka = new ArrayList<Sastojak>();
    }

    public void dodajSastojak(Sastojak s) {
        listaSastojaka.add(s);
    }
    public void brisiSastojke(String naziv) {

        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (this.listaSastojaka.get(i).getNaziv().equals(naziv)) {
                this.listaSastojaka.remove(i);
            }
        }
    }

    public void obrisiSastojak(Sastojak s) {
        for (int i=0; i<listaSastojaka.size(); i++) {
            if(listaSastojaka.get(i).equals(s));
            listaSastojaka.remove(s);
        }

    }
    public double cena() {
        double cenaPaste=0;
        for (int i=0; i<listaSastojaka.size(); i++) {
            cenaPaste=cenaPaste+listaSastojaka.get(i).getCena();
        }
        return cenaPaste;

    }
       public void stampa() {
        System.out.println("Pasta je sa sastojcima: ");
           for (int i=0; i<listaSastojaka.size(); i++) {
               listaSastojaka.get(i).stampanje(); }
        System.out.println("Cena paste je "+cena()+" din");
           System.out.println("-----------");

    }
}
