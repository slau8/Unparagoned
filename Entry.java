//this is the entry that comes after the substring that we are analyzing
//So, in abc if we are analyzing ab, this entry would be based on c

public class Entry{

    private int _frequency; //number of times the _key appears after the substring
    private String _key; //the name (String)
    
    public Entry(String key){
	_frequency = 1;
	_key = key;
    }

    public void addFrequency(){
	_frequency++;
    }

    public int getFrequency(){
	return _frequency;
    }

    public String getKey(){
	return _key;
    }

    public String toString(){
	return _key + " " + _frequency;
    }
}
