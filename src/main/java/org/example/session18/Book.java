package org.example.session18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer numPages;
    private String isbn;

    public Book(String title, String author, Integer numPages, String isbn) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
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
    public Integer getNumPages() {
        return numPages;
    }
    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) &&
               Objects.equals(title, book.title) &&
               Objects.equals(author, book.author) &&
               Objects.equals(numPages, book.numPages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, numPages, isbn);
    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                ']';
    }
}

class Box<T> {
    private T item;

    public Box() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class LibraryDemo{
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book b2 = new Book("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book b3 = new Book("Effective Java", "Joshua Bloch", 416, "978-0134686097");
        System.out.println("b1 equals b2? : " + b1.equals(b2)); //true
        System.out.println("b1 equals b3? : " + b1.equals(b3)); //false
        System.out.println("b1 hashCode: " + b1.hashCode());
        System.out.println("b2 hashCode: " + b2.hashCode());
        System.out.println("b3 hashCode: " + b3.hashCode());

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println("-------------------------------");
        Box<Book> bookBox = new Box<>();
        bookBox.setItem(b1);
        System.out.println("Box contains: " + bookBox.getItem());

        System.out.println("-------------------------------");
        Pair<String, Integer> bookScore = new Pair<>("Clean Code", 9);
        System.out.println("Book Score: " + bookScore.getValue());

        Book b4 = new Book ("Apocalipsa", "S,K", 1000, "978-606-123456-7");
        Pair<String, Book> favoriteBook = new Pair<>("Apocalipsa", b4);
        System.out.println("Favorite Book: " + favoriteBook);

        System.out.println("--------------------------------");
        Map<Book, Integer> inventory = new HashMap<>();
        inventory.put(b1, 10);
        inventory.put(b3, 4);
        inventory.put(b2, 15);
        System.out.println("Inventory: "+ inventory);

        for (Map.Entry<Book, Integer> entry : inventory.entrySet()) {
            System.out.println("Book: " + entry.getKey() + " with HashCode: "+ entry.getKey().hashCode() + ", Quantity: " + entry.getValue());
        }

    }
}
