package de.sabbertran.fireworkconfigurator;

import de.sabbertran.fireworkconfigurator.commands.FireworkCommand;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FireworkConfigurator extends JavaPlugin
{

    private Logger log = Bukkit.getLogger();
    
    private Firework firework;
    
    private int stacksize;

    @Override
    public void onEnable()
    {
        getConfig().addDefault("FireworkConfigurator.StackSize", 1);
        getConfig().options().copyDefaults(true);
        saveConfig();
        
        stacksize = getConfig().getInt("FireworkConfigurator.StackSize");
        
        firework = new Firework(this);
        
        getServer().getPluginManager().registerEvents(new Events(this), this);
        getCommand("firework").setExecutor(new FireworkCommand(this));
        
        log.info("FireworkConfigurator enabled");
    }

    @Override
    public void onDisable()
    {
        log.info("FireworkConfigurator disabled");
    }

    public Firework getFirework()
    {
        return firework;
    }

    public int getStacksize()
    {
        return stacksize;
    }
}
