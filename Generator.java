import java.util.Hashtable<K,V>;

public class Generator{  
  
  private static String getRandomWord(Markov m){
    // return a random word generated from the array of a given Markov
    
    //im not sure how to make it get a RANDOM element
    
  }
  
  public static String generate(int k, Hashtable<K,V> hash, String [] beginning, int length){
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
      Markov m = Hashtable.get(prevK);     //not too sure how to deal with probability here
      output[counter].getRandomWord(m);
    }
    
    
    return output;
  }
  
}
