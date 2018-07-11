package abstractfactory_pattern.tablefactory;
import abstractfactory_pattern.factory.*;
public class TableLink extends Link {
    
	public TableLink(String url, String caption) {
		super(url, caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		String str="";
		str+="<td><a href='"+url+"'>"+caption+"</a></td>";
		return str;
	}

}
