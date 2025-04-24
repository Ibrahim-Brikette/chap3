package exempleslide184;
import java.io.*; import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path; import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class TestFiles {
public static void main(String[] args) throws IOException {
	/*Path f1 = Paths.get("fich1.txt");
	System.out.println(f1);
	f1=Files.createFile(f1);
	System.out.println("Taille du fichier : " + Files.size(f1));//0
	 try (BufferedWriter writer = Files.newBufferedWriter(f1,   
	StandardOpenOption.WRITE)) 
	{ writer.append("Hello !\n").append("Bye !\n"); }
	 System.out.println("Taille du fichier : " + Files.size(f1));
	 // Copie vers un nouveau fichier
	 Path f2 = Paths.get("fich2.txt");
	 Files.copy(f1, f2);
	// Si le fichier cible (f2) existe déjà, une exception de type FileAlreadyExistsException sera levée par défaut,
	 // Lecture de l'intégralité du fichier
	 List<String> l = Files.readAllLines(f1);
	 //permet de lire tout le contenu d'un fichier texte 
	 //et de retourner les lignes sous forme d'une liste (List<String>)
	 List<String> ll = Files.readAllLines(f2);
	 
	 for(String el:l) System.out.println(el);
	 // Suppression du fichier1
	 Files.deleteIfExists(f1);
	 System.out.println(ll);*/
	 Path f = Paths.get("F.txt");
	 // création du fichier
	 if (!f.toFile().exists()) f  = Files.createFile(f);
	 
	 System.out.println("Taille du fichier : " + Files.size(f));
	 try (BufferedWriter writer = Files.newBufferedWriter(f,   
	StandardOpenOption.WRITE)) 
	{ writer.append("Hello !\n").append("Bye !\n"); }
	 System.out.println("Taille du fichier : " + Files.size(f));//14
	 // Copie vers un nouveau fichier
	 Path f2 = Paths.get("FF.txt");
	 //copy(Path source,Path target)
	 Files.copy(f, f2); //Files.copy(f, f2) ➜ Exception si f2 existe déjà
	 					//🔥 FileAlreadyExistsException si FF.txt existe déjà
	 // Lecture de l'intégralité du fichier
	 List<String> l = Files.readAllLines(f);
	 // Suppression du fichier1
	 Files.deleteIfExists(f);
	 //pour cela je ne trouve pas F
	 System.out.println(l);
 	
	
	
	
	
	
	
	}
}