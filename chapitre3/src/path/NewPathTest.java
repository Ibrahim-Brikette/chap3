package path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NewPathTest {

	public static void main(String[] args) throws IOException {
		Path newch=FileSystems.getDefault().getPath("D:","Doc","two","fichier.txt");
		File newf=newch.toFile();
		File parentD=newf.getParentFile();
		if(!parentD.exists()) parentD.mkdirs();
		if(!newf.exists()) newf.createNewFile();
		try(BufferedWriter neww=new BufferedWriter(new FileWriter(newf,false))
			 
			){
			neww.write("hello ma man how are you"+System.lineSeparator()+"no way!!!!!!!!");
			
			
			
		}
		 
		List<String> l=Files.readAllLines(newch);
		System.out.println(l.toString());
	 

	}

}
