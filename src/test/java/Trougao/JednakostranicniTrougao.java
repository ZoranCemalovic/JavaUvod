package Trougao;

/*public class JednakostranicniTrougao {
    //Napraviti klasu: JednakostranicniTrougao
    //- polja: double a
    //- konstruktor koji prima a
    //- metodu obim koja racuna obim trougla
    //- metodu povrsina koja racuna povrsinu jednakostranicnog trougla
    private double a;

    public JednakostranicniTrougao(double a) {
        this.a=a;
    }

    public double obim() {
                return 3*a;
    }

    public double povrsina() {
        return Math.pow(this.a*Math.sqrt(3)/2,2)*Math.sqrt(3)/2;
    }

}*/
public class JednakostranicniTrougao extends Trougao {

    public JednakostranicniTrougao(double a) {
        //System.out.println("ovo nece da radi");
        super(a, a, a);// super mora biti prva 'komanda' u child klasi
        //this.a = a;
    }

    public double povrsina() {
        return Math.pow(super.getA() * Math.sqrt(3) / 2, 2) * Math.sqrt(3) / 2;
    }

}
