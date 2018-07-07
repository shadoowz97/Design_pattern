package templatemethod_pattern;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		width = string.length();
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}

	private void printLine() {
		String str = "+";
		for (int i = 0; i < width; i++)
			str += "-";
		str += "+";
		System.out.println(str);
	}

}
