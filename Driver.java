java.util.Scanner;

public class Driver{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the file name: ")
    String fileName = s.next();
    String input = readFile(fileName);
    // does readFile check to see if fileName exists?
    int len = input.length();
    System.out.println("Enter processing constant (a larger value will decrease variable): ";
    int k = s.nextInt();
    
    // check size of k
    
    // process into hash
    
    // creates an array of the first k words 
    String [] beg = new String[k];
    for (int i = 0; i < k; i++){
      beg[i] = arr[i];
    }
    int len = input.length();
    String output = Generator.generate(k,hash,beg,len);
    System.out.println(output);
   
  }

}
