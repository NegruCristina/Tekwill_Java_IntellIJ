package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Katie");
        user.setLastName("Towler");
        System.out.println(user.getFullName());

        User user1 = new User();
        user1.setLastName(null);
        user1.setFirstName("Tom");
        System.out.println(user1.getFullName());
    }
}
