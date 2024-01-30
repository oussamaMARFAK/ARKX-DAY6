public class Book {
    private String title;
    private String author;
    private boolean isbn;

    public Book() {
    }

    public Book(String title, String author, boolean isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIsbn() {
        return isbn;
    }

    public void setIsbn(boolean isbn) {
        this.isbn = isbn;
    }
    public void dispalyInfo(){

        System.out.println("author: "+getAuthor());
        System.out.println("title: "+getTitle());

    }
}
