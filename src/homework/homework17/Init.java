package homework.homework17;

public class Init {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book2", "Iam", 2020);
//        library.removeBook("Book2123123123123");
        library.getBookList();
    }
}
