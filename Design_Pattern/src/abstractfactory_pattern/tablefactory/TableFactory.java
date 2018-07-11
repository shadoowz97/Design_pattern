package abstractfactory_pattern.tablefactory;

import abstractfactory_pattern.factory.Factory;
import abstractfactory_pattern.factory.Link;
import abstractfactory_pattern.factory.Page;
import abstractfactory_pattern.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String url, String caption) {
		// TODO Auto-generated method stub
		return new TableLink(url, caption);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new TablePage(title, author);
	}

}
