package com.company;


public class Main {

    public static void main(String[] args) {
        //aici interfata intoarce true daca se imparte la 2
        Expression func = (n) -> n % 2 == 0;
        int[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(numb, func));

    }

    //aceasta metoda face suma la numere, dar verifica a doua conditie
    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        //aici se trece prin aray si se verifica daca se indeplineste conditiadin func
        // si cu metoda isEqual si tot se aduna fiecare numar in aray
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

//aceasta interfata intoarce true daca conditia din paranteza este adevarata
}

interface Expression {
    boolean isEqual(int n);
}
