import java.util.ArrayList;
public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    //public boolean isWordChain() {}
        /* to be implemented in part (a) */ 
        public WordChecker (ArrayList<String> list)
        {
            wordList = list;
            
        }
        public WordChecker () 
        {
            wordList = new ArrayList<String> ();
        }
    
     
    //public ArrayList<String> createList(String target) {}
        /* to be implemented in part (b) */ 
    
}