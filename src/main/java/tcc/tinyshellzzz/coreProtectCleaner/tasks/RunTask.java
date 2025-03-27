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
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime nextRun = now.plusHours(1).withMinute(0).withSecond(0);

        Duration duration = Duration.between(now, nextRun);
        long initialDelay = duration.getSeconds();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.scheduleAtFixedRate(new UpdateLoginTime(), 0, 10, TimeUnit.SECONDS);

        // 每小时执行一次
        scheduler.scheduleAtFixedRate(new CoCleanTask(),
                initialDelay,
                TimeUnit.HOURS.toSeconds(1),
                TimeUnit.SECONDS);
    }
}
