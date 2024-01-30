public class Main {
    public static void main(String[] args) {

        Book[] library = new Book[3];
        library[0] = new FictionBook("secret", "lindaMagic",true);
        library[1] = new NonFictionBook("the secret of M.Mindset", "T harv eker",true);
        library[2] = new Book("all the bright places", "messi",false);

        for (Book v: library){
            v.dispalyInfo();
            System.out.println("------------------");
    }
    }
}