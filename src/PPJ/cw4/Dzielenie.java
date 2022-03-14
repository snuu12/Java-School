package PPJ.cw4;

import java.util.Scanner;

public class Dzielenie {
    int liczba=0;
    boolean flaga=false;


    public void sprawdzLiczbe(){
        Scanner sc =new Scanner(System.in);

        System.out.print("podja Liczbe całkowtą :");
        liczba=sc.nextInt();

        if(liczba%2==0){
            flaga=true;
            System.out.println("Liczba " +liczba+ " jest podzielna przez 2");

        }

        if(liczba%3==0){
            System.out.println("Liczba "+liczba+" jest podzielna przez 3 ");
        }

        if(liczba%5==0){
            System.out.println("Liczba "+liczba+ " jest podzielna przez 5 ");
        }

        if(!flaga){
            System.out.println("Liczba "+liczba+" nie ma dzielnikow 2 lub 3 lub 5 ");
        }



    }


}
