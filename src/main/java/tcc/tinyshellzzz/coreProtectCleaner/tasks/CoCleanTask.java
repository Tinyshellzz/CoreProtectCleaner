package tcc.tinyshellzzz.coreProtectCleaner.tasks;

import org.bukkit.Bukkit;

import static tcc.tinyshellzzz.coreProtectCleaner.ObjectPool.coCleanService;

public class CoCleanTask implements Runnable {
    public void run() {
        coCleanService.clean();
    }
}
