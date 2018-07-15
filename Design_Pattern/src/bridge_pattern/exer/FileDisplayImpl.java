package bridge_pattern.exer;

import bridge_pattern.DisplayImpl;
import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT=4096;
    public FileDisplayImpl(String filename){
    	this.filename=filename;
    }
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		try{
			reader=new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READAHEAD_LIMIT);
		}catch(IOException e){
			e.printStackTrace();
			
		}
		System.out.println("============"+filename+"=============");
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		try{
			String line;
			reader.reset();
			while((line=reader.readLine())!=null)
				System.out.println("> "+line);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		System.out.println("===========");
		try{
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
