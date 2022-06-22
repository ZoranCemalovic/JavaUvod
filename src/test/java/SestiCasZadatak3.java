import java.util.Scanner;

public class SestiCasZadatak3 {
    public static void main(String[] args) {
        //FizzBuzz:
        //Napisati program koji za brojeve od 1 do 100 racuna sledece:
        //ako je broj deljiv sa 3 i sa 5 ispisuje "fizzbuzz" (plus ispisuje taj broj)
        //ako je broj deliv sa 3 ispisuje "fizz" (plus ispisuje taj broj)
        //ako je broj deljiv sa 5 izpisuje "buzz" (plus ispisuje taj broj)

        //Ponovi zadatak FizzBuzz ALI umesto od 1 do 100 koristite niz koji cete ucitati u program
                //int[] niz = {1, 2, 3, 4, 5};
        int[] nizA={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
                for (int i = 0; i<nizA.length; i++) {
            if(nizA[i]%3==0 && nizA[i]%5==0) {
                System.out.println("fizzbuzz " + nizA[i]);
            }   else if (nizA[i]%3==0) {
                System.out.println("fizz " + nizA[i]);
            } else if (nizA[i]%5==0) {
                System.out.println("buzz " + nizA[i]);
            } else {
                System.out.println(nizA[i]);
            }
        }
    }
}
