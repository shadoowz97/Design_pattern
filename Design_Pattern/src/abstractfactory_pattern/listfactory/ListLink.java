package abstractfactory_pattern.listfactory;

import abstractfactory_pattern.factory.*;

public class ListLink extends Link {

	public ListLink(String url, String caption) {
		super(url, caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return " <li><a href='" + url + "'>" + caption + "</a></li>\n";
	}

}
