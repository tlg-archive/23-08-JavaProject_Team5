package net.retrogame;

public class Player {
    private String name;
    private int totalGamesPlayed = 0;
    private int totalWins = 0;
    private int score = 0;
    private Tool currentTool = Tool.CLICK;

    public Player(String name) {
        this.name = name;
    }

    public void swapTool() {
        if(getCurrentTool().equals(Tool.CLICK)) {
            setCurrentTool(Tool.FLAG);
        } else if(getCurrentTool().equals(Tool.FLAG)) {
            setCurrentTool(Tool.CLICK);
        }
    }

    public int getLoses() {
        return getTotalGamesPlayed() - getTotalWins();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    private void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }

    public int getTotalWins() {
        return totalWins;
    }

    private void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool tool) {
        this.currentTool = tool;
    }

    @Override
    public String toString() {
        return String.format("%s: name=%s, totalGamesPlayed=%s, totalWins=%s, score=%s, usingFlagTool=%s",
                getClass().getSimpleName(),
                getName(),
                getTotalGamesPlayed(),
                getTotalWins(),
                getScore(),
                getCurrentTool());
    }
}
