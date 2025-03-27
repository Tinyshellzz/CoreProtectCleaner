package tcc.tinyshellzzz.coreProtectCleaner.database;

import tcc.tinyshellzzz.coreProtectCleaner.config.PluginConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlConfig {
    public static Connection connect() throws SQLException {
        String database = String.format("jdbc:mysql://%s:%s/%s", PluginConfig.co_host, PluginConfig.co_port, PluginConfig.co_database);
        Connection conn = DriverManager.getConnection(database, PluginConfig.co_user, PluginConfig.co_passwd);
        conn.setAutoCommit(false);
        return conn;
    }
}
