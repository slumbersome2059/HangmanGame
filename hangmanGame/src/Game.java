public class Game {
    private int failure, success;
    private UI ui;
    private Word word;
    public Game(){
        failure = 0;
        success = 0;
        word = new Word();
        ui = new UI(word.getWord().length());
    }
    public void play(){
        while (failure < UI.stages.length && success < word.getWord().length()){
            char l = ui.getGuess();
            int ind = word.contains(l);
            if(ind != -1){
                ui.printOut(ind, word.getLetter(ind));
                success += 1;
            }
            else{
                ui.printHangStage(failure);
                failure += 1;
            }
        }
        if(failure >= UI.stages.length){
            System.out.println("Correct word is " + word.getWord());
        }
    }
}
