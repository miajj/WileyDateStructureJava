package UsingArray;

/**
 * Created by mia on 23/01/2018.
 */
public class GameEntry {

    protected String name;
    protected int score;

    public GameEntry(String name, int score){
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {

    }

}
