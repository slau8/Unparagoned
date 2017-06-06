import java.util.Hashtable<K,V>;


public class Generator{
 

    private static String getRandomWord(Markov m){
	// return a random word generated from the array of a given Markov
    }
    
    public static String generate(int k, Hashtable<K,V> hash, String [] beginning, int length){
	String [] output = new String[length];

	

	for (int i = 0; i < beginning.length; i++)
	    output[i] = beginning[i];

	int counter = k;
	
	counter - k --> counter


	for (int i = k + 1; i < length; i++)
	    output[i] = getRandomWord(Markov m);

	return _output;
    }

}

