package singleton_pattern.exer;

public class Triple {
  private static Triple[] triples;
  static{
	  triples=new Triple[3];
	  triples[0]=new Triple();
	  triples[1]=new Triple();
	  triples[2]=new Triple();
	  
	  
  }
  private Triple(){
	  
  }
  public static Triple getInstance(int id){
	  return triples[id-1];
  }
}
