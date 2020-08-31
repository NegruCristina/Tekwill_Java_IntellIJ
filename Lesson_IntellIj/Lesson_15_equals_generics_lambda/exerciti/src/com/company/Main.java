package com.company;
import java.util.function.Consumer;
public class Main {
//am folosit metod reference :: pentru a printa ceea ce este inparanteza cu ajuorul metodei accept din consumer
    public static void main(String[] args) {
Consumer<String> printer=System.out::println;
printer.accept("Hello Word");

/* am facut o interfata pe baza la o clasa user unde este introdusa numele si parola pentru un user
* apoi cu ajutorul la cuvintul new si metod reference noi cream un nou utilizator cu metoda din interface*/
DataBase dataBase=User::new;
User user=dataBase.create("Ion","c87r");
//printam la ecran
        System.out.printf("Name: %s%nPassword: %s", user.getName(), user.getPassword());

    }
}
