public class NonFictionBook extends Book{

    public NonFictionBook(String title, String author, boolean isbn) {
        super(title, author, isbn);
    }

    @Override
    public void dispalyInfo(){
        System.out.println("Book Information:");
        super.dispalyInfo();
        System.out.println("type: NonFICTION");
    }

}
