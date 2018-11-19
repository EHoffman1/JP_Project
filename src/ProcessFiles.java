

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {
    p = Paths.get("C:\\LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();

  }

  private void CreateDirectory(){
    try {
      if (Files.notExists(p)) {
        Files.createDirectory(p);
      }
    } catch (Exception ex){
          System.out.println("Problem creating directory")
    }
  }

  public void WriteFile(String emp) throws IOException(){
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(true);
    printWriter.print((int) 123);
    printWriter.print((float) 123.456);

    printWriter.printf(Locale.UK, "Text + data: %1$", 123);

    printWriter.close();

  }

  public void WriteFile(ArrayList<Product> products) throws IOException(){

  }

}
