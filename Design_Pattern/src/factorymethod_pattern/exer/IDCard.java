package factorymethod_pattern.exer;
import factorymethod_pattern.framework.*;
public class IDCard  extends Product{
    private String owner;
    private String id;
    IDCard(String owner,String id){
    	this.owner=owner;
    	this.id=id;
    }
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("use "+owner+"'s card");
	}
	
	public String getID(){
		return id;
	}
	
	public String getOwner(){
		return owner;
	}

}
