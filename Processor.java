import java.util.Hashtable<K,V>;

public class Processor{

  public static Hashtable<K,V> process(int k, String[] arr){
    Hashtable<String,Markov> hash = new Hashtable<String,Markov>();
    for (int i = 0; i < arr.length - k; i++){
      String element;
      for (int j = 0; j < k; j++){
        element += arr[i+j];
      }
      if (!containsKey(element)){
        Markov m = new Markov(element);
        hash.put(x,m);
        m.add(arr[i+k]);
      }
      else {
        hash.get(element).add(arr[i+k]);
      }
    }
  }

}

  /*public static String generate(int k, Hashtable<K,V> hash){

  }*/
