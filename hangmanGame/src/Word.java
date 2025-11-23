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
    private void removeContainedLetter(int index){
        accessedIndices.add(index);
    }
    public int contains(char c){
        int i = 0;
        boolean found = false;
        while (i < wordAsArray.length && !found){
            if(!accessedIndices.contains(i)){
                found = wordAsArray[i] == c;
            }
            i += 1;
        }
        if(found){
            removeContainedLetter(i-1);
            return (i - 1);
        }else{
            return -1;
        }
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
