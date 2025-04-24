package testByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class TestByteArrayInputStream {
public static void main(String[] args) throws IOException {
byte[] tab = "Bonjour CPI2".getBytes();
/*La méthode getBytes() en Java convertit une chaîne de caractères en un tableau d'octets (byte[]).
Elle est utile pour obtenir la représentation binaire d'une chaîne,
notamment lorsqu'il s'agit d'interagir avec des flux d'entrée/sortie, des fichiers, ou des connexions réseau.*/
System.out.println(Arrays.toString(tab));
InputStream stream = new ByteArrayInputStream(tab);
int octet;
while ((octet = stream.read()) != -1) System.out.print((char) octet);
 
}

}
/* import java.io.*;
 public class TestFileInputStream { 
public static void main(String[] args) throws IOException {
 try (InputStream stream = new FileInputStream("fichier.txt")) {     
byte[] buffer = new byte[1024]; int nbRead; 
while ((nbRead = stream.read(buffer)) != -1) {  // ...  } 
}}}*/






//output
/*
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleFlushStream {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("example.bin")) {
            outputStream.write("Bonjour".getBytes());
            outputStream.flush(); // Force les octets à être écrits dans le fichier
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



*/