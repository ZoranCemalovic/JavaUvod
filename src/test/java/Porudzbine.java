import java.util.Scanner;

public class Porudzbine {
    public static void main(String[] args) {
        //Napraviti program koji služi za prikupljanje proudžbine od korisnika, stavke porudžbine
        //smestiti u niz stringova a cenu u niz decimalnih brojeva. Potom odrediti najjefitniji i
        //najskuplji deo porudžbine. (Ispisati naziv stavke kao i cenu)
        Scanner s=new Scanner(System.in);

        System.out.println("Unesite broj stavki porudzbine");
        int n= s.nextInt();
        while (n<=0) {
            System.out.println("Uneli ste broj koji nije veci od 0. Unesite broj ponovo: ");
            n=s.nextInt();
        }
        double minCena=1.79769313486231570e+308d; //najveca double vrednost
        double maxCena=0;
        String minStavka="";
        String maxStavka="";
        int i;
        String[] nizStavka=new String[n];
        double[] nizCena=new double[n];


        for (i=0; i<n; i++) {
            System.out.println("Unesite "+(i+1)+". stavku porudzbine");
            nizStavka[i]=s.next();

            System.out.println("Unesite cenu "+(i+1)+". stavke porudzbine");
            nizCena[i]=s.nextDouble();
            while (nizCena[i]<0) {
                System.out.println("Uneli ste negativnu vrednost. Unesite cenu ponovo: ");
                nizCena[i]=s.nextDouble();
            }
                if (nizCena[i]<minCena) {
                    minCena=nizCena[i];
                    minStavka=nizStavka[i];
                }
                if (nizCena[i]>maxCena) {
                    maxCena=nizCena[i];
                    maxStavka=nizStavka[i];
                }
        }
        System.out.println("Najjeftinija stavka je "+minStavka+" sa cenom "+minCena);
        System.out.println("Najskuplja stavka je "+maxStavka+" sa cenom "+maxCena);
    }
}
