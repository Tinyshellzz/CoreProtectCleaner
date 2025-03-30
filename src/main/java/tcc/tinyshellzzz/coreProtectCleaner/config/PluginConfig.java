package tcc.tinyshellzzz.coreProtectCleaner.config;


import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;

import static tcc.tinyshellzzz.coreProtectCleaner.ObjectPool.gson;
import static tcc.tinyshellzzz.coreProtectCleaner.ObjectPool.plugin;


public class PluginConfig {
    public static boolean debug = false;
    public static int WitherSoundRange = 128;
    public static int EnderDragonSoundRange = 128;
    private static final ConfigWrapper configWrapper = new ConfigWrapper(plugin, "config.yml");
    public static String co_host;
    public static int co_port;
    public static String co_user;
    public static String co_passwd;
    public static String co_database;
    public static int clean_block_data_older_than;
    public static int clean_container_data_older_than;
    public static List<Integer> clean_block_type;


    public static void reload() {
        configWrapper.reloadConfig(); // 重新加载配置文件

        YamlConfiguration yamlconfig = configWrapper.getConfig();
        debug = yamlconfig.getBoolean("debug");
        WitherSoundRange = yamlconfig.getInt("WitherSoundRange");
        EnderDragonSoundRange = yamlconfig.getInt("EnderDragonSoundRange");
        co_host = yamlconfig.getString("co_host");
        co_port = yamlconfig.getInt("co_port");
        co_user = yamlconfig.getString("co_user");
        co_passwd = yamlconfig.getString("co_passwd");
        co_database = yamlconfig.getString("co_database");
        clean_block_data_older_than  = yamlconfig.getInt("clean_block_data_older_than");
        clean_container_data_older_than  = yamlconfig.getInt("clean_container_data_older_than");
        clean_block_type = yamlconfig.getIntegerList("clean_block_type");
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
