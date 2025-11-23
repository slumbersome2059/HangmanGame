import java.util.ArrayList;
import java.util.Random;

public class Word {
    private char[] wordAsArray;
    public static final String[] words = {"raven", "wombat", "climber", "annoyance"};
    private Random r;
    private ArrayList<Integer> accessedIndices;
    public Word(){
        r = new Random();
        int randNum = r.nextInt(0, words.length);
        wordAsArray = words[randNum].toCharArray();
    }
    public void removeContainedLetter(int index){
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
            return (i - 1);
        }else{
            return -1;
        }
    }
}
