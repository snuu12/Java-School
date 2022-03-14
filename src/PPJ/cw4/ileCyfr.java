package PPJ.cw4;

import java.util.Scanner;

public class ileCyfr {

    int liczba = 0;

    public void Sprawdzliczbe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą :");
        liczba = sc.nextInt();
        int tmp = 0;

        if (liczba < 0) {
            liczba *= -1;

            if (liczba / 10 == 0) {
                System.out.println("Liczba jest jednocyfrowa");
                tmp=1;

            }
            if (liczba >= 10 && liczba < 100) {
                System.out.println("Liczba jest dwucyfrowa");
                tmp=1;
            }
            if (liczba >= 100 && liczba < 1000) {
                System.out.println("Liczba jest trzycyfrowa");
                tmp=1;
            }
            if (liczba >= 1000 && liczba < 10000) {
                System.out.println("Liczba jest czterocyfrowa");
                tmp=1;

            }
            if ( tmp==0){
                System.out.println("Podana Liczba jest za duża");
            }
        }
    }
}
