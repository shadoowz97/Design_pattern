package abstractfactory_pattern.tablefactory;

import java.util.Iterator;

import abstractfactory_pattern.factory.Item;
import abstractfactory_pattern.factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("<td>");
		str.append("<table width='100%' border='1'><tr>");
		str.append("<td bgcolor='#cccccc' align='center' colspan='" + tray.size() + "'> <b>");
		str.append(caption + "</b></td>");
		str.append("</tr>\n");
		str.append("<tr>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext())
			str.append(it.next().makeHTML());
		str.append("</tr></table>");
		str.append("</td>");
		return str.toString();
	}

}
