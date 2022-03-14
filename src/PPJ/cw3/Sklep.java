package PPJ.cw3;

import java.util.Random;
import java.util.Scanner;

public class Sklep {
    double cena;




     void WroadzIlośćProduktów(){
        Random losowana=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ilość poduktów");
        String ilość=scanner.nextLine();
        int promocja=losowana.nextInt(2);
        int ilosc2 = Integer.parseInt(ilość);
        cena=10.0;


        // czy jest promocja
         if  (promocja==0){
             cena= (cena*Double.parseDouble(ilość));
             cena=cena*1.1;


         }
         if ((promocja==1 ) || ilosc2>10) {
            cena=cena/2.0;

         }else
             cena=cena*ilosc2;

         }






    }


