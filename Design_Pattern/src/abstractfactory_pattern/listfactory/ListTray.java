package abstractfactory_pattern.listfactory;

import java.util.Iterator;

import abstractfactory_pattern.factory.Item;
import abstractfactory_pattern.factory.Tray;


public class ListTray extends Tray{
    public ListTray(String caption){
    	super(caption);
    }
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder();
		str.append("<li>\n");
		str.append(caption+"\n");
		str.append("<ul>\n");
		Iterator<Item> it=tray.iterator();
		while(it.hasNext())
			str.append(it.next().makeHTML());
		str.append("</ul>\n");
		str.append("</li>\n");
		return str.toString();
	}

}
