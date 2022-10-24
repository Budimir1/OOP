package Pr7KGG;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class Book implements Comparable<Book> {

    private String author;
    private String name;
    private int year=0;
    public void Book(String author, String name, int year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    public String getName(){return name;};
    public String getAuthor(){return author;};
    public int getYear(){return year;};
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return author + "\n" + name + "\n" + year;
    }

    @Override
    public int compareTo(Book o) {
        int result = this.year.compareTo(o.year);
        return result;
    }
}
