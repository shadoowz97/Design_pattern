package adapter_pattern.class_adapter;

public class Main {
public static void main(String[] args){
	Print p=new PrintBanner("Hello");
    p.printWeak();
    p.printStrong();
}
}
