package abstractfactory_pattern.factory;

public abstract class Factory {
   public static Factory getFactory(String className){
	   Factory factory=null;
	   try{
		   factory=(Factory)Class.forName(className).newInstance();
	   }catch(ClassNotFoundException e){
		   System.out.println("Cannot find "+className);
		   
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return factory;
   }
   
   public abstract Link createLink(String url,String caption);
   public abstract Tray createTray(String caption);
   public abstract Page createPage(String title,String author);
}
