package Trougao;

/*public class JednakokrakiTrougao {
    //Napraviti klasu: Jednakokraki
    //- polja: double a, double b
    //- konstruktor koji prima a, b
    //- metodu obim koja racuna obim trougla
    //- metodu povrsina koja racuna povrsinu jednakokrakog trougla
    private double a;
    private double b;


    public JednakokrakiTrougao(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double obim() {
        return a+2*b;
    }
    public double povrsina() {
        return 0.5*a*Math.sqrt((b+0.5*a)*(b-0.5*a));
    }
}*/
public class JednakokrakiTrougao extends Trougao{
        public JednakokrakiTrougao(double a, double b) {
            super(a, b, b);

    }
        public double povrsina() {
        return 0.5*super.getA()*Math.sqrt((super.getB()+0.5*super.getA())*(super.getB()-0.5*super.getA()));
    }
}
