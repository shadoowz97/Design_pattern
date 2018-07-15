package bridge_pattern.exer;

import java.util.Random;

import bridge_pattern.CountDisplay;
import bridge_pattern.DisplayImpl;

public class RandomCountDisplay extends CountDisplay {

	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void randomDisplay(int times){
		multiDisplay(new Random().nextInt(times));
	}

}
