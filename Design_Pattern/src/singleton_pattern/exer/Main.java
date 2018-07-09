package singleton_pattern.exer;
/*
 * 5-1
 * 见包中文件
 * 
 * 5-2
 * 见包中文件
 * 
 * 5-3
 * 我觉的意思是每个线程在刚开始的时候都会持有一个Singleton的副本，而在一开始，所有线程中拿到的Singleton的副本中
 * singleton都是null
 * 而后开始额度线程拿到的副本中Singleton都不是null
 * 解决的办法是可以在getInstance方法上加上线程锁，或者在方法内部加上对象锁，或者在singlton对象上加上volatile关键字，这样每次使用这个对象就会从主线程中
 * 刷新这个变量
 */
public class Main {
public static void main(String[] args){
	SingletonThread st=new SingletonThread();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
	new Thread(st).start();
}
}
