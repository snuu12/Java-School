package com.company.PPJ.cw4;

import java.util.Scanner;

public class Signum {
double liczba;

public void sprawdźWartośćFunkcjiSignum(){

    Scanner sc=new Scanner(System.in);
    System.out.print("Podaj liczbę :");
    liczba=sc.nextDouble();
    System.out.println("Wartość funkcji signum dla "+(int)liczba+" to "+ znakLiczby(liczba));
}



    int znakLiczby(double liczba){

        if (liczba <0)
        {
            return -1;
        }
        else if (liczba==0)
            return 0;

        return 1;

    }
}
