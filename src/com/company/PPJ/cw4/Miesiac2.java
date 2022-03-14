package com.company.PPJ.cw4;

import java.util.Scanner;

public class Miesiac2 {

    int numerMiesaca;
    String napis="";

    public void SpradzMiesiac(){
        System.out.print("Podaj numer miesiaca : ");
        Scanner sc=new Scanner(System.in);
        numerMiesaca=sc.nextInt();

        switch (numerMiesaca){
            case 1:
                napis+="Styczeń, ";

            case 2:
                napis+= "Luty, ";

            case 3:
                napis+= "Marzec, ";

            case 4:
               napis+= "Kwiecień, ";

            case 5:
                napis+= "Maj, ";

            case 6:
                napis+="Czerwiec, ";

            case 7:
                napis+= "Lipiec, ";

            case 8:
                napis+=" Sierpień, ";

            case 9:
                napis+="  Wrzesień, ";

            case 10:
                napis+=" Pażdziernik, ";

            case 11:
                napis+=" Listopad, grudzień ";
                break;

            case 12:
                napis="Hura to już koniec roku";
                break;
            default:
                System.out.println("Program przymuje liczby tylko z zakresu od 1 do 12 ");
                napis="";

        }

        System.out.println("Do końca roku czekają cię jeszcze miesiące : "+ napis);

    }
}
