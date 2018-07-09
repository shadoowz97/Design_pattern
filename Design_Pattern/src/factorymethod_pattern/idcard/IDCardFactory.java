package factorymethod_pattern.idcard;

import java.util.ArrayList;
import java.util.List;

import factorymethod_pattern.framework.*;

public class IDCardFactory extends Factory {
	private List<IDCard> owners = new ArrayList<IDCard>();

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub

		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add((IDCard) product);
	}

	public List<IDCard> getOwners() {
		return owners;
	}

}
