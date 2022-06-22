package Zivotinje;

public class Som extends Zivotinje{
    public Som(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Som spava");
    }

    public void jedi(){
        System.out.println("Som jede");
    }

    public void svraljaj(){
        System.out.println("Som svralja po reci");
    }

    public void proizvediZvuk(){
        System.out.println("?");
    }

}
