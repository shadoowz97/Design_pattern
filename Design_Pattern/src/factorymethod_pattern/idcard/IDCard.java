package factorymethod_pattern.idcard;

import factorymethod_pattern.framework.*;

public class IDCard extends Product {
	private String owner;

	IDCard(String owner) {
		System.out.println("make " + owner + "'s ID Card");
		this.owner = owner;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("use " + owner + "'s ID Card ");
	}

	public String getOwner() {
		return owner;
	}
}
