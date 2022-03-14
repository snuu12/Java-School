package com.company.PPJ.cw7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //zdanie 2
        ArrayList<String> words = new ArrayList<>();
        words.add("ala");
        words.add("dog");
        words.add("cat");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");

        //   System.out.println(getSentenceMostOccurredWord(words));

        //zadanie3
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        sequence.add(2);
        sequence.add(3);
        sequence.add(5);
        sequence.add(4);

        // System.out.println(sequence.get(5));
        //   System.out.println(getLastUnique(sequence));


        //zadanie codila

        String tmp[] = {"BILL", "BOB"};
        String tmp1 = "BILLOBILLOLLOBBI";

        //System.out.println(solution(tmp1, tmp));
        System.out.println(containsWordsIndexOf(tmp1,tmp));

    }

    //metoda do zadania 1
    public static String getSentenceMostOccurredWord(ArrayList<String> sentence) {

        String word = "dog";
        int frequency = 1;
        int tmp = 1;


        for (String s : sentence) {
            frequency = Collections.frequency(sentence, s);

            if (frequency > tmp) {
                tmp = frequency;
                word = s;
            }

        }


        if (frequency == tmp) {
            word = "Wszytskie słowa występują tylko raz";
        }

        return word;

    }


    //metoda do zadania 3

    public static Integer getLastUnique(ArrayList<Integer> sequence) {
        int number = 0;
        int frequency = 1;
        int tmp = sequence.size() - 1;
        boolean found = false;

        while (found == false) {

            frequency = Collections.frequency(sequence, sequence.get(tmp));

            if (frequency == 1) {
                found = true;
                number = sequence.get(tmp);
            }
            tmp--;
        }

        return number;

    }

    public static int solution(String S, String[] L) {
        boolean tmp = true;
        int count = 0;
        for (int i = 0; i < L.length; i++) {

            if (S.contains(L[i])) {
                tmp = true;

            } else {
                tmp = false;
            }

        }
        if (tmp == false) {

            return 0;
        }
        if (S.matches("\\bkeyword\\b")) {/*BILL*/}

        return count;
    }

    public static boolean containsWordsIndexOf(String inputString, String[] words) {
        String str = inputString;
        int count=0;
        String tmp11="";
        char[] charSearch = words[0].toCharArray();

        for(int i=0; i<str.length(); i++)
        {
            char chr = str.charAt(i);
            for(int j=0; j<charSearch.length; j++)
            {
                if(charSearch[j] == chr)
                {
                   tmp11+=charSearch[j];
                    System.out.println("Char Value "+charSearch[j]+" is present in "+str+" "+tmp11);
                    if(tmp11.equals(words[0])){
                        count++;
                        System.out.println(count);
                        tmp11="";

                    }
                }

            }
        }
        System.out.println(count);
        return true;
    }

}
