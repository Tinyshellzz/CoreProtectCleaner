package tcc.tinyshellzzz.coreProtectCleaner;

import tcc.tinyshellzzz.coreProtectCleaner.config.PluginConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tcc.tinyshellzzz.coreProtectCleaner.database.CoreProtectMapper;
import tcc.tinyshellzzz.coreProtectCleaner.services.CoCleanService;
import tcc.tinyshellzzz.coreProtectCleaner.tasks.RunTask;


public class CoreProtectCleaner extends JavaPlugin {

    @Override
    public void onEnable() {
        // team,启动！
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.AQUA + "######################");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.AQUA + "#                    #");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.AQUA + "#CoreProtectCleaner启动#");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.AQUA + "#                    #");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.AQUA + "######################");

        init();
        register();

        // 运行定时任务
        RunTask.run();
    }

    public void init(){
        ObjectPool.plugin = this;
        PluginConfig.reload();

        ObjectPool.coreProtectMapper = new CoreProtectMapper();
        ObjectPool.coCleanService = new CoCleanService();
    }

    public void register() {
        // 注册监听器

        // 注册命令

    }

    @Override
    public void onDisable() {
        //TODO
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.RED + "######################");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.RED + "#                    #");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.RED + "#CoreProtectCleaner关闭#");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.RED + "#                    #");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[coCleaner]" + ChatColor.RED + "######################");
    }

}