package out;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try()==try-with-resources
		//with "try-with-resources"
		//the resources will be automatically closed
		try (
				PrintStream ps=new PrintStream(new FileOutputStream("exemple.txt"));
				OutputStream out=new FileOutputStream("in.txt");
				OutputStream path=new FileOutputStream("C:\\Users\\ASUS\\Desktop\\java\\javaAvancé\\path.txt");
				InputStream in=new FileInputStream("C:\\Users\\ASUS\\Desktop\\java\\javaAvancé\\path.txt");
				Writer w=new FileWriter("r.txt",false);
				Reader r=new InputStreamReader(in);
				Reader rr=new FileReader(Paths.get("C:\\Users\\ASUS\\Desktop\\java\\javaAvancé\\path.txt").toFile());
			 
				){
	ps.println("Bonjour cpi2 ".getBytes());
	ps.println("Bonjour cpi2 " );
	out.write("Hello my broder how are you".getBytes());//int or bytes[] no char broder
	path.write("yeah boy commme one".getBytes());
	path.write("i write this one using a path progress".getBytes());
	int b;
	//while (( b = in.read()) != -1) System.out.print((char)b );
	w.write("ibrahim is him" );
	int nr;
	System.out.println(Files.readAllLines(Paths.get("C:\\Users\\ASUS\\Desktop\\java\\javaAvancé\\path.txt")));
	while((nr=r.read())!=-1) System.out.print((char)nr );
	System.out.println();
	StringWriter writer = new StringWriter();
	 writer.append("Bonjour") 
	.append(' ') 
	.append("CPI2"); 
	System.out.println(writer.toString());    
	
	
	 LineNumberReader rl = 
			 new LineNumberReader(new StringReader("abc\nd"));//\n==new line even it is in a string
			  String l;
			  while ((l = rl.readLine()) != null)
			  System.out.println(l);
			  System.out.println("Nombre de lignes lues: " + rl.getLineNumber());
}
catch(IOException e) {
	System.out.println("bla bla");
}
		
	}

}
