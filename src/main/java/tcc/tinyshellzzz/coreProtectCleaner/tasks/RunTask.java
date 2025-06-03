package tcc.tinyshellzzz.coreProtectCleaner.tasks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RunTask {
    public static void run() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // 每分钟执行一次
        scheduler.scheduleAtFixedRate(new CoCleanTask(),
                0,
                60,
                TimeUnit.SECONDS);
    }
}
