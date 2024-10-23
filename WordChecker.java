import java.util.ArrayList;
public class WordChecker {
    public WordChecker (ArrayList<String> list)
    {
        wordList = list;
        
    }
    public WordChecker () 
    {
        wordList = new ArrayList<String> ();
    }

    private ArrayList<String> wordList;

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            String after = wordList.get(i);
            String before = wordList.get(i-1);
            if (after.indexOf(before) < 0) return false;
        }
        return true;
    }
        /* to be implemented in part (a) */ 
    
     
    public ArrayList<String> createList(String target) {
        ArrayList<String> list = new ArrayList<String>();
        for(String s : wordList) {
        if(s.indexOf(target) == 0)
        list.add(s.substring(target.length()));
        }
        return list;
    }
        /* to be implemented in part (b) */ 
    ArrayList<String> words = new ArrayList<String>();

    
}