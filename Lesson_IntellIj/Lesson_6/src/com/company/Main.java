package com.company;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
            int n = 4;
            int[] numbers = new int[n];


            float[] floatNumbers;
            floatNumbers = new float[]{1.2f, 1.5f, 1.6f, 1.7f};


            int[] array = {1, 5, 7, 9};
            int lenght = array.length;
            System.out.println(lenght);

//pentru fiecare index adaugam in anumite poziti numere care dorim
            int[] number = new int[7];
            number[0] = 1;
            number[1] = 7;
            number[2] = 2;
            System.out.println(number);

//afisam numerele intr-un string
            byte[] famousNumber;
            famousNumber = new byte[]{1, 7, 2, 8, 9};
            String arrayAsString = Arrays.toString(famousNumber);
            System.out.println(famousNumber);



//aranjam numerele in ordine crescatoare
            int[] bigNumers;
            bigNumers = new int[]{17, 1, 12, 5, 6, 8};
            Arrays.sort(bigNumers);
            System.out.println(Arrays.toString(bigNumers));

// putem adauga intr-un loc anumit un element care vrem noi cu cifre litere si cite dorim,
//de unde pina unde se va repeta
            int size = 10;
            char[] characters = new char[size];
            Arrays.fill(characters, 0, size / 2, 'A');
            Arrays.fill(characters, 3, size, 'B');
            System.out.println(characters);

//folosim for pentru a imnulti fiecare numar cu el in dependenta de cite numere sunt in aray
            int m = 10;
            int[] squares = new int[m];
            System.out.println(Arrays.toString(squares));

            for (int i = 0; i < squares.length; i++) {
                    squares[i] = i * i;

            }
            System.out.println(Arrays.toString(squares));



//acest program nu stie cite numere sunt in aray, dar noi vrem sa comparam cu un if rezultatele in dependenta
// de cite numere sunt in aray, aici se face comparatie daca broke este true ne da 1  varianta, daca false a 2.

            int[] num = {1, 8, 9, 7, 2, 3, 0, 4, 6, 5};
            boolean broke = true;
            for (int i = 1; i < num.length; i++) {
                    if (num[i] < num[i - 1]) {
                            broke = false;
                            break;
                    }
            }
                    if (broke) {
                            System.out.println("Broke");
                    } else {
                            System.out.println("oK");
                    }



//acest program daca nu stim precis ce lungime are un aray folosim scaner ca permanent sa schimbam numarul de aray
                    Scanner sc = new Scanner(System.in);
                    int len =sc.nextInt();
                    int[] aray =new int[len];
            for (int i = 1; i < len; i++) {
                    aray[i]=sc.nextInt();
                    
            }
            System.out.println(Arrays.toString(aray));



//acest program numara daca se repeta un anumit caracter
    char [] ch={'a','s','d','v','b'};
    int counter=0;
    for(char caracter:ch){
            if(caracter=='a')counter++;
    }
            System.out.println(counter);






    }

}
