import java.util.ArrayList;
import java.util.Random;

public class Word {
    private char[] wordAsArray;
    public static final String[] words = {"raven", "wombat", "climber", "annoyance", "laptop", "hierarchy", "blinking", "nonsense", "tough", "skyscraper", "overlooking" };
    private Random r;
    private ArrayList<Integer> accessedIndices;
    private int randNum;
    public Word(){
        r = new Random();
        accessedIndices = new ArrayList<>();
        randNum = r.nextInt(0, words.length);
        wordAsArray = words[randNum].toCharArray();
    }
    public int contains(char c){
        for(int i = 0; i < wordAsArray.length; i++) {
            // If the character matches AND we haven't found this specific index yet
            if(wordAsArray[i] == c && !accessedIndices.contains(i)){
                accessedIndices.add(i); // Mark this specific spot as found
                return i; // Return the index immediately
            }
        }
        return -1; // No new instances of this character found
    }
    public int getLength(){
        return wordAsArray.length;
    }
    public char getLetter(int index){
        return wordAsArray[index];
    }
    public String getWord(){
        return words[randNum];
    }
}
