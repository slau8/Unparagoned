import java.util.*;

public class Driver{

  public static void main(String[] args){
    go();
  }

  public static void go(){
    Scanner s = new Scanner(System.in);
    String[] input = requestFile(s);
    int len = input.length;
    int k = requestK(s, len);
    Hashtable<String,Markov> hash = Processor.process(k,input);
    String [] beg = new String[k];
    for (int i = 0; i < k; i++){
      beg[i] = input[i];
    }
    String output = Generator.generate(k,hash,beg,len);
    System.out.println(output);
    System.out.println("Type N to model a new file, type END to end program.");
    String ans = s.next();
    if (ans == "N"){
      go();
    }
    else if (ans == "END"){
      return;
    }
    else{
      System.out.println("Invalid entry. Program will end.");
      return;
    }
  }

  // asks user for the file and converts it into a string
  public static String[] requestFile(Scanner s){
    System.out.println("Enter the file name: ");
    String fileName = s.next();
    String[] input = ReadFile.readFileArray(fileName);
    return input;
  }

  // asks user for constant k to process string
  public static int requestK(Scanner s, int len){
    System.out.println("Enter processing constant (a larger value will decrease variable): ");
    int k = s.nextInt();
    // check size of k
    while (k > len){
     System.out.println("Constant exceeds text length. Enter another processing constant (a larger value will decrease variable): ");
     k = s.nextInt();
    }
    return k;
  }


}
