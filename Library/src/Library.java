import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {

    public ArrayList<Book> books = new ArrayList<Book>();

    public void add_book(String name, String author, int year, double price) {

        books.add(new Book(name, author, year, price));

    }

    public void print_all() {

        System.out.printf("Name\t\t Author\t\t Year\t\t Price\n");

        for (Book b : books) {
            System.out.printf("%s\t\t %s\t\t %d\t\t %f\n", b.get_name(), b.get_author(), b.get_year(), b.get_price());
        }

    }

    public void search_by_author(String author) {

        int nr=0;

        for(Book b : books) {
            if(author.equals(b.get_author())) {
                nr++;
                System.out.printf("%s\t\t %s\t\t %d\t\t %f\n", b.get_name(), b.get_author(), b.get_year(), b.get_price());
            }
        }
        if(nr!=0){
            System.out.println("Au fost gasite " + nr + " carti ale autorului " + author);
        } else {
            System.out.println("Nu au fost gasite carti ale autorului " + author);
        }
    }


    public void sort_by_price_ascending() {

        Collections.sort(books);

        System.out.println("Biblioteca sortata crescator dupa pret: ");
        print_all();

    }

    public void remove_book(String name) {
        Book b = null;

        for (Book book : books) {

            if (book.get_name().equals(name)) {
                b = book;

            }

        }
        if (b != null) {

            books.remove(b);
            System.out.println("Cartea cu titlul " + name + " a fost eliminata din biblioteca! ");

        }else{

            System.out.println("Cartea nu a fost gasita!");

        }

    }

}

