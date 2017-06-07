import java.util.*;

public class Processor{

  public static Hashtable<String,Markov> process(int k, String[] arr){
    Hashtable<String,Markov> hash = new Hashtable<String,Markov>();
    for (int i = 0; i < arr.length - k; i++){
      String element = "";
      for (int j = 0; j < k; j++){
        element += arr[i+j] + " ";
      }
      if (!hash.containsKey(element)){
        Markov m = new Markov(element);
        hash.put(element,m);
        m.add(arr[i+k]);
      }
      else {
        hash.get(element).add(arr[i+k]);
      }
    }
    return hash;
  }

}
