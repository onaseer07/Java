import java.io.BufferedReader;
import java.io.FileReader;



public class ReadFile{

 public static void main(String[] arg) throws Exception {

  BufferedReader dataFile = 
        new BufferedReader(new FileReader("data.csv"));

  String dataRow = dataFile.readLine();


  while (dataRow != null){
   String[] dataArray = dataRow.split(",");
   for (String item:dataArray) { 
      System.out.print(item + "\t"); 
   }
   System.out.println(); 
   dataRow = dataFile.readLine();
  }

  dataFile.close();


  System.out.println();

 } 
}
