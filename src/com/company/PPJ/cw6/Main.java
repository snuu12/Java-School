package com.company.PPJ.cw6;

public class Main {

    public static void main(String[] args) {
	/*
	test zadanie 1
        int [] tab1={1,2,3,4,5};
	    int [] tab2={6,7,8};
	    int [] tab3=mergeArrays(tab1,tab2);

        for (int i = 0; i <tab3.length ; i++) {
            System.out.println(tab3[i]);

        }

	 */
	/*
	Zadanie 2 test
        System.out.println(getFibonacci(7));

	 */

//Zadanie 3 test
       // System.out.println(areAnagrams("banana","aaannb"));

        System.out.println(isPalindrom("zarazz"));

        }


//zadanie 1
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] tab = new int[arr1.length+arr2.length];

        for (int i = 0; i <arr1.length ; i++) {
            tab[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            tab[arr1.length+i]=arr2[i];
        }

        return tab;


    }
    // Zadanie 2
    public static int getFibonacci(int sequenceIndex){

        int temp0=0;
        int temp1=1;
        int temp;

    if (sequenceIndex==0 || sequenceIndex==1 )
    {

        return sequenceIndex;

    }else{


        for (int i = 2; i <=sequenceIndex ; i++) {
            temp=temp0+temp1;
            temp0=temp1;
            temp1=temp;
        }

        return temp1 ;
    }
    }


    //zadanie 3
    public static boolean areAnagrams(String s1, String s2){
        boolean anagrams=true;

        if (s1.length()!=s2.length()){

            anagrams=false;
        }else {

            char[] s1tab = s1.toLowerCase().toCharArray();
            char[] s2tab = s2.toLowerCase().toCharArray();
            sortTab(s1tab);
            sortTab(s2tab);


            for (int i = 0; i <s1.length() ; i++) {
                if(s1tab[0]!=s1tab[0]){
                    anagrams=false;
                }
            }
        }

        return anagrams;
    }


    public static char[] sortTab(char[] arr){

        char temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return arr;
    }

    //zadanie 4
    public static boolean isPalindrom(String s1) {


        String reverses1 = "";

        int lenth = s1.length();

        for (int i = (lenth - 1); i >= 0; --i) {
            reverses1 = reverses1 + s1.charAt(i);
        }



        return s1.equals(reverses1);
    }

//zadanie 5
public static int dividers(int[] arr, int n){
int tmp=0;

    for (int i = 0; i <arr.length ; i++) {
        tmp+=arr[i];
    }

return tmp/n;
}

}






