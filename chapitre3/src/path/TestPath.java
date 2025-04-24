package path;

import java.io.*;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.FileSystems;
import java.nio.file.Files;
public class TestPath{
public static void main(String[]args) throws IOException{
Path ch = Paths.get("D:","Doc","fich.txt");
//En Java, un objet Path est simplement une représentation d’un chemin :
//il ne va pas interroger le système de fichiers à sa création.
System.out.println(ch);
System.out.println(ch.getNameCount());
System.out.println(ch.getParent());//E/Doc
System.out.println(ch.getFileName());//fich.txt
ch=FileSystems.getDefault().getPath("D:","Doc","fich.txt");
System.out.println(ch);
File f = ch.toFile();
// Amélioration : Créer le fichier et les dossiers si nécessaire
File parentDir = f.getParentFile();
if (!parentDir.exists()) {
    parentDir.mkdirs();
}

// Créer le fichier s'il n'existe pas
if (!f.exists()) {
    f.createNewFile();
}



	//Nouveau exemple 
	
 
try (BufferedWriter w = new BufferedWriter(new FileWriter(f,false));
	 BufferedWriter wn= new BufferedWriter(new FileWriter("fichier.txt",false));	
		
		
	) 
{ 	w.write( System.lineSeparator()+"Bonjour broder who are agaain and again");
	//wn.write("alo alo little bro");

} 

 
try( 	InputStream s=new BufferedInputStream(new FileInputStream("D:\\Doc\\fich.txt"));
		Reader news=new BufferedReader(new FileReader("fichier.txt"));
		)//InputStream is abstract
{
	int data; 
	while((data=s.read())!=-1) {
		System.out.print((char)data);
}
	System.out.println("---------------------");
	int newdata;
	while((newdata=news.read())!=-1) System.out.print((char)newdata);
}
}}

 