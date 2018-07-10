package builder_pattern.exer;

public class Main {
 public static void main(String[] args){
	 if(args.length!=1){
		 usage();
		 System.exit(0);
	 }
	 if(args[0].equals("plain")){
		 TextBuilder textbuilder=new TextBuilder();
		 Director director=new Director(textbuilder);
		 director.construct();
		 String result=textbuilder.getResult();
		 System.out.println(result);
	 }
	 else if(args[0].equals("html")){
		 HTMLBuilder htmlBuilder=new HTMLBuilder();
		 Director director=new Director(htmlBuilder);
		 director.construct();
		 String filename=htmlBuilder.getResult();
		 System.out.println(filename);
	 }
	 else{
		 System.exit(0);
	 }
 }
 
 public static void usage(){
	 System.out.println("Usage: java Main plain");
	 System.out.println("Usage: java Main html");
 }
}
