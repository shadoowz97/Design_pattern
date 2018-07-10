package prototype_pattern.exer;

public abstract class Product implements Cloneable {
  public abstract void use(String s);
  
  public final Product createClone(){
	  Product p=null;
	  try{
		  p=(Product)clone();
	  }
	  catch(CloneNotSupportedException e){
		  e.printStackTrace();
	  }
	  return p;
  }
}
