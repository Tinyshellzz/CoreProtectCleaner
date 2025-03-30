package tcc.tinyshellzzz.coreProtectCleaner.database;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CoreProtectMapper {
    public void delete_block_data_older_then(long time) {
        PreparedStatement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = MysqlConfig.connect();
            stmt = conn.prepareStatement("DELETE FROM co_block WHERE time<?  LIMIT 100000");
            stmt.setLong(1, time);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "CoreProtectMapper.delete_block_data_older_then:" + e.getMessage());
        } finally {
            try {
                if(stmt != null) stmt.close();
                if(rs != null) rs.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public void delete_container_data_older_then(long time) {
        PreparedStatement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = MysqlConfig.connect();
            stmt = conn.prepareStatement("DELETE FROM co_container WHERE time<? LIMIT 100000");
            stmt.setLong(1, time);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "CoreProtectMapper.delete_container_data_older_then:" + e.getMessage());
        } finally {
            try {
                if(stmt != null) stmt.close();
                if(rs != null) rs.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
            }
        }
    }
}
