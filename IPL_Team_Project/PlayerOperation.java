package IPL_Team_Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerOperation {

    PlayersDao playersDao = new PlayersDao();

    private List<Player> load() {
        List<Player> list = playersDao.getAllPlayers();
        return list == null ? new ArrayList<>() : list;
    }

  
    public List<Player> getAllPlayers() {
        return load();
    }

   
    public List<Player> getAllPlayersGivenTeamName(String teamName) {
        return load().stream()
                .filter(p -> teamName.equalsIgnoreCase(p.getTeamName()))
                .collect(Collectors.toList());
    }

   
    public List<Player> getAllBatters() {
        return getByCategory("Batsman");
    }

    
    public List<Player> getAllBattersGivenTeamName(String teamName) {
        return getByCategoryAndTeam("Batsman", teamName);
    }

  
    public List<Player> getAllBowlers() {
        return getByCategory("Bowler");
    }

  
    public List<Player> getAllBowlersGivenTeamName(String teamName) {
        return getByCategoryAndTeam("Bowler", teamName);
    }

   
    public List<Player> getAllAllRounders() {
        return getByCategory("All-Rounder");
    }

 
    public List<Player> getAllAllRoundersGivenTeamName(String teamName) {
        return getByCategoryAndTeam("All-Rounder", teamName);
    }

   
    public List<Player> getAllWicketKeepers() {
        return getByCategory("Wicket-Keeper");
    }

   
    public List<Player> getAllWicketKeepersGivenTeamName(String teamName) {
        return getByCategoryAndTeam("Wicket-Keeper", teamName);
    }

   
    public Player getPlayerById(int id) {
        return load().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    
    public List<Player> searchPlayerByName(String keyword) {
        return load().stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

  
    public Player getTopScorer() {
        return load().stream().max(Comparator.comparingInt(Player::getRun)).orElse(null);
    }

    // 14
    public Player getTopScorerGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).stream()
                .max(Comparator.comparingInt(Player::getRun)).orElse(null);
    }

   
    public Player getTopWicketTaker() {
        return load().stream().max(Comparator.comparingInt(Player::getWicket)).orElse(null);
    }

    
    public Player getTopWicketTakerGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).stream()
                .max(Comparator.comparingInt(Player::getWicket)).orElse(null);
    }

 
    public Player getPlayerWithMostCatches() {
        return load().stream().max(Comparator.comparingInt(Player::getCatchCount)).orElse(null);
    }

    
    public List<Player> getPlayersWithRunsAbove(int runs) {
        return load().stream().filter(p -> p.getRun() > runs).collect(Collectors.toList());
    }

    
    public List<Player> getPlayersWithWicketsAbove(int wickets) {
        return load().stream().filter(p -> p.getWicket() > wickets).collect(Collectors.toList());
    }

    
    public List<Player> getPlayersWithCatchesAbove(int catches) {
        return load().stream().filter(p -> p.getCatchCount() > catches).collect(Collectors.toList());
    }

    
    public List<Player> getPlayersSortedByRunsDesc() {
        return load().stream()
                .sorted(Comparator.comparingInt(Player::getRun).reversed())
                .collect(Collectors.toList());
    }

    
    public List<Player> getPlayersSortedByWicketsDesc() {
        return load().stream()
                .sorted(Comparator.comparingInt(Player::getWicket).reversed())
                .collect(Collectors.toList());
    }

    
    public List<Player> getPlayersSortedByNameAsc() {
        return load().stream()
                .sorted(Comparator.comparing(Player::getName))
                .collect(Collectors.toList());
    }

    
    public int getTotalRunsGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).stream().mapToInt(Player::getRun).sum();
    }

    
    public int getTotalWicketsGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).stream().mapToInt(Player::getWicket).sum();
    }

    
    public long getPlayerCountGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).size();
    }

    
    public List<String> getAllTeamNames() {
        return load().stream().map(Player::getTeamName).distinct().collect(Collectors.toList());
    }

    
    public List<Player> getPlayersByCategory(String category) {
        return getByCategory(category);
    }

    
    public double getAverageRunsGivenTeamName(String teamName) {
        return getAllPlayersGivenTeamName(teamName).stream()
                .mapToInt(Player::getRun).average().orElse(0.0);
    }

    
    public List<Player> getTopNScorers(int n) {
        return getPlayersSortedByRunsDesc().stream().limit(n).collect(Collectors.toList());
    }

    
    private List<Player> getByCategory(String category) {
        return load().stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    private List<Player> getByCategoryAndTeam(String category, String teamName) {
        return load().stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category)
                        && teamName.equalsIgnoreCase(p.getTeamName()))
                .collect(Collectors.toList());
    }
}