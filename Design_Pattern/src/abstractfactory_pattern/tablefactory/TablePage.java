package abstractfactory_pattern.tablefactory;

import java.util.Iterator;

import abstractfactory_pattern.factory.Item;
import abstractfactory_pattern.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("<html><head><title>" + title + "</title></head>\n");
		str.append("<body>\n");
		str.append("<h1>" + title + "</h1>");
		str.append("<table width='80%' border='3'>\n");
		Iterator<Item> it = content.iterator();
		while (it.hasNext())
			str.append(it.next().makeHTML());
		str.append("</table>");
		str.append("<hr><address>" + author + "</address>");
		str.append("</body></html>\n");
		return str.toString();

	}

}
