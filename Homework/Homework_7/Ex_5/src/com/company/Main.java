package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word1 = sc.nextLine();


        int count =0;
        int count1=0;

        for (int i = 0; i < word.length(); i++) {
//aici se verifica daca litera 1 din cuvintul word este egala cu litera 1 din cuvintul word1
            if (word.charAt(i) == word1.charAt(count1)){
                //daca sunt egale se incrementeaza la contorul al 2-lea
                count1++;
                //se verifica care este lungimea cuvintului 2 pentru a se verifica toate literele aparte
                if(count1==word1.length()) {
                    //la primul contor se incrementeaza
                    count++;
                    //daca literele sunt diferite contorul 2 se face 0
                    count1 = 0;
                }
            }
            else {
                count1++;
            }
        }
        System.out.println(count);
    }
}
