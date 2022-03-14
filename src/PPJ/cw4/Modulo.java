package PPJ.cw4;

/*

Czy reszta z dzielenia modlulo jest taka sama

(a%n == b%n)
 */

import java.util.Scanner;

public class Modulo {
    int  a, b, n;
    public void sprawdzModulo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj liczbe a :");
        a=sc.nextInt();
        System.out.print("Podaj liczbe b :");
        b=sc.nextInt();
        System.out.print("podaj liczbe n :");
        n=sc.nextInt();

        if ( a%n==b%n){
            System.out.println( "Liczby "+a+" i "+b+" przystają do siebie modulo "+n);
        }else{
            System.out.println( "Liczby "+a+" i "+b+" nie przystają do siebie modulo "+n);
        }



    }
}
