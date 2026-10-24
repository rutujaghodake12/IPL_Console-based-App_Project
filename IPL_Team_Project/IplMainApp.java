package IPL_Team_Project;

import java.util.List;

public class IplMainApp {

    public static void main(String[] args) {

        System.out.println("Welcome to IPL.com");

        PlayerOperation playrsOps = new PlayerOperation();

        System.out.println("1. Get All Players All Teams  ");
        List<Player> allPlayersList = playrsOps.getAllPlayers();
        allPlayersList.forEach(System.out::println);

        System.out.println("\n2. Get All Players of given TeamName  ");
        List<Player> allPlayersGivenTeamName = playrsOps.getAllPlayersGivenTeamName("RCB");
        allPlayersGivenTeamName.forEach(System.out::println);

        System.out.println("\n3. Get All Batters of all Team  ");
        List<Player> allBatters = playrsOps.getAllBatters();
        allBatters.forEach(System.out::println);

        System.out.println("\n4. Get All Batters given TeamName ");
        List<Player> allBattersGivenTeamName = playrsOps.getAllBattersGivenTeamName("MI");
        allBattersGivenTeamName.forEach(System.out::println);

        System.out.println("\n5. Get All Bowlers of all Team  ");
        List<Player> allBowlers = playrsOps.getAllBowlers();
        allBowlers.forEach(System.out::println);

        System.out.println("\n6. Get All Bowlers given TeamName ");
        List<Player> allBowlersGivenTeamName = playrsOps.getAllBowlersGivenTeamName("RCB");
        allBowlersGivenTeamName.forEach(System.out::println);

        System.out.println("\n7. Get All All-Rounders of all Team  ");
        List<Player> allAllRounders = playrsOps.getAllAllRounders();
        allAllRounders.forEach(System.out::println);

        System.out.println("\n8. Get All All-Rounders given TeamName ");
        List<Player> allAllRoundersGivenTeamName = playrsOps.getAllAllRoundersGivenTeamName("RCB");
        allAllRoundersGivenTeamName.forEach(System.out::println);

        System.out.println("\n9. Get All Wicket-Keepers of all Team  ");
        List<Player> allWicketKeepers = playrsOps.getAllWicketKeepers();
        allWicketKeepers.forEach(System.out::println);

        System.out.println("\n10. Get All Wicket-Keepers given TeamName ");
        List<Player> allWicketKeepersGivenTeamName = playrsOps.getAllWicketKeepersGivenTeamName("RCB");
        allWicketKeepersGivenTeamName.forEach(System.out::println);

        System.out.println("\n11. Get Player by Id ");
        Player playerById = playrsOps.getPlayerById(9);
        System.out.println(playerById);

        System.out.println("\n12. Search Player by Name ");
        List<Player> searchedPlayers = playrsOps.searchPlayerByName("rohit");
        searchedPlayers.forEach(System.out::println);

        System.out.println("\n13. Get Top Scorer ");
        Player topScorer = playrsOps.getTopScorer();
        System.out.println(topScorer);

        System.out.println("\n14. Get Top Scorer given TeamName ");
        Player topScorerGivenTeamName = playrsOps.getTopScorerGivenTeamName("MI");
        System.out.println(topScorerGivenTeamName);

        System.out.println("\n15. Get Top Wicket Taker ");
        Player topWicketTaker = playrsOps.getTopWicketTaker();
        System.out.println(topWicketTaker);

        System.out.println("\n16. Get Top Wicket Taker given TeamName ");
        Player topWicketTakerGivenTeamName = playrsOps.getTopWicketTakerGivenTeamName("RCB");
        System.out.println(topWicketTakerGivenTeamName);

        System.out.println("\n17. Get Player with Most Catches ");
        Player mostCatches = playrsOps.getPlayerWithMostCatches();
        System.out.println(mostCatches);

        System.out.println("\n18. Get Players with Runs above 2000 ");
        List<Player> runsAbove = playrsOps.getPlayersWithRunsAbove(2000);
        runsAbove.forEach(System.out::println);

        System.out.println("\n19. Get Players with Wickets above 20 ");
        List<Player> wicketsAbove = playrsOps.getPlayersWithWicketsAbove(20);
        wicketsAbove.forEach(System.out::println);

        System.out.println("\n20. Get Players with Catches above 35 ");
        List<Player> catchesAbove = playrsOps.getPlayersWithCatchesAbove(35);
        catchesAbove.forEach(System.out::println);

        System.out.println("\n21. Get Players Sorted by Runs (Desc) ");
        List<Player> sortedByRuns = playrsOps.getPlayersSortedByRunsDesc();
        sortedByRuns.forEach(System.out::println);

        System.out.println("\n22. Get Players Sorted by Wickets (Desc) ");
        List<Player> sortedByWickets = playrsOps.getPlayersSortedByWicketsDesc();
        sortedByWickets.forEach(System.out::println);

        System.out.println("\n23. Get Players Sorted by Name (Asc) ");
        List<Player> sortedByName = playrsOps.getPlayersSortedByNameAsc();
        sortedByName.forEach(System.out::println);

        System.out.println("\n24. Get Total Runs given TeamName ");
        int totalRuns = playrsOps.getTotalRunsGivenTeamName("RCB");
        System.out.println(totalRuns);

        System.out.println("\n25. Get Total Wickets given TeamName ");
        int totalWickets = playrsOps.getTotalWicketsGivenTeamName("RCB");
        System.out.println(totalWickets);

        System.out.println("\n26. Get Player Count given TeamName ");
        long playerCount = playrsOps.getPlayerCountGivenTeamName("RCB");
        System.out.println(playerCount);

        System.out.println("\n27. Get All Team Names ");
        List<String> allTeamNames = playrsOps.getAllTeamNames();
        allTeamNames.forEach(System.out::println);

        System.out.println("\n28. Get Players by Category ");
        List<Player> playersByCategory = playrsOps.getPlayersByCategory("Bowler");
        playersByCategory.forEach(System.out::println);

        System.out.println("\n29. Get Average Runs given TeamName ");
        double averageRuns = playrsOps.getAverageRunsGivenTeamName("RCB");
        System.out.println(averageRuns);

        System.out.println("\n30. Get Top 3 Scorers ");
        List<Player> topNScorers = playrsOps.getTopNScorers(3);
        topNScorers.forEach(System.out::println);
    }
}