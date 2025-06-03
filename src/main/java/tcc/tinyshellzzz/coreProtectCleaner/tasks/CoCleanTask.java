package tcc.tinyshellzzz.coreProtectCleaner.tasks;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.io.PrintWriter;
import java.io.StringWriter;

import static tcc.tinyshellzzz.coreProtectCleaner.ObjectPool.coCleanService;

public class CoCleanTask implements Runnable {
    public void run() {
        try {
            coCleanService.clean();
        } catch (RuntimeException e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String sStackTrace = sw.toString();
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + sStackTrace);
        }
    }
}
