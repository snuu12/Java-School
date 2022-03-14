package com.company.PPJ.cw3;

import java.util.Scanner;

public class Student {

    String płec;
    String imie;
    String nazwisko;







  void pobierzDaneStudenta(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        imie=scanner.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko=scanner.nextLine();
        System.out.println("podaj płeć mężczyzna/kobieta");
        płec=scanner.nextLine();








    }


         void wyświetlDane(){

        if (płec.equals("mężczyzna"))
        {

            płec="student";
        }
        if  (płec.equals("kobieta"))
        {
            płec="Studentka";

        }else płec="Student/studentka";


        System.out.println(płec + " :"+" "+imie+" "+nazwisko);
    }
}
