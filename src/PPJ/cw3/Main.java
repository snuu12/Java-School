package PPJ.cw3;

public class Main {

    public static void main(String[] args) {

//zadanie 1
        System.out.println("ZADANIE 1");
        Student s1 = new Student();

        s1.pobierzDaneStudenta();

        s1.wyświetlDane();

        System.out.println("___________________________________");

// zadanie 2
        System.out.println("ZADANIE 2");
        Program zd2=new Program();
        zd2.WczytajDane();
        zd2.WyswietlWynik();

        System.out.println("___________________________________");


        // zadanie 3
        System.out.println("ZADANIE 3");
        Kalendarz k3=new Kalendarz();
        k3.WczytajDanne();
        k3.sprawdzCzyRokjestPrzestepny();
        System.out.println("___________________________________");


        //zadanie4
        System.out.println("ZADANIE 4");
        Sklep s4=new Sklep();
        s4.WroadzIlośćProduktów();
        System.out.println("___________________________________");

// zadanie 5
        System.out.println("ZADANIE 5");
        Muzyka m5=new Muzyka();
        m5.PobierzDane();
        m5.WyświetlDanne();
        System.out.println("___________________________________");

    }




    }

