import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String id;
    private String title;
    private LocalDate yearOfPublish;
    private String author;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYearOfPublish() {
        return yearOfPublish;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublish(LocalDate yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String id, String title, LocalDate yearOfPublish, String author) {
        this.id = id;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.author = author;
    }

}
