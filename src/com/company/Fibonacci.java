package com.company;

public class Fibonacci {
    /**
     * Zaimplementować jako funkcję ciąg Fibonacciego. Warto też poczytać czym jest funkcja rekurencyjna.
     * Algorytm: https://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego
     * Rekurencja: https://pl.wikipedia.org/wiki/Funkcja_rekurencyjna
     * @param
     * @return
     */
    static String FibonacciIteration (){
        int f1=0;
        int f2=1;

        int wynik = 0;
        String nazwa = "It is fibonacci sequence";
            for(int i = 0 ; i<=f1 && f1 <=10.000 ; ++i){
                wynik=f1+f2;
                f1=wynik;
                f2=f2+f1;
                System.out.println(f1);
                System.out.println(f2);

            }
        return nazwa ;
    }


    public static void main(String[] args) {
        System.out.println(FibonacciIteration());


    }
}
