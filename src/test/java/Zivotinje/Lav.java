package Zivotinje;

public class Lav extends Zivotinje{
    public Lav(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Lav spava");
    }

    public void jedi(){
        System.out.println("Lav jede");
    }

    public void svraljaj(){
        System.out.println("Lav svralja po savani");
    }

    public void proizvediZvuk(){
        System.out.println("Roar");
    }

}

