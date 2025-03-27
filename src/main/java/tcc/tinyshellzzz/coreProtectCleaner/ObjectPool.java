package tcc.tinyshellzzz.coreProtectCleaner;

import com.google.gson.Gson;
import org.bukkit.plugin.Plugin;
import tcc.tinyshellzzz.coreProtectCleaner.database.CoreProtectMapper;
import tcc.tinyshellzzz.coreProtectCleaner.services.CoCleanService;

public class ObjectPool {
    public static Plugin plugin;
    public static Gson gson = new Gson();

    public static CoreProtectMapper coreProtectMapper;
    public static CoCleanService coCleanService;
}
