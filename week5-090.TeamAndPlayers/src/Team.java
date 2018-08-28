import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        if (this.players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

//    public int goals() {
//        return players.stream()
//                .mapToInt(Player::goals)
//                .sum();
//    }

    public int goals() {
        int total = 0;
        for (Player player : players) total += player.goals();
        return total;
    }

    public void printPlayers() {
//        players.forEach(player -> System.out.println(player));

        for (Player player : players) {
            System.out.println(
                    player.getName() + ", goals " + player.goals() + "\n"
            );
        }
    }
}
