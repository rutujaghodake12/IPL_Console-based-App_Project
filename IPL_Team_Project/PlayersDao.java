package IPL_Team_Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayersDao {

  
    public List<Player> getAllPlayers() {
        List<Player> allPlayers = new ArrayList<>();
        try (Connection con = MyDbCong.getMySQLDbConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from player")) {

            while (rs.next()) {
                Player p = new Player();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setTeamName(rs.getString(3));
                p.setCategory(rs.getString(4));
                p.setRun(rs.getInt(5));
                p.setCatchCount(rs.getInt(6));
                p.setWicket(rs.getInt(7));
                allPlayers.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allPlayers;
    }
}