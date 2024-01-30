public class FictionBook extends Book{
public boolean is_imaginary=true;

    public FictionBook(String title, String author, boolean isbn) {
        super(title, author, isbn);
}
@Override
    public void dispalyInfo(){
    System.out.println("Book Information: ");
        super.dispalyInfo();
    System.out.println("type: FICTION");
    }


    }
