package bridge_pattern.exer;

import bridge_pattern.CountDisplay;

/*
 * 9-1
 * 见randomCountDisplay
 * 
 */
public class Main {
public static void main(String[] args){
	CountDisplay d=new CountDisplay(new FileDisplayImpl("file.txt"));
	d.multiDisplay(3);
}
}
