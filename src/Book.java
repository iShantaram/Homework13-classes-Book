public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublishing;

    Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    Book (String name, Author author) {
        this(name, author, 0);
    }

    public String toString() {
        return "Книга " + this.getName() + ", автор " + this.getAuthor() + ", год издания " + this.getYearOfPublishing();
    }
    public String getName() {
        return "\"" + name + "\"";
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }
}
