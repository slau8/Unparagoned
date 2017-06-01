import java.util.ArrayList;

public class Markov{
	
    private String _substring;
    private ArrayList<Markov> _array; //stores subsequent Markovs
    
    //constructor
    public Markov(String substring){
	_substring = substring;
	_array = new ArrayList<Markov>();	    
    }


    
    //accessors
	
    public ArrayList<Entry> getArray(){
	return _array;
    }

    public int getFrequency(){
	return _array.size();
    }

    public String getSubstring(){
	return _substring;
    }
	

    //mutators
	
	//adds subsequent Markovs to _
    public void add(Mark){
	return;
    }

    
    //if the key is present in the ArrayList return the index, else return -1
    //I would use indexOf, but it won't work when the frequency is greater than
    //one, so we check for the key.
    private int checkKey(ArrayList<Entry> array, Entry E2){
	int ans = 0;
	boolean test = false;
	for (Entry E : array){
	    if (E.getKey().equals(E2.getKey())){
		test = true;
		break;
	    }
	    ans++;
	}
	if (test)
	    return ans;
	return -1;
	    
    }
	    

    public void addToArray(Entry E){
	
	int present = checkKey(_array, E);
	
	if (present >= 0){
	    _array.get(present).addFrequency();
	}
	
	else
	    _array.add(E);
    }

    public String toString(){
	String output;
        output = _substring + " " + _frequency + " : ";
	for (Entry E : _array){
	    output += "\n" + E.toString();
	}
	return output;
    }
    
}
