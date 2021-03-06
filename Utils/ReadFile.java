import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class ReadFile{

    public static String readFile(String textFile){
    	String sOutput = "";// this is the string that holds the entire text file
      String filePath = new File("").getAbsolutePath();
      filePath = filePath + "/Library/" + textFile + ".txt";
    	try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

    		String sCurrentLine;

    		while ((sCurrentLine = br.readLine()) != null) {
    		    sCurrentLine =  sCurrentLine.trim(); // gets rid of leading and ending spaces and newlines
    		    sOutput += sCurrentLine;
    		}

    	    } catch (IOException e) {
            return null; // returns null if not found for the Scanner to respond appropriately
          //e.printStackTrace();
    	}

    	return sOutput;
    }

    public static String[] readFileArray(String textFile){
      if (readFile(textFile) == null)
        return null; // if not a legit file, scanner will ask for another file name
	return readFile(textFile).split(" ");
    }
}
