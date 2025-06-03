package tcc.tinyshellzzz.coreProtectCleaner.services;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import tcc.tinyshellzzz.coreProtectCleaner.config.PluginConfig;

import java.io.PrintWriter;
import java.io.StringWriter;

import static tcc.tinyshellzzz.coreProtectCleaner.ObjectPool.coreProtectMapper;

public class CoCleanService {
    public void clean() {
        Thread th = new Thread(() -> {
            try {
                coreProtectMapper.delete_block_data_older_then(System.currentTimeMillis() / 1000L - 86400L * PluginConfig.clean_block_data_older_than);

                coreProtectMapper.delete_container_data_older_then(System.currentTimeMillis() / 1000L - 86400L * PluginConfig.clean_container_data_older_than);

                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[coCleaner]" + ChatColor.DARK_GREEN + "co数据库清理完成");
            } catch (RuntimeException e) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                e.printStackTrace(pw);
                String sStackTrace = sw.toString();
                Bukkit.getConsoleSender().sendMessage(net.md_5.bungee.api.ChatColor.RED + sStackTrace);
            }
        });

        th.start();
    }
}
