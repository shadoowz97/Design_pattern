package templatemethod_pattern;
/*
 *类的层次和抽象类
 *
 *父类对子类的要求
 *在子类中可以使用父类中定义的方法
 *可以在子类中实现新的方法以增加新的功能
 *在子类中重写父类的方法可以改变程序的行为
 * 
 * 
 *声明抽象方法通常是为了达到以下目的
 *期待子类趋势线抽象方法
 *要求子类去实现具体方法
 *这种责任被称为子类责任
 *
 *
 * 抽象类的意义
 * 
 * 在抽象阶段确定处理的流程非常重要
 * 
 * 事实上书中指出了相当重要的一点，在使用template——method模式时，我们通常期望除了确定处理流程的类之外的其他类都不能被外界使用
 * 同时我们还应该让这些方法能够被顺利继承，那么应该使用default 或者protect修饰方法
 * */
public class Main {
	public static void main(String[] args) {
       AbstractDisplay display=new CharDisplay('a');
       display.display();
       display=new StringDisplay("Hello World!");
       display.display();
	}

}
