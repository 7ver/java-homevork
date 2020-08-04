package homework.homework17;

import homework.homework15.FileCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Library {
    private final String DIRECTORY_PATH = ".//src//homework//homework17";
    private final String FILE_PATH = "library-storage.dat";

    static final Logger log = LogManager.getLogger(Library.class);

    List<Book> bookList = new ArrayList<Book>();

    Library() {
        setFileHandler();
        getSerializedData();
    }

    private void setFileHandler() {
         File file = new File(DIRECTORY_PATH, FILE_PATH);
         try {
             file.createNewFile();
             log.info("Creating {} file", FILE_PATH);
         } catch(Exception ex) {
             log.error("Creating {} file failed. Error: {}", FILE_PATH, ex);
             System.out.println(ex);
         }
    }

    private void setBooksList(InputStream is) {
        try {
            if(is.available() > 0) {
                ObjectInputStream ois = new ObjectInputStream(is);
                bookList = (List<Book>)ois.readObject();
                log.info("Get data frpm file.");
                ois.close();
            }
        } catch(Exception ex) {
            log.error("File is empty.");
            System.out.println(ex);
        }
    }

    private void getSerializedData() {
        try(InputStream ifs = new FileInputStream(DIRECTORY_PATH + "//" + FILE_PATH)) {
            setBooksList(ifs);
        } catch(Exception ex) {
            log.error("Exeption when trying reading books from {}. {}", FILE_PATH, ex);
            System.out.println(ex);
        }
    }

    public void getBookList() {
        log.info("Getting booklist");
        if (bookList.size() > 0) {
            for(Book book : bookList) {
                System.out.println(book.getName());
            }
            log.debug("Getting {}  books from {}", bookList.size(), FILE_PATH);
        } else {
            System.out.println("Library is empty.");
            log.debug("Trying to get books from {}, but its empty", FILE_PATH);
        }
    }

    public void addBook(String name, String author, int editionYear) {
        Book newBook = new Book(name, author, editionYear);
        log.debug("Trying add a book to {}. With params - Name: {}, author: {}, editionYear: {}", FILE_PATH, name, author, editionYear);

        try(FileOutputStream ofs = new FileOutputStream(DIRECTORY_PATH + "//" + FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(ofs);
        ) {
            log.info("Adding a book to {}", FILE_PATH);
            bookList.add(newBook);
            oos.writeObject(bookList);
            log.debug("Adding a book successful");
        } catch(Exception ex) {
            log.error("Adding a book failed. Ex: {}", ex.toString());
            System.out.println(ex);
        }
    }

    public void removeBook(String name) {
        log.info("Book {} removing", name);
        bookList = getFilteredBookList(name);

        try(FileOutputStream ofs = new FileOutputStream(DIRECTORY_PATH + "//" + FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(ofs);
        ) {
            oos.writeObject(bookList);
            log.debug("Successful");
        } catch(Exception ex) {
            log.error("Book {} removing failed. Error: {}", name, ex.toString());
            System.out.println(ex);
        }
    }

    private List<Book> getFilteredBookList(String name) {
        List<Book> newBookList = new ArrayList<Book>();

        for(Book book : bookList) {
            if(!book.getName().equals(name)) {
                newBookList.add(book);
            }
        }

        return newBookList;
    }
}

