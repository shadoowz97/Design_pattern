package adapter_pattern.object_adapter;

public class Main {
    public static void main(String[] args){
    	Print p=new PrintBanner("Hello");
    	p.printStrong();
    	p.printWeak();
    }
}
