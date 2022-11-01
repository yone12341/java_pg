package design_pattern.iterator;

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("abcBook"));
        bookShelf.appendBook(new Book("goodBook"));
        bookShelf.appendBook(new Book("javaBook"));
        bookShelf.appendBook(new Book("finalBook"));

        Iterator it = bookShelf.iterator();

        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }

    }
}
