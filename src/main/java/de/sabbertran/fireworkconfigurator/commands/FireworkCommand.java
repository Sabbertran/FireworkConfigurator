package de.sabbertran.fireworkconfigurator.commands;

import de.sabbertran.fireworkconfigurator.FireworkConfigurator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireworkCommand implements CommandExecutor
{
    
    private FireworkConfigurator main;
    
    public FireworkCommand(FireworkConfigurator main)
    {
        this.main = main;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if (sender instanceof Player)
        {
            Player p = (Player) sender;
            
            if (p.hasPermission("fireworkconfigurator.firework"))
            {
                main.getFirework().openFireworkMenu(p);
                return true;
            } else
            {
                p.sendMessage("You don't have permission to use this command");
                return true;
            }
        } else
        {
            sender.sendMessage("You have to be a player to use this command.");
            return true;
        }
    }
}
