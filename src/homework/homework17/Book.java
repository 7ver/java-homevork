package homework.homework17;

import java.io.Serializable;

class Book implements Serializable {
    public static final long serialVersionUID = 12L;

    private String name;
    private String author;
    private int editionYear;

    Book(String name, String author, int editionYear) {
        this.name = name;
        this.author = author;
        this.editionYear = editionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(short editionYear) {
        this.editionYear = editionYear;
    }
}
