package com.company.PPJ.cw4;

import java.util.Scanner;

public class Miesiac {

    int numerMiesaca;

    public void SpradzMiesiac(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj numer miesiąca :");
        numerMiesaca=sc.nextInt();

        switch (numerMiesaca){
            case 1:
                System.out.println("wspomniałeś Styczeń");
                break;
            case 2:
                System.out.println("wspomniałeś Luty");
                break;
            case 3:
                System.out.println("wspomniałeś Marzec");
                break;
            case 4:
                System.out.println("wspomniałeś Kwiecień");
                break;
            case 5:
                System.out.println("wspomniałeś Maj");
                break;
            case 6:
                System.out.println("wspomniałeś Czerwiec");
                break;
            case 7:
                System.out.println("wspomniałeś Lipiec");
                break;
            case 8:
                System.out.println("wspomniałeś Sierpień");
                break;
            case 9:
                System.out.println("wspomniałeś Wrzesień");
                break;
            case 10:
                System.out.println("wspomniałeś Pażdziernik");
                break;
            case 11:
                System.out.println("wspomniałeś Listopad");
                break;
            case 12:
                System.out.println("wspomniałeś Grudzień");
                break;
            default:
                System.out.println("Program przymuje liczby tylko z zakresu od 1 do 12 ");


        }

    }
}
/*


Następne zdanie też na stwich ze stronegiem

String napis;

case 2 :

    Napis=+" Luty"

    case 11 :

    Napis =+ "Listopad , grudzień "

 */