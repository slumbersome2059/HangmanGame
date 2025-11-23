import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UI {
    public static final String[] stages = {"H","HA","HAN","HANG","HANGM", "HANGMA","HANGMAN"};
    private BufferedReader br;
    private StringBuilder out;
    public UI(int wordLength){
        br = new BufferedReader(new InputStreamReader(System.in));
        char[] t = new char[wordLength];
        Arrays.fill(t, '_');
        out = new StringBuilder(new String(t));
    }
    public void printHangStage(int index){
        System.out.println(stages[index]);
    }
    public char getGuess() {
        System.out.println("Give me your guess. Enter only one character.");
        boolean done = false;
        String s = "";
        while (!done){
            done = true;
            try{
                s = br.readLine();
                if(s.length() != 1){
                    System.out.println("Please enter one character");
                    done = false;
                }
            }catch(IOException e){
                done = false;
                System.out.println("Input problem. Try again.");
            }
        }
        return s.toLowerCase().charAt(0);
    }
    public void printOut(int index, char letter){
        out.setCharAt(index, letter);
        System.out.println(out);
    }
}
