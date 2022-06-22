public class Nizovi {
    public static void main(String[] args) {
        System.out.println("pocetak programa");
        //int [] mojNiz; //deklaracija niza
        //mojNiz {1,2,3,4,5,6,7,8}; //inicijalizacija niza

        int[] niz1={1,2,3,4,5,6,7,8,9,10}; //deklaracija i inicijalizacija niza u jednom redu
        System.out.println("Prvi element je "+niz1[0]);
        System.out.println("Prvi element je "+niz1[1]);
        System.out.println("Prvi element je "+niz1[2]);
        System.out.println("Poslednji element je "+niz1[9]);

        int[] niz2=new int[10];
        System.out.println("Duzina niza 2 je "+niz2.length);
        int x; // x==0
        double d; //d==0.0
        String s; //s==null
        boolean b; //b=false
        System.out.println(niz2[0]);
        niz2[0]=100;
        System.out.println(niz2[0]);
        System.out.println(niz2[1]);




    }
}
