package factorymethod_pattern;

import factorymethod_pattern.framework.*;
import factorymethod_pattern.idcard.*;
/*
 * 工厂模式中的角色
 * 
 * Product 
 * 抽象的产品定义，属于框架一方
 * 
 * Creator
 * 抽象的工厂定义，负责生成抽象类的实体的定义，正像templatemethod中所说，抽象类负责定义某些方法的内部过程
 * 
 * ConcreteProduct
 * 具体的产品
 * 
 * ConcreteFactory
 * 具体的工厂
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();

		Product card1 = factory.create("Bill");
		Product card2 = factory.create("Lily");
		Product card3 = factory.create("Bob");
		card1.use();
		card2.use();
		card3.use();
	}
}
