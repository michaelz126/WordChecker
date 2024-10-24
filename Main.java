import java.util.ArrayList;
public class Main {
    public static void main (String[] args)
    {
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> words1 = new ArrayList<String>();
    WordChecker w = new WordChecker(words);
    WordChecker x = new WordChecker(words1);
    
    //part a
    //test case 1
    words.add("an");    
    words.add("band");
    words.add("band");
    words.add("abandon"); 
    System.out.println(words);
    System.out.println(w.isWordChain());

    //test case 2
    words1.add("to");
    words1.add("too");
    words1.add("stool");
    words1.add("tools"); 
    System.out.println(words1);
    System.out.println(x.isWordChain());
    
    //part b
    ArrayList<String> cat = new ArrayList<String>();
    WordChecker b = new WordChecker(cat);
    cat.add("catch");
    cat.add("bobcat");
    cat.add("catchacat");
    cat.add("cat");
    cat.add("at");

    System.out.println(b.createList("cat"));
    System.out.println(b.createList("catch"));
    System.out.println(b.createList("dog"));
    
    }
}