package abstractfactory_pattern;
import abstractfactory_pattern.factory.*;
/*
 * AbstractProduct
 * 负责定义AbstractFactory角色suoshengchengde抽向零件和产品的接口
 * 
 * AbstractFactory
 * 用预定医生成抽象产品de接口
 * 
 * Client
 * 调用 AbstractFactory和AbstrcatProduct来进行工作，但是对具体de工厂，产品和零件一无所知
 * 
 * ConcreteProduct
 * 负责实现产品
 *
 * ConcrFactory
 * 具体的工厂
 * 
 */
public class Main {
	public static void main(String[] args){
		if(args.length!=1){
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory=Factory.getFactory(args[0]);
		Link people=factory.createLink("http://www.people.com.cn/", "People Daily");
		Link gmw=factory.createLink("http://www.gmw.cn", "Bright Daily");
		
		Link us_yahoo=factory.createLink("http://www.yahoo.com", "Yahoo!");
		Link jp_yahoo=factory.createLink("http://www.yahoo.jp", "Yahoo! Japan");
		Link excite=factory.createLink("http://www.excite.com", "Excite");
		Link google=factory.createLink("http://www.google.com", "Google");
		
		Tray trayNews=factory.createTray("Daily paper");
		trayNews.add(people);
		trayNews.add(gmw);
		
		Tray trayYahoo=factory.createTray("Yahoo!");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(jp_yahoo);
		
		Tray traySearch=factory.createTray("Search Engine");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);
		
		Page page=factory.createPage(args[0].substring(args[0].lastIndexOf(".")+1, args[0].length()), "Shadoowz");
		page.add(trayNews);
		page.add(traySearch);
		page.outPut();
		
	}

}
