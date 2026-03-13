import java.util.ArrayList;

public class Leaderboard {
    private int capacity;
    private ArrayList<Score>Scoreboard = new ArrayList<>();
    public Leaderboard(int capacity){
        if (Scoreboard.size() > capacity){
            for (int x = 0; x < Scoreboard.size(); x++){
                int y = Scoreboard.getFirst().getScore();
                if (Scoreboard.get(x).getScore() < y){
                    y = Scoreboard.get(x).getScore();
                }
                Scoreboard.remove(y);
            }
        }
    }
    public void addScore(String name, int score){
        Score s = new Score(name, score);
        Scoreboard.add(s);
    }
    public int getHighScore(){
        int y = 0;
        for (int x = 0; x < Scoreboard.size(); x++)
            if (Scoreboard.get(x).getScore() > y) {
                y = Scoreboard.get(x).getScore();
            }
        return y;
    }
    public int getAverageScore(){
        int y = 0;
        for (int x = 0; x < Scoreboard.size(); x++){
            y = Scoreboard.get(x).getScore() + y;
        }
        y = y / Scoreboard.size();
        return y;

    }
    public boolean break1000() {
        for (int x = 0; x < Scoreboard.size(); x++)
            if (Scoreboard.get(x).getScore() > 1000) {
                return true;
            }
        return false;
        }
    public void printLeaderboard(){
        ArrayList<Score>Ordered = new ArrayList<>();
        Ordered.add(Scoreboard.getFirst());
        for (int x = 1; x < Scoreboard.size(); x++){
            if (Ordered.getFirst().getScore()<Scoreboard.get(x).getScore()){
                Ordered.add(0,Scoreboard.get(x));
            } else if (Ordered.get(1).getScore()<Scoreboard.get(x).getScore()) {
                Ordered.add(1,Scoreboard.get(x));
            } else if (Ordered.get(2).getScore()<Scoreboard.get(x).getScore()) {
                Ordered.add(2, Scoreboard.get(x));
            } else if (Ordered.get(3).getScore()<Scoreboard.get(x).getScore()) {
                Ordered.add(3, Scoreboard.get(x));
            } else if (Ordered.get(4).getScore()<Scoreboard.get(x).getScore()) {
                Ordered.add(4, Scoreboard.get(x));
            } // Don't ask. This was the only idea I had.
        }
        for (int x = 0; x < 5; x++)
            System.out.println(Ordered.get(x));
    }
}
