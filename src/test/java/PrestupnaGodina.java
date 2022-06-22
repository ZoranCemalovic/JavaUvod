import java.util.Scanner;

public class PrestupnaGodina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite godinu i saznajte da li je prestupna");
        int x = sc.nextInt();
        if (x<1752) {
            System.out.println("Pre 1752 nije bilo prestupnih godina");
        } else if (x%400==0) {
                System.out.println("Godina je prestupna");
            } else if (x%100==0) {
                System.out.println("Godina nije prestupna");
            } else if (x%4==0) {
                System.out.println("Godina je prestupna");
            }else {
                System.out.println("Godina nije prestupna");
            }
        }
    }

