package prototype_pattern;

import prototype_pattern.framework.*;
/*
 * Prototype 模式中登场的角色
 * 
 * Prototyep（原型）
 * Product角色负责定义用于复制现有实例来生成新实例的方法，在示例程序中，有Product接口扮演此角色
 * 
 * ConcrePrototype（具体的原型）
 * 该角色负责实现和复制现有实例并生成新实例的方法。在实例程序中，由Message Box和underline Pen扮演此角色
 * 
 * Client
 * 负责使用复制实例的方法生成新实例 由manager类扮演此角色
 * 
 * prototypr是一种实际上的解耦方式，通过统一的字符串就可以得到不同的实例
 */
public class Main {
	public static void main(String[] args) {
		Object b;
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		Product p1 = manager.create("strong message");
		p1.use("Hello World.");
		Product p2 = manager.create("warning box");
		p2.use("Hello World.");
		Product p3 = manager.create("slash box");
		p3.use("Hello World.");
	}
}
