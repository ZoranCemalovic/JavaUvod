import java.util.Scanner;

public class TreciCas2 {
    public static void main(String[] args) {

        System.out.println("Unesite ime Marija");

        Scanner sc = new Scanner(System.in);

        String ime = sc.next();

        String expectedName = "Marija";
        //Ako cemo string Marija koristiti vise puta onda ima smisla raditi na ovaj nacin
        //Ako cemo string Marija koristiti samo jednom onda je kraci code ako se string unese u if

        if (ime.equals(expectedName)) {
            System.out.println("Uneto ime je Marija");
        } else {
            System.out.println("Uneli ste pogresno ime");
        }

    }
}
