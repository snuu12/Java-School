package PPJ.cw3;

import java.util.Scanner;

public class Kalendarz {

    String rok;





    void WczytajDanne(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Wprowadz rok : ");
        rok=scanner.nextLine();

    }

    void sprawdzCzyRokjestPrzestepny(){
        int rok1=Integer.parseInt(rok);

     if (((rok1 % 4 == 0) && (rok1 % 100 != 0)) || (rok1 % 400 == 0)){
         System.out.println(rok+" jest przestępny");
        }else {
         System.out.println(rok+ " nie jest przestępny");
     }
    }



}
