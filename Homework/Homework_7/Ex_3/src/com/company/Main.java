package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	String word2=sc.nextLine();
	//eliminam spatiile libere din cuvintele care le introducem
	String finalWord=word.trim();
	String finalWord2=word2.trim();
//comparam cuvintele introduse de utilizator sa fie egale eliminind spatiile libere
if(finalWord.equals(finalWord2)){
	System.out.println(true);

}
else System.out.println(false);

/*alta varianta de rezolvare
boolean rez =(finalWord.equals(finalWord2));
		System.out.println(rez);
*/
		//alta varianta de afisare
		// System.out.println(finalWord.equals(finalWord2));
    }
}
//nu s-a primit rezolvarea