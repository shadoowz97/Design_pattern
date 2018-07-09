package factorymethod_pattern.exer;
import java.util.HashMap;
import java.util.Map;

import factorymethod_pattern.framework.*;
import factorymethod_pattern.idcard.*;
public class IDCardFactory extends Factory{
    Map<String,IDCard> owners=new HashMap<String,IDCard>();
	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner,getID(owner));
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		IDCard p=(IDCard)product;
		owners.put(p.getID(), p);
	}
	
	private String getID(String owner){
		return owner;
	}

}
