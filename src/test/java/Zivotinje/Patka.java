package Zivotinje;

public class Patka extends Zivotinje{
    public Patka(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Patka spava");
    }

    public void jedi(){
        System.out.println("Patka jede");
    }

    public void svraljaj(){
        System.out.println("Patka svralja po bari");
    }

    public void proizvediZvuk(){
        System.out.println("Kva kva");
    }

}
