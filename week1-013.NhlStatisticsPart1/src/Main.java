import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
//        Print the top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
//        Print the top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
//        Print the statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
//        Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
//        Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}
