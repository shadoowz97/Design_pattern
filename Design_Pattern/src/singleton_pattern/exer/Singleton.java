package singleton_pattern.exer;

public class Singleton {
	private static volatile Singleton singleton = null;

	private Singleton() {
		System.out.println("Create a new Instance");
	}

	public static  Singleton getInstance() {
		
			if (singleton == null)
			{
				singleton=new Singleton();
				return singleton;
			}
			else
				return singleton;
		
	}

}
