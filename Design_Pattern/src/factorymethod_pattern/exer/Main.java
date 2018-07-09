package factorymethod_pattern.exer;
/*
 * 4-1
 * IDCard的构造函数不声明为public，意思是不希望该类直接通过构造函数生成，因为每创造一个该类的实例，我们可能还需要有一些额外的操作，
 * 我们希望这些操作和创建该类的操作能够绑定，同时不让该类具有这个额外的功能，增加依赖性
 * 
 * 4-2
 * 见包中IDCard类
 * 
 * 4-3
 * public abstract class Product{
 *    public abstract Product(String name);
 *    
 *    public abstract void use();
 *    }
 * 类的构造方法不能是抽象的，抽象类的也不行
 */
public class Main {

}
