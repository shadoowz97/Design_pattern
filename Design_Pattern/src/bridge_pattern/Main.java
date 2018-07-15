package bridge_pattern;
/*
 * Bridge
 * 
 * abstraction
 * 使用了Implementor的方法定义了基本的功能
 * 该角色中保存了Implementor的角色实例。在示例程序中，由display扮演
 * 
 * RefinedAbstraction 改善后的抽象化
 * 在abstraction中增加了新的功能，由countDisplay扮演
 * 
 * Implementor
 * 定义了用于实现Abstraction角色的接口方法，由DisplayImpl类扮演此角色
 * 
 * ConcreImplementor
 * 负责实现在Implementor中定义的接口，由StringDisplayImpl扮演此角色
 * 
 * 分开后更加容易进行扩展
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello China!"));

		Display d2 = new CountDisplay(new StringDisplayImpl("Hello World!"));

		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Universe!"));

		d1.display();
		d2.display();
		d3.multiDisplay(5);
	}
}
