public class Main {

    public static void main(String[] args) {

        Library b = new Library();

        b.add_book("Animale fantastice", "JK Rowling", 2015, 15.99);
        b.add_book("Raiul gainilor", "Dan Lungu", 2008, 10.99);
        b.add_book("Razvratitii", "Cristina Nemerovschi", 2019, 13.99);
        b.add_book("my book", "anonim", 2005, 7.99);

        b.print_all();

        b.sort_by_price_ascending();

        b.search_by_author("JK Rowling");

        b.remove_book("my book");

        b.print_all();

    }
}
