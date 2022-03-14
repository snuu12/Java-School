package PPJ.cw3;

import java.util.Scanner;

public class Program {

    String rok, miesiac;


    void WczytajDane(){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Podaj miesiąc :");
            miesiac=scanner.nextLine();
            System.out.print("Podaj rok: ");
            rok=scanner.nextLine();




        }


        void WyswietlWynik(){
        int nuemrMiesac=Integer.parseInt(miesiac);
        String kwartal="";

        if (nuemrMiesac==1 || nuemrMiesac==2 || nuemrMiesac==3 ){
            kwartal="III";

        }if (nuemrMiesac==4 || nuemrMiesac==5 || nuemrMiesac==6){
                kwartal="II";

            }if(nuemrMiesac==7 || nuemrMiesac==8 || nuemrMiesac==9){
                kwartal="I";
        }if(nuemrMiesac==10 || nuemrMiesac==11 || nuemrMiesac==12) {
                kwartal = "IV";
            }


            System.out.println(miesiac+"."+rok+" to "+kwartal+" kwartał "+rok+ " roku");


        }

}
