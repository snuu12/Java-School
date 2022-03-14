package PPJ.cw4;

import java.util.Scanner;

public class PolaFigur {
    int opcja=0;
    double dlugoscPodstawyDolnej;
    double dlugoscPodstawyGornej;
    double dlugoscwysokosci;
    double pole;


    public void stratPrgram(){

        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);

        System.out.println("Program służy do obliczenia pola figur:");
        System.out.println("1 - Prostokonta");
        System.out.println("2 - Kwadratu");
        System.out.println("3 - Trójkąta");
        System.out.println("4 - Rombu");
        System.out.println("5 - Równolegloboku ");
        System.out.println("6 - Trapezu");

        System.out.print("wpisz nuper figury która cię interesuje :");
        opcja=sc.nextInt();
        if ( opcja>6){
            opcja=0;
        }


        switch (opcja){
            case 0:
                System.out.println("#########################################################");
                System.out.println();
                System.out.println("!!!!!      Proszę wybrać liczbę od 1 do 6         !!!!!! ");
                System.out.println();
                System.out.println("#########################################################");
                System.out.println("_________________________________________________________");
                stratPrgram();
                break;


            case 1:
                System.out.println(" ");
                System.out.println("Wybrałeś ptostokąt");
                System.out.print("Podaj dlugość podstawy dolenj :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.print("Podaj długośc wysokości :");
                dlugoscwysokosci=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleProstokonta(dlugoscPodstawyDolnej,dlugoscwysokosci) );

                break;

            case 2:
                System.out.println(" ");
                System.out.println("Wybrałeś kawdrat");
                System.out.print("Podaj dlugość boku :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleKawdratu(dlugoscPodstawyDolnej));
                break;

            case 3:
                System.out.println(" ");
                System.out.println("Wybrałeś trójkąt");
                System.out.print("Podaj dlugość podstawy dolnej :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.print("Podaj długość wysokości");
                dlugoscwysokosci=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleTrojkata(dlugoscPodstawyDolnej,dlugoscwysokosci));
                break;

            case 4:
                System.out.println(" ");
                System.out.println("Wybrałeś romb");
                System.out.print("Podaj dlugość podstawy dolnej :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.print("Podaj długość wysokości");
                dlugoscwysokosci=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleRombu(dlugoscPodstawyDolnej,dlugoscwysokosci));
                break;

            case 5:
                System.out.println(" ");
                System.out.println("Wybrałeś równoległobok");
                System.out.print("Podaj dlugość podstawy dolnej :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.print("Podaj długość wysokości");
                dlugoscwysokosci=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleRównoległoboku(dlugoscPodstawyDolnej,dlugoscwysokosci));
                break;

            case 6:
                System.out.println(" ");
                System.out.println("Wybrałeś Trapez");
                System.out.print("Podaj dlugość podstawy dolnej :");
                dlugoscPodstawyDolnej=sc2.nextDouble();
                System.out.print("Podaj długośc podstawy górnej :");
                dlugoscPodstawyGornej=sc2.nextDouble();
                System.out.print("Podaj długość wysokości :");
                dlugoscwysokosci=sc2.nextDouble();
                System.out.println(" ");
                System.out.println("Pole jest równe : "+  PoleTrapezu(dlugoscPodstawyDolnej,dlugoscPodstawyGornej,dlugoscwysokosci));
                break;









        }

    }

    public  double PoleTrapezu( double a, double b , double h){

        return 0.5*(a+b)*h;
    }

    public double PoleProstokonta(double a,double b) {

        return PoleTrapezu(a, a, b);
    }


    public double PoleTrojkata ( double a , double h){

        return PoleTrapezu(a,0,h);
    }

    public  double PoleKawdratu ( double a ){

        return PoleTrapezu(a,a,a);
    }

    public  double PoleRombu ( double a ,double h){

        return PoleTrapezu(a,a,h);
    }

    public  double PoleRównoległoboku ( double a,double h ){

        return PoleTrapezu(a,a,h);
    }



}
