import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 12, 12);
        Author author = new Author("ABC", "Jhon", "Smith", date);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(author);
        System.out.println(json);
        System.out.println();
        Book book = new Book("AAA", "Power", date, "Joh");
        String json1 = gson.toJson(book);
        System.out.println(json1);
    }
}
