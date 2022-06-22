package Zivotinje;

public class Detlic extends Zivotinje{
    public Detlic(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Detlic spava");
    }

    public void jedi(){
        System.out.println("Detlic jede");
    }

    public void svraljaj(){
        System.out.println("Detlic svralja po drvecu");
    }

    public void proizvediZvuk(){
        System.out.println("Kljuc");
    }

}
