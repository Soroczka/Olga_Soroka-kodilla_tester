public class Book {
    private String author;
    private String title;
    private static Book Book;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title){
       return Book;
    }

}
