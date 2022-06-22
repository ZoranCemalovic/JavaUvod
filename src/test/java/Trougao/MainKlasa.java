package Trougao;

public class MainKlasa {
    public static void main(String[] args) {
        JednakostranicniTrougao t1=new JednakostranicniTrougao(3);
        System.out.println("Obim jednakostranicnog trougla je "+t1.obim());
        System.out.println("Povrsina jednakostranicnog trougla je "+t1.povrsina());

        PravougliTrougao p1=new PravougliTrougao(2,4,6);
        System.out.println("Obim pravouglog trougla je "+p1.obim());
        System.out.println("Povrsina pravouglog trougla je "+p1.povrsina());

        JednakokrakiTrougao j1=new JednakokrakiTrougao(4,6);
        System.out.println("Obim jednakokrakog trougla je "+j1.obim());
        System.out.println("Povrsina jednakokrakog trougla je "+j1.povrsina());

        RaznostraniTrougao r1=new RaznostraniTrougao(4,6, 7);
        System.out.println("Obim raznostranog trougla je "+r1.obim());
        System.out.println("Povrsina raznostranog trougla je "+r1.povrsina());

    }
}
