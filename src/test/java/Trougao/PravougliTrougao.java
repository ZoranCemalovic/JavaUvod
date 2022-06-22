package Trougao;

/*public class PravougliTrougao {
    //Napraviti klasu: PravougliTrougao
    //- polja: double a, b,c
    //- konstruktor koji prima a,b,c
    //- metodu obim koja racuna obim trougla
    //- metodu povrsina koja racuna povrsinu pravouglog trougla
    private double a;
    private double b;
    private double c;

    public PravougliTrougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double obim() {
        return a+b+c;
    }
    public double povrsina() {
        return a*b/2;
    }
}*/
public class PravougliTrougao extends Trougao{

    public PravougliTrougao(double a, double b, double c) {
        super (a,b,c);
    }
    public double povrsina() {
        return super.getA()*super.getB()/2;
    }
}