import java.util.ArrayList;

public class Book implements Comparable {

    public String book_name;
    public String book_author;
    public int book_year;
    public double book_price;

    public Book(String name, String author, int year, double price) {

        this.book_name = name;
        this.book_author = author;
        this.book_year = year;
        this.book_price = price;

    }

    public String get_name() {

        return this.book_name;
    }

    public String get_author() {

        return this.book_author;
    }

    public int get_year() {

        return this.book_year;

    }

    public double get_price() {

        return this.book_price;

    }

    @Override
    public int compareTo(Object b) {

        int compareprice = (int)((Book)b).get_price();

        return (int)this.book_price-compareprice;
    }

    @Override
    public String toString() {

        return ("%s\t %s\t %d\t %f\n" + this.book_name + this.book_author + this.book_year + this.book_price);

    }


    public void search(String name) {

        if(name.equals(this.book_name)) {

            System.out.println("Cartea cu titlul " + name + " exista in biblioteca!");

        } else {
            System.out.println("Cartea cu titlul " + name + " NU exista in biblioteca!");
        }

    }



}
