package singleton_pattern;

public class Main {
     public static void main(String[] args){
    	 System.out.println("Start.");
    	 Singleton s1=Singleton.getInstance();
    	 Singleton s2=Singleton.getInstance();
    	 if(s1==s2)
    		 System.out.println("s1 and s2 are the refference to the same Object");
    	 else
    		 System.out.println("s1 and s2 are different");
    	 System.out.println("End.");
     }
}
