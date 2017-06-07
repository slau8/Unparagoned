import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    public static String readFile(String textFile){
	String sOutput = "";// this is the string that holds the entire text file

	try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
		    sCurrentLine =  sCurrentLine.trim(); // gets rid of leading and ending spaces and newlines
		    sOutput += sCurrentLine;
		}

	    } catch (IOException e) {
	    e.printStackTrace();
	}

	return sOutput;
    }

    public static String[] readFileArray(String textFile){
	return readFile(textFile).split(" ");
    }


    //############# This was to test and see how the methods worked inside buffered read #########################

    /*public static void main(String[] args) {

      String[] parts; // this is an array with all the words in the input file in it separated by spaces. This means that there are still things like punctuation and capital letters in it. I don't think that this is an issue
      String sOutput = "";// this is the string that holds the entire text file
      try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
      String sCurrentLine;
      while ((sCurrentLine = br.readLine()) != null) {
      sCurrentLine =  sCurrentLine.trim();
      sOutput += sCurrentLine;
      }
      } catch (IOException e) {
      e.printStackTrace();
      }

      parts = sOutput.split(" ");

      //########### This code was to make sure that we are getting the desired output ###########
      //System.out.println(sOutput);
      //System.out.println("\n\n\n");
      //System.out.println(toString(parts));
      }*/

}
