package Zivotinje;

public class Macka extends Zivotinje{
    public Macka(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Macka spava");
    }

    public void jedi(){
        System.out.println("Macka jede");
    }

    public void svraljaj(){
        System.out.println("Macka svralja po bari");
    }

    public void proizvediZvuk(){
        System.out.println("Mjau mjau");
    }

}
