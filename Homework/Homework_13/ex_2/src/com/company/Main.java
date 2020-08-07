package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //noi avem nevoie sa introducem un sir de cuvinte si el trebuie sa le uneasca spatiile si ;
        String[] arr = s.split("; ");

//facem un switch in dependenta de ce introducem aceea ne intoarce
        switch (arr[0]) {
            case "Publication":
                //facem un nou obiect pub.. si aici afisam 1 element din aray
                Publication publication = new Publication(arr[1]);
                System.out.println(publication.getInfo());
                break;
            case "Newspaper":
                //aici deja intoarcem elementul 2 si 3 din aray
                Newspaper newspaper = new Newspapar(arr[1], arr[2]);
                System.out.println(newspaper.getInfo());
                break;
            case "Article":
                Article article = new Article(arr[1], arr[2]);
                System.out.println(args.getInfo());
                break;
            case "Announcement":
                Announcement announcement = new Announcement(arr[2]);
                System.out.println(announcement.getInfo());
                break;
        }


    }
}
