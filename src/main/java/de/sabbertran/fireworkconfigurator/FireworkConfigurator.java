package de.sabbertran.fireworkconfigurator;

import de.sabbertran.fireworkconfigurator.commands.FireworkCommand;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
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
        
        logStart();
        
        log.info("FireworkConfigurator enabled");
    }

    @Override
    public void onDisable()
    {
        log.info("FireworkConfigurator disabled");
    }
    
    private void logStart()
    {
        try
        {
            URL url = new URL("http://sabbertran.de/plugins/fireworkconfigurator/log.php?name=" + getServer().getName() + "&ip=" + getServer().getIp() + "&port=" + getServer().getPort());
            url.openStream();
        } catch (UnknownHostException ex)
        {
            Logger.getLogger(FireworkConfigurator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(FireworkConfigurator.class.getName()).log(Level.SEVERE, null, ex);
        }
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
