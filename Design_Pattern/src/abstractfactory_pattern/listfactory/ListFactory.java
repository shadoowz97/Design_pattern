package abstractfactory_pattern.listfactory;
import abstractfactory_pattern.factory.*;
public class ListFactory extends Factory{

	@Override
	public Link createLink(String url, String caption) {
		// TODO Auto-generated method stub
		return new ListLink(url,caption);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new ListPage(title,author);
	}

}
