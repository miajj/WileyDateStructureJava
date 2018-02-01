package UsingArray;

import java.util.Arrays;

/**
 * Created by mia on 23/01/2018.
 * Class for storing high scores in an array in descending order. highest->lowest
 */

public class Scores {
    protected int maxEntry;
    protected int currentNumber;

    protected GameEntry[] entries;

    public Scores(){
        entries = new GameEntry[maxEntry];
        currentNumber = 0;
    }

    @Override
    public String toString() {
        String s = "";
        for (GameEntry entry : entries){
            s += entry + ",";
        }
        return s;
    }

    //if last GameEntry is not Null, and is bigger than e's score, we can stop immediately.
    public void add(GameEntry e){
        int newScore = e.getScore();
        if(currentNumber == maxEntry){
            if(newScore <= entries[currentNumber-1].getScore()) {
                return;
            }
        }
        else
            currentNumber ++;  //from here, current number at least 1.

        int i = currentNumber-1;
        for (; (i>=1)&&(newScore>entries[i-1].getScore()); i--)
            entries[i] = entries[i-1];
        entries[i] = e;
    }

    public GameEntry remove(int i){
        if(i < 0 || i > currentNumber-1)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = entries[i];
        for(int j = i; j<currentNumber-1;j++)
            entries[j] = entries[j+1];
        entries[currentNumber-1] = null; // not necessary.
        currentNumber--;
        return temp;
    }



    public static void main(String[] args) {
        GameEntry enM = new GameEntry("Mia",10);
        GameEntry enD = new GameEntry("Derek",8);


    }

}
