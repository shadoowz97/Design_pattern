package abstractfactory_pattern.listfactory;
import java.util.Iterator;

import abstractfactory_pattern.factory.*;
public class ListPage extends Page{
    public ListPage(String title,String author){
    	super(title,author);
    }
	@Override
	public String makeHTML() {
		StringBuilder str=new StringBuilder();
		str.append("<html><head><title>"+title+"</title></head>\n");
		str.append("<body>\n");
		str.append("<h1>"+title+"</h1>");
		str.append("<ul>\n");
		Iterator<Item> it= content.iterator();
		while(it.hasNext())
			str.append(it.next().makeHTML());
		str.append("</ul>\n");
		str.append("<hr><adress>"+author+"</adress></hr>");
		str.append("</body></html>\n");
		// TODO Auto-generated method stub
		return str.toString();
	}

}
