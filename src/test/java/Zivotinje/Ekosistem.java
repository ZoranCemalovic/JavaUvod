package Zivotinje;

import java.util.ArrayList;

public class Ekosistem {
    public static void main(String[] args) {
        Patka p1=new Patka("Beloglava", false, false);
        Lav l1=new Lav("Africki", true,false);
        Zivotinje z1=new Macka("Sijamska", false, false);
        Zivotinje z2=new Detlic("Veliki", true, false);
        Zivotinje z3=new Som("Pangasius",false,false);
        Biljka b1=new Biljka("Pitoma", false, false, "Nana", true);
        Biljka b2=new Biljka("Zuta", false, false, "Kamilica", true);


        ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();

        listaZivotinja.add(p1);
        listaZivotinja.add(l1);
        listaZivotinja.add(z1);
        listaZivotinja.add(z2);
        listaZivotinja.add(z3);


        for(Zivotinje z: listaZivotinja){
            if(z instanceof Patka){
                System.out.print("Vrsta patke je ");
            } else if (z instanceof Lav) {
                System.out.print("Vrsta lava je ");
            } else if (z instanceof Detlic) {
                System.out.print("Vrsta detlica je ");
            } else if (z instanceof Som) {
                System.out.print("Vrsta soma je ");
            } else if (z instanceof Macka) {
                System.out.print("Vrsta macke je ");
            }

            System.out.print(z.getVrsta() + " i kaze: ");
            z.proizvediZvuk();
            z.jedi();
            z.spavaj();
            z.svraljaj();
            System.out.println("Ugrozenost: "+z.isUgrozeno());
            System.out.println("Otrovno za konzumiranje od strane zivotinja: "+z.isOtrovno());
        }

        ArrayList<Biljka> listaBiljaka = new ArrayList<>();

        listaBiljaka.add(b1);
        listaBiljaka.add(b2);
        for(Biljka b: listaBiljaka) {
            if (b != null) {
                System.out.println("Vrsta biljke "+b.narodniNaziv+" je "+ b.getVrsta());
                System.out.println("Ugrozenost: "+b.isUgrozeno());
                System.out.println("Otrovno za konzumiranje od strane zivotinja: "+b.isOtrovno());
                System.out.println("Lekovitost: "+b.isLekovita());
            }
        }
    }



}
