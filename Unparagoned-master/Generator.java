import java.util.*;

public class Generator{  
  
    private static String getRandomWord(Markov m){
	// return a random word generated from the array of a given Markov
    
	//im not sure how to make it get a RANDOM element

	int index = (int) (Math.random() * m.getFrequency());

	return m.getArray().get(index);
    
    }
  
    public static String generate(int k, Hashtable<String,Markov> hash, String [] beginning, int length){
	String [] output = new String[length];
	for (int i = 0; i < beginning.length; i++)
	    output[i] = beginning[i];
    
	//   uses previous k words to generate a random output
	for (int counter = k; counter < length; counter++){
	    int back = counter - k;
	    String prevK = "";
	    while (back < counter){
		prevK += output[back] + " ";
		back++;
	    }
	    Markov m = hash.get(prevK);     //not too sure how to deal with probability here
	    output[counter] = getRandomWord(m);
	}
    
	String end = "";
	for (String s: output)
	    end += ( s + " ");
	end = end.substring(0, end.length()-1);
		
	
	return end;
    }
  
}


