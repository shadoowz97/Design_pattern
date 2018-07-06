package adapter_pattern.class_adapter;
/*
 * Adapter模式中登场的角色
 * Target
 * 该角色负责定义所需的方法即Print接口或者抽象类Print
 * 
 * Client
 * 该角色负使用Target角色所定义的方法进行具体的处理
 * Main类中正是调用Target方法的角色
 * 
 * Adaptee
 * Adaptee是持有既定方法的角色，是被适配的角色，即Banner类，假如Target方法和adaptee中的方法完全相同，那么其实是不需要Adapter类的
 * 
 * Adapter
 * 使用Adaptee已经实现的功能来完成Target方法的需求
 * 
 * 
 * */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}

}
