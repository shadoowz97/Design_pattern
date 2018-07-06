package iterator_pattern;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;

	private int index;

	public BookShelfIterator(BookShelf bs) {
		this.bookShelf = bs;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < bookShelf.getLength() ? true : false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return bookShelf.getBookAt(index++);
	}
}
