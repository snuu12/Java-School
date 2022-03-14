package com.company.PPJ.cw3;
import java.util.Scanner;

public class Muzyka {
String nazwaUtworu1 ,nazwaUtworu2,minuty1,minuty2,sekundy1,sekundy2;
     String DodanyCzas = "dd";


    double sekundyNaMinuty(double Wpiszsekundy) {
    int sekundy = (int)Wpiszsekundy % 60;
    int  minuty = (int)Wpiszsekundy / 60;
    double sec=(double)sekundy;
    sec=sec/100.00;
    double min=minuty;
    min=min+sec;

    return min;
}




    void PobierzDane() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Tytuł pierwszego utworu: ");
        nazwaUtworu1=scanner.nextLine();
        System.out.print("Podaj czas pierwszego utworu(minuty): ");
        minuty1=scanner.nextLine();
        System.out.print("Podaj czas pierwszego (sekundy): ") ;
        sekundy1=scanner.nextLine();

        System.out.println();

        System.out.print("Podaj Tytuł drugiego utworu: ");
        nazwaUtworu2=scanner.nextLine();
        System.out.print("Podaj czas drugiego utworu(minuty): ");
        minuty2=scanner.nextLine();
        System.out.print("Podaj czas drugiego (sekundy): ") ;
        sekundy2=scanner.nextLine();

    }


    void WyświetlDanne(){

        int minuty1i,minuty2i,sekundy1i,sekundy2i,czas3min,czas3sekundy;;
        double czas1,czas2, czas3;

        minuty1i=Integer.parseInt(minuty1);
        minuty2i=Integer.parseInt(minuty2);
        sekundy1i=Integer.parseInt(sekundy1);
        sekundy2i=Integer.parseInt(sekundy2);


        czas1=sekundyNaMinuty((minuty1i*60)+sekundy1i);
        czas2=sekundyNaMinuty((minuty2i*60)+sekundy2i);

        czas3=sekundyNaMinuty(((minuty1i*60)+sekundy1i+((minuty2i*60)+sekundy2i)));
        czas3min=(int)czas3;
        czas3sekundy=((minuty1i*60)+sekundy1i+((minuty2i*60)+sekundy2i))%60;


        double pierwsza=Math.max(czas1,czas2);
        if (pierwsza==czas1){

            System.out.println("-----------------------------------------");
            System.out.println("UTWORY:");
            System.out.println("1. "+nazwaUtworu1+" "+minuty1i +":"+sekundy1i);
            System.out.println("2. "+nazwaUtworu2+" "+minuty2i +":"+sekundy2i);
            System.out.print("ŁĄCZNY CZAS TRWANIA : ");
            System.out.println(String.format("%2d:%02d", czas3min, czas3sekundy));
            System.out.println("__________________________________________");

        }else{


            System.out.println("-----------------------------------------");
            System.out.println("UTWORY:");
            System.out.println("1. "+nazwaUtworu2+" "+minuty2i +":"+sekundy2i);
            System.out.println("2. "+nazwaUtworu1+" "+minuty1i +":"+sekundy1i);
            System.out.print("ŁĄCZNY CZAS TRWANIA : ");
            System.out.println(String.format("%2d:%02d", czas3min, czas3sekundy));
            System.out.println("__________________________________________");




        }










    }



}
