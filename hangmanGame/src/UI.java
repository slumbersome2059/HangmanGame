import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
    public static final String[] stages = {"H","HA","HAN","HANG","HANGM", "HANGMA","HANGMAN"};
    private BufferedReader br;
    public UI(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
    public static void printHangStage(int index){
        System.out.println(stages[index]);
    }
    public String getGuess(int index) {
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
        return s;
    }
}
