package com.company;

public class Main {

    public static void main(String[] args) {
        //am initializat un user
        User user = new User();
        user.setName("John Grant");
//cu ajutorul superclasei la user am setat pntru el id si version
        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);

        WebSite webSite = new WebSite();
        webSite.setUrl("www.com");

        BaseEntity siteEntity = webSite;
        siteEntity.setId(101);
        siteEntity.setVersion(1);

        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(webSite);

        BaseEntity baseVisit=visit;
        baseVisit.setId(102);
        baseVisit.setVersion(1);
//cu metoda toString am printat la ecran datele despre user
        System.out.println(user.toString());
        System.out.println(webSite.toString());
        System.out.println(visit.toString());

    }
}
