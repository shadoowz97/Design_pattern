package adapter_pattern.exer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO{
    Properties prop;
    public FileProperties(){
    	prop=new Properties();
    }
	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		prop.load(new FileInputStream(filename));
		
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		prop.store(new FileOutputStream(filename), "#written by FileProperties\r\n#2018/07/06");
	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		prop.setProperty(key, value);
	}

	@Override
	public void getValue(String key) {
		// TODO Auto-generated method stub
		prop.getProperty(key);
	}

}
