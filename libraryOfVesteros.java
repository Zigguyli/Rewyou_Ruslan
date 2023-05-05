package collection.tasks;

import java.util.HashMap;
import java.util.Map;

public class libraryOfVesteros {
    public static void main(String[] args) {
        Map<Book, String> library = new HashMap<>();
        addBook(library, "Dark Town", "Stephen King", 1982, "2a");
        addBook(library, "Glow", "Stephen King", 1977, "5c");

        showAllBooks(library);

        removeBook(library, "Dark Town", "Stephen King", 1982);
        
        System.out.println();
        showAllBooks(library);
    }

    public static void addBook(Map<Book, String> library, String title, String author, int year, String location ) {
        library.put(new Book(title, author, year), location);
    }

    public static void removeBook(Map<Book, String> library, String title, String author, int year) {
        library.remove(new Book(title, author, year));
    }

    public static void showInfoBook(Map<Book, String> library, String title, String author, int year) {
        System.out.println(library.get(new Book(title, author, year)));
    }

    public static void showAllBooks(Map<Book, String> library) {
        for (Map.Entry<Book, String> entry : library.entrySet()) {
            System.out.println(entry);
        }
    }
}

