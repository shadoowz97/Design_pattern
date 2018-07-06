package iterator_pattern;

public class Demo_Main {
public static void main(String[] args){
	BookShelf bookshelf=new BookShelf(4);
	bookshelf.appendBook(new Book("Around the world in 80 days"));
	bookshelf.appendBook(new Book("Bible"));
	bookshelf.appendBook(new Book("Cinderella"));
    bookshelf.appendBook(new Book("Daddy-Long-Legs"));
    Iterator iterator=bookshelf.iterator();
    while(iterator.hasNext())
    	System.out.println((Book)iterator.next());
}
}
