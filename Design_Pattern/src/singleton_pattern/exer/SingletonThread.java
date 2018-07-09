package singleton_pattern.exer;

import java.util.HashSet;
import java.util.Set;

public class SingletonThread implements Runnable {
    Set<Singleton> set=new HashSet<Singleton>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
	set.add(Singleton.getInstance());
	System.out.println("size of set is "+set.size());
	}

}
