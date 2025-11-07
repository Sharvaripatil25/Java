import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;

public class file1 {
  public static void main(String[] args) {
          File ob = new File("filename.txt"); // Create File object

    try {
      if (ob.createNewFile()) {           // Try to create the file
        System.out.println("File created: " + ob.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred."+e);
    }
     if (ob.exists()) {
      System.out.println("File name: " + ob.getName());
      System.out.println("Absolute path: " + ob.getAbsolutePath());
      System.out.println("Writeable: " + ob.canWrite());
      System.out.println("Readable " + ob.canRead());
      System.out.println("File size in bytes " + ob.length());
      if(ob.isDirectory())
        System.out.println("filename is directory");
      else 
        System.out.println("filename is file");
    } else {
      System.out.println("The file does not exist.");
    }try {
        FileWriter ob1 = new FileWriter("filename.txt",true); // true for append mode
      ob1.write("Files in Java might be tricky, but it is fun enough!");
      ob1.close();  // must close manually
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
}

try (BufferedReader ob2 = new BufferedReader(new FileReader("filename.txt"))) {
      String line;
      while ((line = ob2.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }

     try (BufferedWriter ob3 = new BufferedWriter(new FileWriter("filename.txt"))) {
      ob3.write("First line");
      ob3.newLine();  // add line break
      ob3.write("Second line");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }

    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
        String text = "Hello, World!";
      output.write(text.getBytes());  // convert text to bytes and write
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
}
  }
}