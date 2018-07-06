package iterator_pattern;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int length;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public Book getBookAt(int pos) {
		return books[pos];
	}

	public void appendBook(Book book) {
		books[length++] = book;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
